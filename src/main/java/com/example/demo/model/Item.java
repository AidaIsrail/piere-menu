package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "pierre_item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "discription")
    private String discription;

    @Column(name = "weight")
    private String weight;

    @Column(name = "price")
    private Double price;

    @Column(name = "picture")
    private String pictureUrl;

    @ManyToOne
    @JoinColumn(name = "category", nullable = false)
    private Category category;

    @Column(name = "discount")
    private double discount;


    public Item(String name, String discription, String weight, Double price, String pictureUrl, Category category, double discount) {
        this.name = name;
        this.discription = discription;
        this.weight = weight;
        this.price = price;
        this.pictureUrl = pictureUrl;
        this.category = category;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", discription='" + discription + '\'' +
                ", weight='" + weight + '\'' +
                ", price=" + price +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", category='" + category + '\'' +
                ", discount=" + discount +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
