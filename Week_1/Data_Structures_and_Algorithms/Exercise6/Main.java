package Exercise6;

public class Main {
    public static void main(String[] args) {
        // Create an array of books
        Book[] books = {
            new Book("1", "Java Programming", "John Doe"),
            new Book("2", "Python Programming", "Jane Doe"),
            new Book("3", "Java Programming", "Jim Beam"),
            new Book("4", "Data Structures", "John Smith")
        };

        // Create LibrarySearch instance for binary search
        LibrarySearch librarySearch = new LibrarySearch(books);

        // Perform binary search
        Book[] binaryResults = librarySearch.searchBooksByTitleBinary("Java Programming");
        System.out.println("Binary Search Results:");
        for (Book book : binaryResults) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
