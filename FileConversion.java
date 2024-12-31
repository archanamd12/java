import java.io.*;

class LowerToUpperThread extends Thread {
    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader("f1.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("f2.txt"))) {

            int character;
            while ((character = reader.read()) != -1) {
                // Write uppercase version of lowercase characters
                writer.write(Character.toUpperCase((char) character));
            }
            System.out.println("Converted lowercase to uppercase in f2.txt.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

class UpperToLowerThread extends Thread {
    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader("f1.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("f3.txt"))) {

            int character;
            while ((character = reader.read()) != -1) {
                // Write lowercase version of uppercase characters
                writer.write(Character.toLowerCase((char) character));
            }
            System.out.println("Converted uppercase to lowercase in f3.txt.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

public class FileConversion {
    public static void main(String[] args) {
        // Create and start the threads
        Thread thread1 = new LowerToUpperThread();
        Thread thread2 = new UpperToLowerThread();

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("File conversion completed.");
    }
}
