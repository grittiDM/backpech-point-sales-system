package com.backpech.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.backpech.entity.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "costumer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "sales_person_id", nullable = false)
    private User salesPerson;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private int quantity;
    private String payment;
    private BigDecimal discount;
    private BigDecimal total;

    private LocalDate createDate;
    private LocalDate updateDate;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCostumer() {
        return customer;
    }
    public void setCostumer(Customer customer) {
        this.customer = customer;
    }

    public User getSalesPerson() {
        return salesPerson;
    }
    public void setSalesPerson(User salesPerson) {
        this.salesPerson = salesPerson;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPayment() {
        return payment;
    }
    public void setPayment(String payment) {
        this.payment = payment;
    }

    public BigDecimal getDescount() {
        return discount;
    }
    public void setDescount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

}
