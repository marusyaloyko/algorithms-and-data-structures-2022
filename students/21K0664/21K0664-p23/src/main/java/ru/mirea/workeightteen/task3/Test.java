package ru.mirea.workeightteen.task3;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Subtract(new Multiply(new Const(2), new Variable("x")),new Const(3)).evaluate(5));
    }
}

