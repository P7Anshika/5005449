package Exercise2;

public class SearchUtils {
    // Linear search for Product in an array
    public static Product linearSearch(Product[] products, String searchId) {
        for (Product product : products) {
            if (product.getProductId().equals(searchId)) {
                return product;
            }
        }
        return null; // Product not found
    }

    // Binary search for Product in a sorted array (by productId)
    public static Product binarySearch(Product[] products, String searchId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId().equals(searchId)) {
                return products[mid];
            }
            if (products[mid].getProductId().compareTo(searchId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Product not found
    }
}
