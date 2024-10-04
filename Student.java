package app;
import java.util.Scanner;
public class Student {
    int id;
    String name;
    float c;
    float p;
    float m;
    float avg;
    Student(int id,String name,float c,float p, float m,float avg){

        this.id=id;
        this.name=name;
        this.c=c;
        this.p=p;
        this.m=m;
        this.avg=avg;
    }
    public void printdata(){
        System.out.println("id "+id);
    }
    public float findavg(){
        return  (c+m+p)/3;
    }
    class Tester{
        public static void main(String[] args) {
            Student e1=new Student;
            Scanner sc= new Scanner(System.in);
            System.out.println("enter id");
           
            int id=sc.nextInt();
            String name=sc.next();
            int c=sc.nextInt();
            int m=sc.nextInt();
            int p=sc.nextInt();
            System.out.println("avg marks is "+ findavg());
        }
    }
    
}
