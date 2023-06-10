package XMLParser;

public class Book {
        public String id;
        public String title;
        public String author;
        public String isbn;

        public Book(String id, String title, String author, String isbn) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

