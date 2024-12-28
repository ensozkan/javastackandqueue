public class AhmetHasanCelikMainPQueue {
    public static void main(String[] args) {
        AhmetHasanCelikPQueue pQueue = new AhmetHasanCelikPQueue(6);

        // Add elements in any order
        pQueue.add('d');
        pQueue.add('m');
        pQueue.add('t');
        pQueue.add('z');
        pQueue.add('b');

        pQueue.display(); // Display queue after adding elements

        // Remove highest priority element
        pQueue.remove();

        // Display queue after removal
        pQueue.display();
    }
}
