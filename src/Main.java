public class Main {

    public static void main(String[] args) {

        try {
            checkString();
        } catch(NullPointerException | IllegalArgumentException exception) {
            System.out.println("Error data");
        } finally {
            System.out.println("Check is done");
        }

    }

    private static void checkString() {
    }
}