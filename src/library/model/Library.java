package library.model;

public class Library {
    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MAGAZINES = 1000;
    private Book[] books = new Book[MAX_BOOKS];
    private Magazine[] magazines = new Magazine[MAX_MAGAZINES];
    private int booksNumber;
    private int magazinesNumber;

    public void addBooks(Book book){
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maxymalna liczba książek została osiągnięta.");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece.");
        }
        for(int i = 0; i < booksNumber; i++){
            books[i].printInfo();
        }
    }
}
