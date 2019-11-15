package com.lzy.domain;


import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "book")

public class Book {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer bookId;
  private String bookName;
  private String bookAuthor;
  private Integer bookPrice;
  private String bookContent;
  private String bookPicture;
  private Integer bookTypeId;
  private String createTime;
  @LazyCollection(LazyCollectionOption.FALSE)
  @OneToMany(mappedBy = "book")
  private List<Cart> carts = new ArrayList<>(0);
//  @ManyToMany(mappedBy = "books")
//  private List<Users> users = new ArrayList<>(0);
//
//  public List<Users> getUsers() {
//    return users;
//  }
//
//  public void setUsers(List<Users> users) {
//    this.users = users;
//  }

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


  public String getBookPicture() {
    return bookPicture;
  }

  public void setBookPicture(String bookPicture) {
    this.bookPicture = bookPicture;
  }


  public Integer getBookTypeId() {
    return bookTypeId;
  }

  public void setBookTypeId(Integer bookTypeId) {
    this.bookTypeId = bookTypeId;
  }


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


}
