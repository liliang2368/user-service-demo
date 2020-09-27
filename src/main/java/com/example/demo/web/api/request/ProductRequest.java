package com.example.demo.web.api.request;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class ProductRequest {
    private String productname;
    private Integer current;
    private Integer productId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }
}
