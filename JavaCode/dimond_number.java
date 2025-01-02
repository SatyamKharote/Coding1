public class dimond_number {
    public static void main(String[] args) {
        int n = 7;
        int noOfColumns = 1, start = 0, noOfSpaces = n / 2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }
            if (i < n / 2 + 1) {
                start = i;
                noOfSpaces--;
            } else {
                start = (n + 1) - i;
                noOfSpaces++;
            }

            for (int j = 1; j <= noOfColumns; j++) {
                int middleColumn = noOfColumns / 2 + 1;
                System.out.print(start);
                if (j < middleColumn) {
                    start--;
                } else {
                    start++;
                }
            }
            System.out.println();
            if (i < n / 2 + 1) {
                noOfColumns = noOfColumns + 2;
            } else {
                noOfColumns = noOfColumns - 2;
            }
        }

    }
}
