import java.io.*;
class Fileexception{
    public static void main(String[] argv){
        BufferedReader br=null;
        BufferedWriter bw=null;
        try{
            br=new BufferedReader(new FileReader("input.txt"));
            }catch(FileNotFoundException e){
                System.out.print(e.getMessage());
                }
        
        
        try{
        
  
            bw=new BufferedWriter(new FileWriter("OUTPUT.txt"));
            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
                System.out.println(line);
                }
            br.close();
            bw.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
                }
        }
}

