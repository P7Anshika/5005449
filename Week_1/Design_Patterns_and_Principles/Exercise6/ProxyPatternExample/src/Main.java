public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image is not loaded yet
        image1.display();

        // Image is already loaded, so it's only displayed from cache
        image1.display();

        // Image is not loaded yet
        image2.display();
    }
}
