package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "pierre_category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "picture")
    private String pictureUrl;

    public Category(){

    }

    @Override
    public String toString() {
        return "category{" +
                "pictureUrl='" + pictureUrl + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Category(String name, String pictureUrl) {
        this.name = name;
        this.pictureUrl = pictureUrl;
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

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
