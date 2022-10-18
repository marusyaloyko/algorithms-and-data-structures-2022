package javvanine.task3;

import java.util.ArrayList;

public class Contain {

    private int n;

    private ArrayList<Student> a;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<Student> getA() {
        return a;
    }

    public void setA(ArrayList<Student> a) {
        this.a = a;
    }

    @Override
    public String toString() {
        for (Student student : a) {
            System.out.print(student);
        }
        return " ";
    }

    Contain(int n) {
        this.n = n;
        this.a = new ArrayList<Student>(n);
    }

    public void set(Student k, int n) {
        this.a.set(n, k);
    }

    public static ArrayList<Student> mergeSort(ArrayList<Student> a) {
        if (a.size() == 1) {
            return a;
        } else {
            int mid = a.size() / 2;
            ArrayList<Student> left = new ArrayList<Student>(mid);
            ArrayList<Student> right = new ArrayList<Student>(a.size() - mid);

            for (int i = 0; i < mid; i++) {
                left.add(a.get(i));
            }

            for (int i = 0; i < a.size() - mid; i++) {
                right.add(a.get(i));
            }

            left = mergeSort(left);
            right = mergeSort(right);
            merge(left, right, a);
        }
        return a;
    }

    public static void merge(ArrayList<Student> left, ArrayList<Student> right, ArrayList<Student> Input) {
        int i1 = 0;// left Index
        int i2 = 0;// right Index
        int InputIndex = 0;

        for (int i = 0; i < Input.size(); i++) {
            if (i2 >= right.size() || (i1 < left.size() && left.get(i).getGpa() <= right.get(i).getGpa())) {
                Input.set(InputIndex, left.get(i1));
                InputIndex++;
            } else {
                Input.set(InputIndex, right.get(i2));
                InputIndex++;
            }
        }

    }

    public static void main(String[] args) {

        Student a = new Student("Ivan", 2155, 60);
        Student b = new Student("Anna", 5241, 100);
        Student c = new Student("Max", 6712, 56);

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(a);
        students.add(b);
        students.add(c);

        Student a1 = new Student("John", 9423, 92);
        Student b1 = new Student("Frank", 2314, 84);
        Student c1 = new Student("Phillip", 9954, 81);

        ArrayList<Student> students1 = new ArrayList<Student>();

        students1.add(a1);
        students1.add(b1);
        students1.add(c1);

        ArrayList<Student> students3 = new ArrayList<Student>(students);
        students3.addAll(students1);

        mergeSort(students3);
        for (Student vv : students3) {
            System.out.println(vv);
        }
    }
}
