public class Lanterns {
    public static void main(String[] args) {
        drawTrapezoid(0);
        System.out.println();

        drawTrapezoid(0);
        drawVerticalLines();
        drawTrapezoid(3);
        drawTrapezoid(0);
        System.out.println();

        drawTrapezoid(0);
        drawTrapezoid(1);
        drawVerticalLines();
        drawVerticalLines();
        drawTrapezoid(1);
        drawTrapezoid(1);

    }


    private static void drawVerticalLines() {
        System.out.println("* | | | | | *");
    }

    private static void drawTrapezoid(int option) {
        if (option == 1 || option == 0) {
            System.out.println("    *****    ");
        }
        if (option == 2 || option == 0) {
            System.out.println("  *********  ");
        }
        if (option == 3 || option == 0) {
            System.out.println("*************");
        }
    }
}
