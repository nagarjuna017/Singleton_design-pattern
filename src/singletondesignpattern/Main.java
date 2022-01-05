package singletondesignpattern;

public class Main {
    public static void main(String args[]){
        Singleton instance= Singleton.getOriginalCopyOfBook();
        instance.getmessage();
    }
}

