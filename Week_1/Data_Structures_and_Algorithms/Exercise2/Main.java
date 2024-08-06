package Exercise2;

//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Manually create a sorted array of products by productId
        Product[] products = {
            new Product("001", "Product1", "CategoryA"),
            new Product("002", "Product2", "CategoryB"),
            new Product("003", "Product3", "CategoryC")
        };

        // Perform Linear Search
        System.out.println("Linear Search:");
        Product foundProductLinear = SearchUtils.linearSearch(products, "002");
        System.out.println(foundProductLinear != null ? foundProductLinear : "Product not found");

        // Perform Binary Search
        System.out.println("Binary Search:");
        Product foundProductBinary = SearchUtils.binarySearch(products, "002");
        System.out.println(foundProductBinary != null ? foundProductBinary : "Product not found");
    }
}
