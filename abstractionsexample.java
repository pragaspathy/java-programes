package com.sample;

abstract class car {
    abstract void engine();
    abstract void company();
    void bently(){
        System.out.println("bently car");
    }
}

    class bmw extends car{
    void engine(){
        System.out.println("bmw engine");
    }

   void company(){
        System.out.println("secret company vault");
   }
}

class benz extends car{
    void engine (){
        System.out.println("benz engine");
    }

    void company(){
        System.out.println("benz secret company vault");
    }
}

public class abstractionsexample {
    public static void main(String[] args) {
        car obj1 = new bmw();
        obj1.engine();
        obj1.company();
        obj1.bently();
    }
}
