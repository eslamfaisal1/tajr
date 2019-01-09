package com.greyeg.tajr.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllProducts {

    @SerializedName("code")
    @Expose
    private String code;

    @SerializedName("info")
    @Expose
    private String info;

    @SerializedName("products_count")
    @Expose
    private int products_count;

    @SerializedName("products")
    @Expose
    private List<ProductData> products;

    public AllProducts() {
    }

    public List<ProductData> getProducts() {
        return products;
    }

    public void setProducts(List<ProductData> products) {
        this.products = products;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }

    public int getProducts_count() {
        return products_count;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setProducts_count(int products_count) {
        this.products_count = products_count;
    }
}
