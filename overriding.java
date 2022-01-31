package com.sample;

class parentss {
    void properties (){
        System.out.println("take all my properties");
    }

    void marriage (){
        System.out.println("marry your uncle son");
        System.out.println("otherwise ill kill you");
    }
}

class son extends parentss{
    @Override
    void marriage(){
        System.out.println("my life my rules-dont interfere my life");
    }
}

public class overriding {
    public static void main(String[] args) {
        parentss obj1 = new son();
        obj1.marriage();
    }
}
