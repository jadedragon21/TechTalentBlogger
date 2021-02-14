package com.tts.techTalentBlogger.blogposting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {
    //Setting up the id and auto gen
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //variables
    private String title;
    private String author;
    private String blogEntry;
    //empty constructor
    public BlogPost(){}

    public BlogPost(String title, String author, String blogEntry) {
        this.title = title;
        this.author = author;
        this.blogEntry = blogEntry;
    }
    //Getters and Setters
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getBlogEntry() {return blogEntry;}
    public void setBlogEntry(String blogEntry) {this.blogEntry = blogEntry;}

    //Overrides Section

    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", blogEntry='" + blogEntry + '\'' +
                '}';
    }

    //Add in the overrides for
    // .hashcode()
    // and .equals()
}
