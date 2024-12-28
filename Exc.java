public class Exc {
    public static int div1(int num,int den){
        if(den==0){
            throw new ArithmeticException("zero division error.....!");
        }
        return num/den;
    }
        public static int div2(int num,int den) throws ArithmeticException{
return num/den;
        }
        
        public static int div3(int num,int den){
            int result=0;

            try{
                 result=num/den;
                
            }catch(ArithmeticException e){
                e.printStackTrace();
            }finally{
                System.out.println("program exeuted");
            }
            return result;
       
        }

    
    public static void main(String[] args){
        int result;
       try{
         result =div1(5,0);
       }catch(ArithmeticException e){
        System.out.println(e.getMessage());
       }
        try{
           result= div2(7,0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
         result=div3(4,0);

}
}





    

