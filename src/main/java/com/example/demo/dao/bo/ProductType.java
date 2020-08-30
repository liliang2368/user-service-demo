package com.example.demo.dao.bo;

import java.io.Serializable;
import java.util.List;

public class ProductType {
    private Integer typeId;

    private String name;

    private String info;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * POJO(VO/BO/DTO/DO)中的BO对象：
     *
       1)所有的POJO对象属性定义都用对象类型
       2)所有的POJO对象属性默认值无需指定
       3)所有的POJO对象需要提供set/get/ toString 方法
       4)所有的POJO对象都需要提供无参构造函数
       5)所有的POJO对象的构造方法不要写任何业务逻辑。

     * 此对象为业务层向外输出的一个BO对象，用于封装业务执行的结果
     * 泛型：类上定义的泛型用于约束类中属性，方法参数，方法返回值类型。
     */

    public static class PageObject<T> implements Serializable {
        private List<Object> records;
        //当前页的大小
        private  Integer pagesize;
        //当前页的总数
        private Integer count;
        //当前页面第几页
        private Integer current;
        //开始页面行数
        private Integer startindex;

        public PageObject() {
        }
        //分页查询
        public  PageObject(Integer count, Integer current, Integer PageSize, List records){
            this.count=count;
            this.current=current;
            this.pagesize=PageSize;
            this.records=records;
            this.startindex=(current-1)*PageSize;



        }

        public List<Object> getRecords() {
            return records;
        }

        public void setRecords(List<Object> records) {
            this.records = records;
        }

        public Integer getPagesize() {
            return pagesize;
        }

        public void setPagesize(Integer pagesize) {
            this.pagesize = pagesize;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getCurrent() {
            return current;
        }

        public void setCurrent(Integer current) {
            this.current = current;
        }

        public Integer getStartindex() {
            return startindex;
        }

        public void setStartindex(Integer startindex) {
            this.startindex = startindex;
        }
    }
}