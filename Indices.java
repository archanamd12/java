import java.util.*;
public class Indices{
    public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
    
      System.out.println("enter the number of rows and columns");
      int rows=sc.nextInt();
      int cols=sc.nextInt();
      int[][] nums=new int[rows][cols];


System.out.println("enter the number");
      for(int i=0;i<rows;i++){
        for (int j=0;j<cols;j++){
            nums[i][j]=sc.nextInt();

        }
      }
      for(int i=0;i<rows;i++){
        for (int j=0;j<cols;j++){
            System.out.print(nums[i][j]+ " ");
        }
         System.out.println();

      }
System.out.println("enter the number to search");
      int x=sc.nextInt();

      for(int i=0;i<rows;i++){
        for (int j=0;j<cols;j++){
if(nums[i][j]==x){
  System.out.print(i+1);
  System.out.print(j+1);
   
}
        }
}
    }
} 