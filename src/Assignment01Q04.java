public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        int n = array.length;

        // 1. Validate direction and trivial cases
        if ((direction != 'R' && direction != 'L') || n <= 1 || move == 0) {
            return array;
        }

        // 2. Normalize move to be within [-(n-1), n-1]
        move = move % n;

        // 3. Convert left shift to an equivalent right shift
        if (direction == 'L') {
            move = -move;
        }

        // 4. Make negative right shift positive in range [0, n-1]
        if (move < 0) {
            move += n;
        }

        if (move == 0) {
            return array;
        }

        // 5. Place each element in its shifted position using a helper copy array
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = array[i];
        }

        for (int i = 0; i < n; i++) {
            array[(i + move) % n] = copy[i];
        }

        return array;
    }
}