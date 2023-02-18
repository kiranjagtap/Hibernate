package net.codejava.hibernate;


import javax.persistence.*;
/**
 * Book.java
 * This class maps to a table in database.
 * @author www.codejava.net
 *
 */
 
/*@Entity
@Table(name = "book")*/
public class Book {
    private int id;
    private String title;
    private String author;
    private float price;
 
    public Book() {
    }
 
    
    public Book(int id, String title, String author, float price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}


	/*@Id
    @Column(name = "book_id")*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public float getPrice() {
        return price;
    }
 
    public void setPrice(float price) {
        this.price = price;
    }
 
}