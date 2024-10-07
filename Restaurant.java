package bank.restaurant;
import java.util.Scanner;


public class Restaurant {
    String name;
    String add;
    int rating=0;

    Restaurant(String name,String add){
       this.name= name;
        this.add = add;
        
    }
void  updaterating(int rating1){
    this.rating=rating1;
   
while(rating!=0){
    rating=rating+rating1;
    rating=rating1;
}
}

void printdetails(){
    System.out.println(" details are"+ name + "  "+add+"  "+ rating);
}
public static void main(String[] args){
  
    Scanner sc=new Scanner(System.in);
   String name= sc.next();
     String add= sc.next();
     int rating= sc.nextInt();

     Restaurant r1=new Restaurant(name,add);
   r1.updaterating(rating);
r1.printdetails();

}
}


