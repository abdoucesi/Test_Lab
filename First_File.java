public class Factorial {

    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
        System.out.printf("Test 1");
        System.out.printf("Test 2");
        System.out.printf("Test 3"); 
        System.out.printf("Test 4");   
        
     }
}