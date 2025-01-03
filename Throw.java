public class Throw {
    public static int Divide(int a ,int b)throws ArithmeticException{
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
        try {
            int d=Divide(6,0);
            System.out.println(d);
        } catch (ArithmeticException e) {
           System.out.println("handled");
           e.printStackTrace();
                  }
        
    }
}
