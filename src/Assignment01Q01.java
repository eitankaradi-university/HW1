public class Assignment01Q01 {
    public static void main(String[] args) {
// Iterate over all command-line argument strings
        for (int i = 0; i < args.length; i++) {
            char firstChar = args[i].charAt(0);
// check if the ASCII value of the first character is divisible by 5
            if (firstChar % 5 == 0) {
                System.out.println(firstChar);
            }
        }
    }
}