public class Main {
    public static void main(String[] args) {

        // Step 1: Create a new char variable
        char letter = 'C';   // change this to A, B, C, D, E (or something else)

        // Step 2: Traditional switch statement with colon case labels
        switch (letter) {
            case 'A':
                System.out.println("A = Able");
                break;
            case 'B':
                System.out.println("B = Baker");
                break;
            case 'C':
                System.out.println("C = Charlie");
                break;
            case 'D':
                System.out.println("D = Dog");
                break;
            case 'E':
                System.out.println("E = Easy");
                break;
            default:
                System.out.println(letter + " = not found");
                break;
        }
    }
}