package singletondesignpattern;

public class Singleton {
    private static Singleton originalCopyOfBook=new Singleton();
    private Singleton(){}
    public static Singleton getOriginalCopyOfBook(){
        return originalCopyOfBook;
    }
    public void getmessage(){
        System.out.println("It is the original first copy");
    }
}
