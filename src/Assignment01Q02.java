public class Assignment01Q02 {
    public static void main(String[] args) {
        int numOfSummands = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 0; i < numOfSummands; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                sum += term;
            } else {
                sum -= term;
            }
        }

        double piApproximation = 4.0 * sum;
        // Print both values separated by a single space (keep skeleton's print format)
        System.out.println(piApproximation + " " + Math.PI);
    }
}