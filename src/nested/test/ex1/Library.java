package nested.test.ex1;

public class Library {
    Book[] books;
    int bookCount;

    public Library(int size) {
        books = new Book[size];
        this.bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount >= books.length) {
            return;
        }

        Book book = new Book(title, author);
        books[bookCount++] = (book);
    }

    public void showBooks() {
        for (int i = 0; i < bookCount; i++) {
            books[i].showBook();
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void showBook() {
            System.out.println((title + " by " + author));
        }
    }
}
