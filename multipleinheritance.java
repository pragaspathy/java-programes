package com.sample;

interface inter1 {
    void method1();
}

interface inter2 {
    void method2();
}

class firstclass implements inter1, inter2{
    void print(){
        System.out.println("i am winner");
    }
    @Override
    public void method1() {

    }

    void secondprint(){
        System.out.println("i am succeeded");
    }
        @Override
    public void method2() {

    }
}
public class multipleinheritance {
    public static void main(String[] args) {
        firstclass obj1 = new firstclass();
        obj1.print();
        obj1.secondprint();

    }
}
