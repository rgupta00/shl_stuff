package com.demo;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//hibernate POJO --> map
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

//@Cacheable
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
//@Entity
//@Table(name = "book_table_caching_2")
public class Book {
	
	private int id;
	
	
	private String isbn;
	
	
	private String title;
	
	
	private String author;
	
	
	private Date pubDate;
	
	
	private double price;
	
	private int rank;
	
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Book() {}
	
	public Book(String isbn, String title, String author, Date pubDate, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pubDate = pubDate;
		this.price = price;
	}
	public Book(int id, String isbn, String title, String author, Date pubDate, double price) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pubDate = pubDate;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", pubDate=" + pubDate
				+ ", price=" + price + "]";
	}
	
	
}
