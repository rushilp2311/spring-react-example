package com.springadmin.springadmin.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.springadmin.springadmin.helper.Key;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "queue")
@IdClass(Key.class)
public class Queue {

    @Id
    private Long user_id;
    @Id
    private Long merchant_id;
    @JsonFormat(pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    private Date join_time;

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

    public Date getjoin_time() {
        return join_time;
    }

    public void setjoin_time(Date join_time) {
        this.join_time = join_time;
    }
}
