import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryBookTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937, false));
        books.add(new Book("Clean Code", "Robert C. Martin", 2008, true));
        books.add(new Book("Atomic Habits", "James Clear", 2018, false));
        books.add(new Book("Thinking Fast and Slow", "Daniel Kahneman", 2011, true));
        books.add(new Book("Dune", "Frank Herbert", 1965, false));
        books.add(new Book("Deep Work", "Cal Newport", 2016, false));

        System.out.println("Books published after 2010:");
        for (Book b : books) {
            if (b.yearPublished > 2010) {
                System.out.println("- " + b.title + " (" + b.yearPublished + ")");
            }
        }

        System.out.println("\nAvailable books:");
        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println("- " + b.title);
            }
        }

        System.out.print("\nEnter book title to search: ");
        String searchTitle = input.nextLine();

        boolean found = false;
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(searchTitle)) {
                found = true;
                System.out.println("Book found:");
                b.displayInfo();
                System.out.print("Do you want to borrow it? ");
                String response = input.nextLine().trim().toLowerCase();
                if (response.equals("yes")) {
                    if (b.isAvailable()) {
                        b.isBorrowed = true;
                        System.out.println("- Book successfully borrowed.");
                    } else {
                        System.out.println("- Book is already borrowed.");
                    }
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }

        input.close();
    }

    static class Book {
        String title;
        String author;
        int yearPublished;
        boolean isBorrowed;

        public Book(String title, String author, int yearPublished, boolean isBorrowed) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
            this.isBorrowed = isBorrowed;
        }

        void displayInfo() {
            String status = isAvailable() ? "Available" : "Borrowed";
            System.out.println("Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", Status: " + status);
        }

        boolean isAvailable() {
            return !isBorrowed;
        }
    }
}
