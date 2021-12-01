package src.example.singleton;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Logger lg1 = new Logger();
        lg1.write();
        Logger lg2 = new Logger();
        lg2.write();
        System.out.println(lg1.equals(lg2));
    }
}
