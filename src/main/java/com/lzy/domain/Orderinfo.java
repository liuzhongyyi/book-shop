package com.lzy.domain;


import javax.persistence.*;

@Entity
@Table(name = "orderinfo")
public class Orderinfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer orderId;
  private Integer userId;
  private String createTime;
  private Integer total;
  private Integer orderState;


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  public Integer getOrderState() {
    return orderState;
  }

  public void setOrderState(Integer orderState) {
    this.orderState = orderState;
  }

}
