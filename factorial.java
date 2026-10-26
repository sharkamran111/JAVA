public class factorial {
    public int recFactorial(int n){
        if (n==1) {
            return 1;
        }
        return n*recFactorial(n-1); 
    }
    public void iterFactorial(int n){
        int fact=0;
    for (int i = n; i >0; i--) {
      fact+=n*n-1;
    }
    System.out.println(fact);
    }


    public static void main(String[] args) {
        
        factorial fac =new factorial();
        System.out.println(fac.recFactorial(5));

        fac.iterFactorial(5);
        
    }
}
