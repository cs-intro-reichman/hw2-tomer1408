public class Cheers {
        public static void main(String[] args) {
            String name = args[0];
            int numerOfTimes = Integer.parseInt(args[1]);
            int nameLength = name.length();
            int i = 0;
            int y = 0;
    
            char[] charsToFind = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};
            boolean useAn = false;
    
            char firstLetter = name.charAt(0);
            for (char c : charsToFind) {
                if (Character.toUpperCase(firstLetter) == c) {
                    useAn = true;
                    break;
                }
            }
    
            while (i < nameLength) {
                char letter = name.charAt(i);
                if (useAn) {
                    System.out.println("Give me an " + letter + ": " + letter + "!");
                } else {
                    System.out.println("Give me a " + letter + ": " + letter + "!");
                }
                i++;
            }
    
            System.out.println("What does that spell?"); 
            while (y < numerOfTimes) {  
                System.out.println(name + "!!!");
                y++;
            }
        }
    }