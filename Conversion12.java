import java.io.*;

class Low extends Thread{
    public void run(){
try{
    BufferedReader br=new BufferedReader(new FileReader("f11.txt"));
    BufferedWriter bw=new BufferedWriter(new FileWriter("f12.txt"));
    int ch;
    while((ch=br.read())!=-1){
        if(Character.isLowerCase(ch)){
            bw.write(ch);

        }
    }
    br.close();
    bw.close();
System.out.println("succesfully wriitwn in f12");
}
catch(IOException e){
    System.out.println(" error "+e.getMessage());
    System.out.println("conversion done");
}
}
}

public class Conversion12{
    public static void main(String[] args) {
        Thread t1=new Low();
        t1.start();
    }
}

