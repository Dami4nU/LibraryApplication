package library.app;

import library.exception.NoSuchOptionException;

public enum Option {
    EXIT(0, "Wyjście z programu"),
    ADD_BOOK(1, "Dodanie książki"),
    ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),
    PRINT_BOOKS(3, "Wyświetlanie dostępnych książek"),
    PRINT_MAGAZINES(4, "WYSWIETLANIE DOSTĘPNYCH MAGAZYNÓW");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    static Option createFromInt(int option) throws NoSuchOptionException {
        try{
            return Option.values()[option];
        } catch(ArrayIndexOutOfBoundsException e){
            throw new NoSuchOptionException("Brak opcji o id " + option);
        }

    }
}
