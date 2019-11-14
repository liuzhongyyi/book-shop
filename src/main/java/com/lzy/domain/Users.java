package com.lzy.domain;


import javax.naming.Name;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;
  private String username;
  private String password;
  @ManyToMany
  @JoinTable(name = "cart",joinColumns = {@JoinColumn(name = "userId",referencedColumnName ="userId")},
          inverseJoinColumns = {@JoinColumn(name="bookId",referencedColumnName = "bookId")})
  private List<Book> books = new ArrayList<>(0);

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
