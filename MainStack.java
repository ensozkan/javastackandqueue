public class AhmetHasanCelikMainStack {
    public static void main(String[] args) {
        AhmetHasanCelikStack stack = new AhmetHasanCelikStack(4, 5);

        // Push some elements into each stack
        stack.push(1, 10);
        stack.push(2, 20);
        stack.push(3, 30);
        stack.push(4, 40);

        stack.display(); // Display all stacks

        // Cause overflow by adding more elements than allowed in one stack
        stack.push(1, 11);
        stack.push(1, 12);
        stack.push(1, 13);
        stack.push(1, 14);
        stack.push(1, 15); // Last allowed
        stack.push(1, 16); // Should trigger overflow

        stack.display(); // Display stacks again
    }
}
