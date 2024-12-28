
    import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.util.Scanner;

public class Palindrome {

    public static  boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
        return true;
    }
    public static void main(String[] args){
//create
        File file= new File("input.txt");
        try{
            file.createNewFile();
            
           
        }catch(IOException e){
            e.printStackTrace();
            
        }
        
//write
try{
FileWriter fw=new FileWriter("input.txt");
fw.write("kuttet \nis\n very \nracecar");
fw.close();
}catch(IOException e){
    e.printStackTrace();
}
   
//read
try{
Scanner sc=new Scanner(file);
while(sc.hasNextLine()){
String s =sc.nextLine();
System.out.println(s);


     if(isPalindrome(s)){
        System.out.println("palindrome");
    }else{
        System.out.println(" not palindrome");

    }
}
sc.close();
}
     catch(FileNotFoundException e){
        e.printStackTrace();
    }
    /* 
    //delete
    
     File f=new File("input.txt");
     f.delete();
     
    }
    
    */
    }
}





