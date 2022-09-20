package ru.mirea.practice.p01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Serializable;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Сериализация/Десериализация")
final class ObjectSerializerTest {

    private static final class Student implements Serializable {
        String name;
        String group;
        long position;
    }

    @DisplayName("Сериализация")
    @Test
    void serialize() throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.name = "Name1";
        student.group = "Group1";
        student.position = -1;
        byte[] serialize = ObjectSerializer.serialize(student);
        Student deserialize = ObjectSerializer.deserialize(serialize);
        assertEquals(student.name, deserialize.name);
        assertEquals(student.group, deserialize.group);
        assertEquals(student.position, deserialize.position);
    }
}