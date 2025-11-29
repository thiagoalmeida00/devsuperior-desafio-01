package com.devsuperior.desafio01.entities;

public class Order {

    private Integer code;
    private Double basic;
    private Double discount;

    public Order() { }

    public Order(Double discount, Integer code, Double basic) {
        this.discount = discount;
        this.code = code;
        this.basic = basic;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
