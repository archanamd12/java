import java.util.Scanner;
public class Rectangle {
    int l;
    int b;

    Rectangle(int l,int b){
      this.l=l;
      this.b=b;


    }
    public int area(){
        int area=l*b;
        return area;
    }
    public int perimeter(){
       int perimeter=2*(l+b);
       return perimeter;
    }
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int b=sc.nextInt();

    Rectangle r1=new Rectangle(l,b);
    System.out.println("area is "+ r1.area());
    System.out.println("perimeter is "+ r1.perimeter());

}
}








