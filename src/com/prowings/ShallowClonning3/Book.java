package com.prowings.ShallowClonning3;

public class Book implements Cloneable{
	
	private int pages;
	private String bookName;
	private int chapters;

	public Book() {
		super();
	}

	public Book(int pages, String bookName, int chapters) {
		super();
		this.pages = pages;
		this.bookName = bookName;
		this.chapters = chapters;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		return "Book [pages=" + pages + ", bookName=" + bookName + ", chapters=" + chapters + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	

}
