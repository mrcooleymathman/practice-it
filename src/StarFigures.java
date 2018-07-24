public class StarFigures {
    public static void main(String[] args) {
        twoRows();
        fiveStars();

        System.out.println();

        twoRows();
        fiveStars();
        twoRows();

        System.out.println();

        oneStar(3);
        twoRows();
        fiveStars();


    }

    private static void oneStar(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("  *   ");
        }
    }

    private static void fiveStars() {
        System.out.println(" * *");
        System.out.println("  * ");
        System.out.println(" * *");
    }

    private static void twoRows() {
        System.out.println("*****");
        System.out.println("*****");
    }
}
