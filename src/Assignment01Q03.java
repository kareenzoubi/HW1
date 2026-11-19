public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = 10; // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // 
        int fib1 = 1;
        int fib2 = 1;
        int current = 1;
        int numOdd = 0;
        for (int i = 0; i < x; i++){
            if(i == 0 || i == 1){
                current = 1;
            }else{
                current = fib1+fib2;
                fib1 = fib2;
                fib2 = current;
            }
            if (current % 2 != 0){numOdd++;}
            System.out.print(current);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
    
        
        
        
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
