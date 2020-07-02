package com.springadmin.springadmin.helper;


import javax.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Key implements Serializable {

    private Long user_id;
    private Long merchant_id;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(Long merchant_id) {
        this.merchant_id = merchant_id;
    }
}
