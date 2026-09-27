
class Library {

    String books[] = new String[10];
    int count = 0;

    void addBook(String book) {

        books[count] = book;
        count++;

        System.out.println(book + " added to library.");
    }

    void removeBook(String book) {

        for (int i = 0; i < count; i++) {

            if (books[i].equals(book)) {

                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }

                count--;

                System.out.println(book + " removed from library.");
                return;
            }
        }

        System.out.println(book + " not found.");
    }

    void displayBooks() {

        System.out.println("Books in the library:");

        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("Java");
        library.addBook("Python");
        library.addBook("Database");

        library.displayBooks();

        library.removeBook("Python");

        library.displayBooks();
    }
}
