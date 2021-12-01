package src.example.singleton.implementation;

public class SingletonLogger {
    private static SingletonLogger singleInstance = new SingletonLogger();

    private SingletonLogger(){}

    public static SingletonLogger getInstance(){
        return singleInstance;
    }
    public void write(){
        System.out.println("Writing a message to the log.");
    }

}
