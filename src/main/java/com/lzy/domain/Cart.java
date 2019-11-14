package com.lzy.domain;


import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer cartId;
  private Integer bookId;
  private Integer userId;
  private Integer bookQuantity;


  public Integer getCartId() {
    return cartId;
  }

  public void setCartId(Integer cartId) {
    this.cartId = cartId;
  }


  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public Integer getBookQuantity() {
    return bookQuantity;
  }

  public void setBookQuantity(Integer bookQuantity) {
    this.bookQuantity = bookQuantity;
  }

}
