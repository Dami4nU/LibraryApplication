package library.app;

import library.model.Book;
import library.io.DataReader;

public class LibraryApp {

    public static void main(String[] args) {
	    final String appName = "Biblioteka v0.3";
	    System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
