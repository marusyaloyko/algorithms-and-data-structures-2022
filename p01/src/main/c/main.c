#include <stdio.h>
#include <stdlib.h>
#include <memory.h>
#include <string.h>
#include <stdint.h>
#include <stdbool.h>

#define STUDENT_SIZEOF_NAME       10
#define STUDENT_SIZEOF_GROUP      10
#pragma pack(1)

struct Student {
    char name[STUDENT_SIZEOF_NAME + 1];
    char group[STUDENT_SIZEOF_GROUP + 1];
    uint16_t position;
};
#pragma pack(0)
#define STUDENT_ALLOCATE_BUFFER   (sizeof(struct Student) * 5)

struct StudentArray {
    struct Student *data;
    uint64_t data_count;
    uint64_t allocated;
};

struct StudentFS {
    FILE *fd;
    struct StudentArray stud;
};

typedef bool (StudentCallback)(struct Student *, void *ud);

bool student_add(struct StudentArray *stud,
                 char *name, char *group, uint16_t position) {
    if (0 == stud)
        return false;
    if (0 == stud->data) {
        stud->allocated = STUDENT_ALLOCATE_BUFFER;
        stud->data_count = 0;
        stud->data = calloc(stud->allocated, sizeof(char));
    } else if (stud->allocated < (stud->data_count + 1) * sizeof(struct Student)) {
        stud->allocated += STUDENT_ALLOCATE_BUFFER;
        stud->data = realloc(stud->data, stud->allocated);
    }
    strncpy(stud->data[stud->data_count].name, name, STUDENT_SIZEOF_NAME);
    strncpy(stud->data[stud->data_count].group, group, STUDENT_SIZEOF_GROUP);
    stud->data[stud->data_count].position = position;
    stud->data_count++;
    return true;
}

bool student_destroy(struct StudentArray *stud) {
    if (0 == stud)
        return false;
    if (0 != stud->data) {
        free(stud->data);
    }
    memset(stud, 0, sizeof(struct StudentArray));
    return true;
}

bool student_create(struct StudentArray *stud) {
    if (0 == stud)
        return false;
    student_destroy(stud);
    memset(stud, 0, sizeof(struct StudentArray));
    return true;
}


struct Student *student_get(struct StudentArray *stud, uint64_t it, bool *ok) {
    if (0 == stud || 0 == stud->data || 0 == stud->data_count || it >= stud->data_count) {
        if (0 != ok)
            *ok = false;
        return 0;
    }
    if (0 != ok)
        *ok = true;
    return &stud->data[it];
}

void student_it(struct StudentArray *stud, StudentCallback cb, void *ud) {
    uint64_t it;
    bool next = true, ok = false;
    if (0 == stud || 0 == cb)
        return;
    for (it = 0; it < stud->data_count && next; ++it) {
        struct Student *st = student_get(stud, it, &ok);
        if (0 == st || !ok)
            continue;
        next = (*cb)(st, ud);
    }
}

static bool student_fs_write_cb(struct Student *stud, void *ud) {
    struct StudentFS *fs = ud;
    if (0 == stud || 0 == fs)
        return false;
    fwrite(stud, sizeof(struct Student), 1, fs->fd);
    return true;
}

bool student_fs_write(const char *filename, struct StudentArray *stud) {
    struct StudentFS fs = {0, 0};

    if (0 == stud || 0 == filename)
        return false;
    fs.fd = fopen(filename, "wb");
    if (0 == fs.fd)
        return false;
    student_it(stud, student_fs_write_cb, &fs);
    fclose(fs.fd);
    return true;
}

bool student_fs_read(const char *filename, struct StudentArray *stud) {
    struct StudentFS fs = {0, 0};
    struct Student st = {.name = {0}, .group = {0}, .position = 0};

    if (0 == stud || 0 == filename)
        return false;
    fs.fd = fopen(filename, "rb");
    if (0 == fs.fd)
        return false;
    student_create(stud);
    while ((fread(&st, sizeof(struct Student), 1, fs.fd)) == 1) {
        student_add(stud, st.name, st.group, st.position);
    }
    fclose(fs.fd);
    return true;
}

static bool student_print_cb(struct Student *stud, void *ud) {
    if (0 == stud)
        return false;
    fprintf(stdout, "%03hu, %s, %s\n", stud->position, stud->group, stud->name);
    fflush(stdout);
    return true;
}

int main(int argc, char **argv) {
    struct StudentArray stud = {0, 0, 0};

    student_create(&stud);
    student_add(&stud, "Andrey", "XXX", 0);
    student_add(&stud, "Vovchik", "XXX", 1);
    student_it(&stud, student_print_cb, 0);
    student_add(&stud, "Petya", "XXX", 2);
    student_fs_write(".students.bin", &stud);
    student_fs_read(".students.bin", &stud);
    student_it(&stud, student_print_cb, 0);
    student_destroy(&stud);
    return 0;
}