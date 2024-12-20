public class Collatz {
    public static void main(String[] args) {
        int seed = Integer.parseInt(args[0]);
        String VorC = args[1];
        char letter = VorC.charAt(0);

        if (letter == 'V' || letter == 'v') {
            for (int i = 1; i <= seed; i++) {
                int number = i;
                int steps = 0;

                System.out.print(number);

                do {
                    if (number % 2 == 0) {
                        number = number / 2;
                    } else {
                        number = number * 3 + 1;
                    }
                    System.out.print(" " + number);
                    steps++;
                } while (number != 1);

                steps++; 
                System.out.println(" (" + steps + ")");
            }
            System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
        } else {
            System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
        }
    }
}