package com.sample;

interface animaaal {
    void b();
    void c();
    void e();
    void f();
}

abstract class dog implements animaaal{
    void ce (){
        System.out.println("dog is barking");
    }
}

class cat extends dog{
    public void a(){
        System.out.println("i am A");
    }

    @Override
    public void b() {

    }

    public void c(){
        System.out.println(" i am c");
    }

    public void e(){
        System.out.println(" i am e");
    }

    public void f(){
        System.out.println(" i am e");
    }
}

public class inter_abstract_class {
    public static void main(String[] args) {

        animaaal obj1 = new cat();
        obj1.b();
        obj1.c();
        obj1.e();
        obj1.f();
    }

}
