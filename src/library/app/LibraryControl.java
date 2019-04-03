package library.app;

import library.io.DataReader;
import library.model.Book;
import library.model.Library;
import library.model.Magazine;

public class LibraryControl {
    // variable which lets comunicate with user
    private DataReader dataReader = new DataReader();
    // "library" keeps data
    private Library library = new Library();

    /*
        Main application method which lets choose options and make interaction
    */
    public void controlLoop(){
        Option option;

        do {
            printOptions();
            option = Option.createFromInt(dataReader.getInt());
            switch(option){
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie.");
            }
        } while (option != Option.EXIT );
    }

    private void printOptions(){
        System.out.println("Wybierz opcję: ");
        for(Option option : Option.values()) {
            System.out.println(option);
        }
    }

    private void addBook(){
        Book book = dataReader.readAndCreateBook();
        library.addBooks(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines() {
        library.printMagazines();
    }

    private void exit(){
        System.out.println("Koniec programu.");
        // close input stream
        dataReader.close();
    }

}
