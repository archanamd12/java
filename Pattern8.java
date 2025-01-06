public class Pattern8{
    public static void main(String[] args){
int n=5;
// upper part 1 to n
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
System.out.print("*  ");
    }
    //spaces
    for(int j=1;j<=(2*(n-i));j++){
        System.out.print("   ");
    }
    
    for(int j=1;j<=i;j++){
System.out.print("*  ");
    }
    System.out.println();
}
//bottom part  n to 1

for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
System.out.print("*  ");
    }
    //spaces
    for(int j=1;j<=(2*(n-i));j++){
        System.out.print("   ");
    }
    
    for(int j=1;j<=i;j++){
System.out.print("*  ");
    }
    System.out.println();
}




    }

}
