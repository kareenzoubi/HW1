public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        /////////////////////////////////////////////
        // TODO: Fill in the Pi approxiamtion here
        int numSummands = Integer.parseInt(args[0]);
        int sign = 1;
        double denominator = 1.0;
        
        for (int i = 0; i < numSummands; i++) {
            approxPi += sign * (1.0 / denominator);
            sign *= -1; // flip sign
            denominator += 2.0; // next odd number
        }
        approxPi *= 4;
        
        
        /////////////////////////////////////////////
        
        System.out.println(approxPi + " " + actualPi);
    }
}
