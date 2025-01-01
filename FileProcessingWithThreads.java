import java.io.*;

public class FileProcessingWithThreads {
    public static void main(String[] args) {
        Thread lowercaseThread = new Thread(() -> {
            try (BufferedReader br = new BufferedReader(new FileReader("f1.txt"));
                 BufferedWriter bw = new BufferedWriter(new FileWriter("f2.txt"))) {
                int c;
                while ((c = br.read()) != -1) {
                    if (Character.isLowerCase(c)) bw.write(c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread uppercaseThread = new Thread(() -> {
            try (BufferedReader br = new BufferedReader(new FileReader("f1.txt"));
                 BufferedWriter bw = new BufferedWriter(new FileWriter("f3.txt"))) {
                int c;
                while ((c = br.read()) != -1) {
                    if (Character.isUpperCase(c)) bw.write(c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        lowercaseThread.start();
        uppercaseThread.start();
    }
}


