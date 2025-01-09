import java.util.Scanner;

public class Counting{

    public static  void printing(int d, int b, int c){
        
        System.out.println("number of positive numbers are:"+d);
        System.out.println("number of zeroes are:"+b);
        System.out.println("number of negative numbers are:"+c);
       
        return;
    }
    public static void main(String[] args){
       
        System.out.println("enter the number of number");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

int[] a=new int[n];
System.out.println("enter the numbers");
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();

}
int d=0,b=0,c=0;
for(int i=0;i<n;i++){
    if(a[i]>0){
        d++;
    }else if(a[i]==0){
        b++;
    }else{
        c++;
    }
}
printing(d,b,c);


    }
}