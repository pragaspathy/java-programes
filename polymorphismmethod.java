package com.sample;
class teacher{

}

class friends{

}

class enemy{

}

public class polymorphismmethod {
    void talk (parents speaking_style){
        System.out.println();
    }
    void talk (boss speaking_style){
        System.out.println("speaking politely");
    }
    void talk (enemy speaking_style){
        System.out.println("speaking hardely");
    }
    public static void main(String[] args) {
        polymorphismmethod talk = new polymorphismmethod();
        parents paren = new parents();
        talk.talk(paren);
        boss bossde = new boss();
        talk.talk(bossde);
        enemy kill = new enemy();
        talk.talk(kill);
    }
}