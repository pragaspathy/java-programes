package com.sample;
interface dhanasekar{
    void father ();
}

    class motherclass implements dhanasekar {
        void mother() {
            System.out.println("she is my mother");
        }

        @Override
        public void father() {

        }
    }


    class sisterclass implements dhanasekar{
        void sister(){
            System.out.println("she is my sister");
        }

        @Override
        public void father() {

        }
    }

    public class Main {

        public static void main(String[] args) {
            // write your code here
            dhanasekar obj1 = new sisterclass();

        }
    }
