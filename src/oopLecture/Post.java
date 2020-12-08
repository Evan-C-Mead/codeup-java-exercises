package oopLecture;

import java.util.Date;

public class Post {

    private long id;
    private String authorName;
    private int numberOfViews;
    private String content;
    private String title;
    private Date datePublished;

    public Post(long id, String authorName, int numberOfViews, String content, String title, Date datePublished) {
        this.id = id;
        this.authorName = authorName;
        this.numberOfViews = numberOfViews;
        this.content = content;
        this.title = title;
        this.datePublished = datePublished;
    }

    public Post(String authorName, int numberOfViews, String content, String title, Date datePublished) {
        this.authorName = authorName;
        this.numberOfViews = numberOfViews;
        this.content = content;
        this.title = title;
        this.datePublished = datePublished;
    }

    public long getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public Date getDatePublished() {
        return datePublished;
    }

}
