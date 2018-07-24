public class EggStop {
    public static void main(String[] args) {
        drawTop();
        drawBottom();
        System.out.println();

        drawTop();
        drawBottom();
        drawLine();
        System.out.println();

        drawTop();
        drawStop();
        drawBottom();
        drawLine();
    }

    private static void drawStop() {
        System.out.println("|  STOP  |");
    }

    private static void drawLine() {
        System.out.println("+--------+");
    }

    private static void drawBottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    private static void drawTop() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

}
