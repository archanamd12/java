package banks;
import java.util.Scanner;

public class Bankacc {
    int acc_no;
    String name;
    float bal;
    float amt;

    Bankacc(int acc_no,String name,float bal){

        this.acc_no=acc_no;
        this.name=name;
        this.bal=bal;

    }
    public void deposit(float amt){
        bal=bal+amt;
    }

    public void withdraw(float amt){
        if(bal>=amt +5000){
            System.out.println("withdraw possible");
            bal=bal-amt;

        }
        else{
            System.out.println("withdraw not possible");
        }
    }

    public  float bal(){
        return bal;
    }
    public static void main(String[] args){

Bankacc b1=new Bankacc(1234,"archana",100);
Scanner sc=new Scanner(System.in);
System.out.println("enter deposit");
float amt=sc.nextInt();
b1.deposit(amt);
b1.withdraw(1000);

System.out.println(" remaing amount is "+b1.bal());

    }
}
