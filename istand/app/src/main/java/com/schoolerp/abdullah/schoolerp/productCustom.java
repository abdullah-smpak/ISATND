package com.schoolerp.abdullah.schoolerp;

/**
 * Created by xdell on 12/29/2017.
 */

public class productCustom {

    String product;
    String desc;
    String price;

    public productCustom(String product, String desc, String price) {
        this.product = product;
        this.desc = desc;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public String getDesc() {
        return desc;
    }

    public String getPrice() {
        return price;
    }

}
