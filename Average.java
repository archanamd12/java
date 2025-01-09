import java.util.Scanner;

public class Average {
   
    public static void average(int a,int b, int c){
        float d;
d=(a+b+c)/3.0f;
System.out.println("average is "+d);
return;
 }
   
    public static void main(String[] args){

        int a,b,c;
        
    
Scanner sc= new Scanner(System.in);
     a=sc.nextInt();
     b=sc.nextInt();
    c=sc.nextInt();
     
    
    average(a,b,c);

    }

   } 

