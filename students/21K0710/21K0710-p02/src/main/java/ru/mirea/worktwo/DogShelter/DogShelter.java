package ru.mirea.worktwo.DogShelter;

public class DogShelter {
    private int N;
    Dog arrDog[];

    public DogShelter(int n) {
        N = n;
        arrDog = new Dog[N];
    }
    public void allDogs(){
        for (int i = 0; i < N; i++){
            System.out.println(arrDog[i]);
        }
    }
    int cur = 0;
    public void addDogs(Dog a){
        if (cur < N) {
            arrDog[cur] = a;
            cur += 1;
        }
    }
    public void addDogs(Dog a, Dog b){
        if (cur < N) {
            arrDog[cur] = a;
            cur += 1;
        }
        if (cur < N) {
            arrDog[cur] = b;
            cur += 1;
        }
    }
    public void addDogs(Dog a, Dog b, Dog c){
        if (cur < N) {
            arrDog[cur] = a;
            cur += 1;
        }
        if (cur < N) {
            arrDog[cur] = b;
            cur += 1;
        }
        if (cur < N) {
            arrDog[cur] = c;
            cur += 1;
        }
    }
    public void addDogs(Dog a, Dog b, Dog c, Dog d){
        if (cur < N) {
            arrDog[cur] = a;
            cur += 1;
        }
        if (cur < N) {
            arrDog[cur] = b;
            cur += 1;
        }
        if (cur < N) {
            arrDog[cur] = c;
            cur += 1;
        }
        if (cur < N) {
            arrDog[cur] = d;
            cur += 1;
        }
    }
    public void addDogs(Dog a, Dog b, Dog c, Dog d, Dog e){
        if (cur < N) {
            arrDog[cur] = a;
            cur += 1;
        }
        if (cur < N) {
            arrDog[cur] = b;
            cur += 1;
        }
        if (cur < N) {
            arrDog[cur] = c;
            cur += 1;
        }
        if (cur < N) {
            arrDog[cur] = d;
            cur += 1;
        }
        if (cur < N) {
            arrDog[cur] = e;
            cur += 1;
        }
    }
}
