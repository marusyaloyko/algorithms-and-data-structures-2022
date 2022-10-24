package ru.mirea.practice.work4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main implements Comparable<Main>{

    int number;
    public int getNumber(){
        return this.number;
    }
    Main(int number){
        this.number=number;
    }

    public static void main(String[] args) {
        List<Main> list= new ArrayList<Main>();
        list.add(new Main(8));
        list.add(new Main(1));
        list.add(new Main(4));
        list.add(new Main(4));
        list.add(new Main(1));

        //Collections.sort(list);

        for(Main sortingStudentsByGPA:list){
            //System.out.println(list.getNumber());
        }
    }
    @Override
    public int compareTo(Main o) {
        if(number==o.getNumber()){
            return 0;
        }
        if(number<o.getNumber()){
            return 1;
        }
        return -1;
    }
}
