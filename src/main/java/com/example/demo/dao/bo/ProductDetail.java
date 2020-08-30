package com.example.demo.dao.bo;

public class ProductDetail {
    private Integer productId;

    private String pricture1;

    private String picture2;

    private String picture3;

    private String infos;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getPricture1() {
        return pricture1;
    }

    public void setPricture1(String pricture1) {
        this.pricture1 = pricture1;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }
}