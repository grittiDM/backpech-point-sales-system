package com.backpech.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "suplier_id", nullable = false)
    private Suplier suplier;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private Type type;

    private String description;
    private Stock quantity;
    private BigDecimal purchasePrice;
    private BigDecimal salePrice;

    private LocalDate createDate;
    private LocalDate updateDate;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Suplier getSuplier() {
        return suplier;
    }
    public void setSuplier(Suplier suplier) {
        this.suplier = suplier;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Stock getQuantity() {
        return quantity;
    }
    public void setQuantity(Stock quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
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
