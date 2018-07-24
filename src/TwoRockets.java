public class TwoRockets {
    public static void main(String[] args) {
        // Draw a cone x2
        drawCone();
        // Draw a Rectangle x2
        drawRectangle();
        // Draw a Rectangle with United States in it x2
        drawRectangleUS();
        // Draw a Rectangle x2
        drawRectangle();
        // Draw a cone x2
        drawCone();

    }

    private static void drawRectangleUS() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }

    private static void drawRectangle() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    private static void drawCone() {
        System.out.println("   /\\       /\\   ");
        System.out.println("  /  \\     /  \\  ");
        System.out.println(" /    \\   /    \\ ");
    }


}
