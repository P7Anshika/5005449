package Exercise1;
//HashMap will be used to store products, where the productId serves as the key for fast search, update, and delete
import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<String, Product> inventory = new HashMap<>();

    // Add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update a product
    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        if (inventory.remove(productId) == null) {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }

    // Display all products
    public void displayProducts() {
        Product[] products = inventory.values().toArray(new Product[0]);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        inventory.addProduct(new Product("001", "Product1", 100, 10.90));
        inventory.addProduct(new Product("002", "Product2", 50, 20.45));

        System.out.println("Initial Inventory:");
        inventory.displayProducts();

        inventory.updateProduct("001", new Product("001", "Product1Updated", 120, 11.90));
        System.out.println("After Updating Product 001:");
        inventory.displayProducts();

        inventory.deleteProduct("002");
        System.out.println("After Deleting Product 002:");
        inventory.displayProducts();
    }
}
