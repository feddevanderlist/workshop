package week2.whitebox;

public class ForumPost {
    private int id;
    private String author;
    private String text;

    private double rating;

    public ForumPost(final int id, final String author, final String text) {
        this.id = id;
        this.author = author;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public double getRating() {
        return rating;
    }

    public void updateText(String text) {
        this.text = text;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
