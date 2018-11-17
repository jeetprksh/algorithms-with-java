package com.jeetprksh.algorithms.recursion;

public class Main {

    public static void main(String args[]) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.findNth(7));
        fibonacci.print(0, 1, 7);
    }
}
