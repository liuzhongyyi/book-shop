package com.lzy.domain;

import javax.persistence.*;

@Entity
@Table(name = "bookView")
public class BookView {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer bookId;
  private String bookName;
  private String bookAuthor;
  private String bookPicture;
  private Integer bookPrice;
  private String bookContent;
  private String bookTypeName;


  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public String getBookAuthor() {
    return bookAuthor;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }


  public String getBookPicture() {
    return bookPicture;
  }

  public void setBookPicture(String bookPicture) {
    this.bookPicture = bookPicture;
  }


  public Integer getBookPrice() {
    return bookPrice;
  }

  public void setBookPrice(Integer bookPrice) {
    this.bookPrice = bookPrice;
  }


  public String getBookContent() {
    return bookContent;
  }

  public void setBookContent(String bookContent) {
    this.bookContent = bookContent;
  }


  public String getBookTypeName() {
    return bookTypeName;
  }

  public void setBookTypeName(String bookTypeName) {
    this.bookTypeName = bookTypeName;
  }

}
