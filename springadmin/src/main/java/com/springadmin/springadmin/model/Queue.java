package com.springadmin.springadmin.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.springadmin.springadmin.helper.Key;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "queue")

public class Queue {

    @EmbeddedId
    private Key id;

    @JsonFormat(pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    private Date join_time;

    public Key getId() {
        return id;
    }

    public void setId(Key id) {
        this.id = id;
    }

    public Date getjoin_time() {
        return join_time;
    }

    public void setjoin_time(Date join_time) {
        this.join_time = join_time;
    }
}
