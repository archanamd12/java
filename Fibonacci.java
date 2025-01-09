import java.util.*;
public class Fibonacci{
    public static void main (String[] args){
        int n,num=0,fib,num2=1;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n= sc.nextInt();
        
        System.out.println("series is :");
        for(int i=2;i<n;i++){
            fib=num+num2;
System.out.println(fib);
           num=num2;
           num2=fib; 
             
        }
          
    }

}