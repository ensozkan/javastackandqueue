public class AhmetHasanCelikStack {
    private int[] stackArray;
    private int[] tops;
    private int stackSize;
    private int totalStacks;

    // Constructor to initialize the stack array and other parameters
    public AhmetHasanCelikStack(int totalStacks, int stackSize) {
        this.totalStacks = totalStacks;
        this.stackSize = stackSize;
        this.stackArray = new int[totalStacks * stackSize];
        this.tops = new int[totalStacks];
        
        // Initialize each top pointer to -1 for empty stacks
        for (int i = 0; i < totalStacks; i++) {
            tops[i] = i * stackSize - 1;
        }
    }

    // Push method for a specific stack
    public void push(int stackNum, int value) {
        if (stackNum < 1 || stackNum > totalStacks) {
            System.out.println("Invalid stack number");
            return;
        }
        stackNum -= 1; // Adjust stack number to zero-based index
        if (isFull(stackNum)) {
            System.out.println("Stack " + (stackNum + 1) + " is full (Overflow).");
        } else {
            tops[stackNum]++;
            stackArray[tops[stackNum]] = value;
            System.out.println("Pushed " + value + " to Stack " + (stackNum + 1));
        }
    }

    // Pop method for a specific stack
    public int pop(int stackNum) {
        if (stackNum < 1 || stackNum > totalStacks) {
            System.out.println("Invalid stack number");
            return -1;
        }
        stackNum -= 1; // Adjust stack number to zero-based index
        if (isEmpty(stackNum)) {
            System.out.println("Stack " + (stackNum + 1) + " is empty (Underflow).");
            return -1;
        } else {
            int value = stackArray[tops[stackNum]];
            tops[stackNum]--;
            System.out.println("Popped " + value + " from Stack " + (stackNum + 1));
            return value;
        }
    }

    // Check if a specific stack is empty
    public boolean isEmpty(int stackNum) {
        return tops[stackNum] < stackNum * stackSize;
    }

    // Check if a specific stack is full
    public boolean isFull(int stackNum) {
        return tops[stackNum] == ((stackNum + 1) * stackSize) - 1;
    }

    // Display the contents of each stack
    public void display() {
        for (int i = 0; i < totalStacks; i++) {
            System.out.print("Stack " + (i + 1) + ": ");
            if (isEmpty(i)) {
                System.out.println("Empty");
            } else {
                for (int j = i * stackSize; j <= tops[i]; j++) {
                    System.out.print(stackArray[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
