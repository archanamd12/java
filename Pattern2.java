import java.util.Scanner;

public class Pattern2{
    public static void main(String args[]){
int i=0,j=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

    for(i=0;i<=n;i++){
       for(j=0;j<i;j++){
    System.out.print("*");
            }
        System.out.println();
    }   
        }
    }
