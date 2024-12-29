public class Exception {
    public static void main(String[] args) {
       /*  try{
            int a=90;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
           e.printStackTrace();
        } */  
try{
    int[] m={1,2,3,4,5};
    System.out.println("mark is "+m[2]);

}catch(ArrayIndexOutOfBoundsException e){
    e.printStackTrace();
}
    }
}
