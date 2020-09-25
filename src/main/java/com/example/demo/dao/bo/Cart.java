package com.example.demo.dao.bo;

import java.util.Date;

public class Cart {
    private Integer id;

    private Integer userId;

    private Integer produceId;

    private Integer num;

    private String produceSkuname;

    private String producePicture;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProduceId() {
        return produceId;
    }

    public void setProduceId(Integer produceId) {
        this.produceId = produceId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getProduceSkuname() {
        return produceSkuname;
    }

    public void setProduceSkuname(String produceSkuname) {
        this.produceSkuname = produceSkuname;
    }

    public String getProducePicture() {
        return producePicture;
    }

    public void setProducePicture(String producePicture) {
        this.producePicture = producePicture;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}