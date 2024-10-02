
import java.util.Scanner;
public class Student {
    int id;
    String name;
    float c;
    float p;
    float m;
    float avg;
    Student(int id,String name,float c,float p, float m){

        this.id=id;
        this.name=name;
        this.c=c;
        this.p=p;
        this.m=m;
       
    }
    public void printdata(){
        System.out.println("id "+id);
        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + findAvg());
    }
    public float findAvg(){
        return  (c+m+p)/3;
    }
    
        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            System.out.println("enter id:");
           
            int id=sc.nextInt();
            String name=sc.next();
            float c=sc.nextFloat();
            float m=sc.nextFloat();
            float p=sc.nextFloat();
            Student e1=new Student(id,name,c,p,m);
            System.out.println("avg marks is: "+ e1.findAvg());
            e1.printdata();
        }
    }
    

