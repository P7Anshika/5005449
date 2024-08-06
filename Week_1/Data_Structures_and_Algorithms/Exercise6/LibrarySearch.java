package Exercise6;

import java.util.ArrayList;

public class LibrarySearch {
    private Book[] books;

    public LibrarySearch(Book[] books) {
        this.books = books;
        // Sort books by title using insertion sort
        insertionSortByTitle();
    }

    // Insertion sort implementation
    private void insertionSortByTitle() {
        int n = books.length;
        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;

            // Compare and shift elements to the right
            while (j >= 0 && books[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }

    // Binary search implementation
    public Book[] searchBooksByTitleBinary(String title) {
        int left = 0;
        int right = books.length - 1;
        ArrayList<Book> result = new ArrayList<>();

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books[mid];

            int comparison = midBook.getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                // Found a match
                result.add(midBook);

                // Check left and right for additional matches
                int l = mid - 1;
                while (l >= left && books[l].getTitle().equalsIgnoreCase(title)) {
                    result.add(books[l]);
                    l--;
                }

                int r = mid + 1;
                while (r <= right && books[r].getTitle().equalsIgnoreCase(title)) {
                    result.add(books[r]);
                    r++;
                }

                break;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result.toArray(new Book[0]);
    }
}
