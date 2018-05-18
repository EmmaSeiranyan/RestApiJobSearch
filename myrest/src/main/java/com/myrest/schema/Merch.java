package com.myrest.schema;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="merch")
public class Merch {

    @Id private org.bson.types.ObjectId id;
    private String merch;
    private int price;
    private String category;
    private String annotation;


    public String getAnnotation() {
        return annotation;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getMerch() {
        return merch;
    }

    public void setMerch(String merch) {
        this.merch = merch;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    
}
