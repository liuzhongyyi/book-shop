package com.lzy.domain;


import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer cartId;

  @ManyToOne
  @JoinColumn(name = "bookId",referencedColumnName = "bookId")
  private Book book;


  @ManyToOne
  @JoinColumn(name = "userId",referencedColumnName = "userId")
  private Users user;

  @Column(name = "bookQuantity")
  private Integer bookQuantity;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Integer getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(Integer bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    //  private Integer bookId;
//  private Integer userId;
//  private Integer bookQuantity;
//
//
//  public Integer getCartId() {
//    return cartId;
//  }
//
//  public void setCartId(Integer cartId) {
//    this.cartId = cartId;
//  }
//
//
//  public Integer getBookId() {
//    return bookId;
//  }
//
//  public void setBookId(Integer bookId) {
//    this.bookId = bookId;
//  }
//
//
//  public Integer getUserId() {
//    return userId;
//  }
//
//  public void setUserId(Integer userId) {
//    this.userId = userId;
//  }
//
//
//  public Integer getBookQuantity() {
//    return bookQuantity;
//  }
//
//  public void setBookQuantity(Integer bookQuantity) {
//    this.bookQuantity = bookQuantity;
//  }


}
