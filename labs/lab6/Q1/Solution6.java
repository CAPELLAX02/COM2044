import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = createBook(scanner, "Book 1");
        DVD dvd1 = createDVD(scanner, "DVD 1");
        Book book2 = createBook(scanner, "Book 2");
        DVD dvd2 = createDVD(scanner, "DVD 2");

        System.out.println();
        System.out.println("Book 1 Details:");
        book1.printDetails();
        System.out.println();
        System.out.println("DVD 1 Details:");
        dvd1.printDetails();
        System.out.println();
        System.out.println("Book 2 Details:");
        book2.printDetails();
        System.out.println();
        System.out.println("DVD 2 Details:");
        dvd2.printDetails();

        scanner.close();
    }

    private static Book createBook(Scanner scanner, String label) {
        System.out.println(label + " Details:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Item Number: ");
        int itemNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Copies: ");
        int copies = Integer.parseInt(scanner.nextLine());
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.println();
        return new Book(title, year, itemNumber, copies, author, publisher);
    }

    private static DVD createDVD(Scanner scanner, String label) {
        System.out.println(label + " Details:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Item Number: ");
        int itemNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Copies: ");
        int copies = Integer.parseInt(scanner.nextLine());
        System.out.print("Director: ");
        String director = scanner.nextLine();
        System.out.print("Duration: ");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println();
        return new DVD(title, year, itemNumber, copies, director, duration);
    }
}

class Item {
    protected String title;
    protected int year;
    protected int itemNumber;
    protected int copies;

    public Item(String title, int year, int itemNumber, int copies) {
        this.title = title;
        this.year = year;
        this.itemNumber = itemNumber;
        this.copies = copies;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Item Number: " + itemNumber);
        System.out.println("Copies: " + copies);
    }
}

class Book extends Item {
    private final String author;
    private final String publisher;

    public Book(String title, int year, int itemNumber, int copies, String author, String publisher) {
        super(title, year, itemNumber, copies);
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }
}

class DVD extends Item {
    private final String director;
    private final int duration;

    public DVD(String title, int year, int itemNumber, int copies, String director, int duration) {
        super(title, year, itemNumber, copies);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
    }
}
