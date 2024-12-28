import java.io.*;

class UpperToLower extends Thread {
    
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader("f1.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("f3.txt"))) {

            int ch;
            while ((ch = br.read())!= -1) {
                bw.write(Character.toLowerCase((char) ch));
            }
            System.out.println("Successfully converted uppercase to lowercase in f3.txt");

        } catch (IOException e) {
            System.out.println("Error during conversion to lowercase: " + e.getMessage());
        }
    }
}

class LowerToUpper extends Thread {
   
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader("f1.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("f2.txt"))) {

            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toUpperCase((char) ch));
            }
            System.out.println("Successfully converted lowercase to uppercase in f2.txt");

        } catch (IOException e) {
            System.out.println("Error during conversion to uppercase: " + e.getMessage());
        }
    }
}

public class Conversion {
    public static void main(String[] args) {
        Thread t1 = new UpperToLower();
        Thread t2 = new LowerToUpper();

        t1.start();
        t2.start();
    }
}
