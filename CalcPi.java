public class CalcPi {
    public static void main(String[] args) {
        int numberOfTerms = Integer.parseInt(args[0]); 
        double piApproximated = 0.0; 
        int i = 1; 
        boolean plusOrMinus = true;

        while (i < numberOfTerms * 2) { 
            if (plusOrMinus) {
                piApproximated += (1.0 / i); 
            } else {
                piApproximated -= (1.0 / i); 
            }
            plusOrMinus = !plusOrMinus; 
            i += 2; 
        }

        piApproximated *= 4; 
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + piApproximated);
    }
}