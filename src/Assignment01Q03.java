public class Assignment01Q03 {
    public static void main(String[] args) {
        int numOfOdd = 0;
        int n = Integer.parseInt(args[0]);

        // *** your code goes here below ***
        System.out.println("The first " + n + " Fibonacci numbers are:");

        int prev = 1;
        int curr = 1;
        numOfOdd = 2; // Both first elements (1 and 1) are odd, and n >= 3

        System.out.print(prev + " " + curr);

        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            System.out.print(" " + next);
            if (next % 2 != 0) {
                numOfOdd++;
            }
            prev = curr;
            curr = next;
        }

        System.out.println();
        System.out.println("The number of odd numbers is: " + numOfOdd);
    }
}