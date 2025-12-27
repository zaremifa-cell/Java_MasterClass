public class Main {
    public static void main(String[] args) {
        int value = 1;

        String message = switch (value) {
            case 1 -> "Value is one.";
            case 2 -> "Value is not one.";
            default -> "Value is neither one nor two.";
        };

        System.out.println(message);
    }
}