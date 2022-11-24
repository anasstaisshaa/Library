public class Book {
    private String author;
    private String name;
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString() {
        return  author +  name;
    }
}
