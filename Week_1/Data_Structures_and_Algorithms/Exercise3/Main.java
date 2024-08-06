package Exercise3;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("001", "Alice", 250.00),
            new Order("002", "Bob", 150.00),
            new Order("003", "Charlie", 300.00),
            new Order("004", "David", 200.00)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Bubble Sort
        Order[] bubbleSortedOrders = orders.clone();
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        printOrders(bubbleSortedOrders);

        // Quick Sort
        Order[] quickSortedOrders = orders.clone();
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        printOrders(quickSortedOrders);
    }

    private static void printOrders(Order[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }
    }
}
