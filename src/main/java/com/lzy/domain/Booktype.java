package com.lzy.domain;


import javax.persistence.*;

  @Entity
  @Table(name = "booktype")
  public class Booktype {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer bookTypeId;
  private String bookTypeName;


  public Integer getBookTypeId() {
    return bookTypeId;
  }

  public void setBookTypeId(Integer bookTypeId) {
    this.bookTypeId = bookTypeId;
  }


  public String getBookTypeName() {
    return bookTypeName;
  }

  public void setBookTypeName(String bookTypeName) {
    this.bookTypeName = bookTypeName;
  }

}
