public class Book {
    private String name;
    private int pageCount;
    private String Author;
    private int pubDate;

    public Book(String name, int pageCount, String author, int pubDate) {
        this.name = name;
        this.pageCount = pageCount;
        Author = author;
        this.pubDate = pubDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }

}
