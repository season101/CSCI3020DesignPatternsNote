package src.example.singleton.implementation;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SingletonLogger lg1 = SingletonLogger.getInstance();
        lg1.write();
        SingletonLogger lg2 = SingletonLogger.getInstance();
        lg2.write();
        System.out.println(lg1.equals(lg2)); // Singleton case return true
    }
}
