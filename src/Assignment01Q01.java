public class Assignment01Q01 {
    public static void main(String[] args) {
        // loop through all the words in the args array
        for (int i = 0; i < args.length; i++) {
            String current = args[i];
            
            // מקרה קצה SPACE 
            if (current.length() > 0) {
                // first character
                char firstChar = current.charAt(0);
                
                //  בדיקה 
                if (firstChar % 5 == 0) {
                    System.out.println(firstChar);
                }
            }
        }
    }
}