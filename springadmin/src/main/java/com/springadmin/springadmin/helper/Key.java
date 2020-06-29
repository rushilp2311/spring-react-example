package com.springadmin.springadmin.helper;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.io.Serializable;


public class Key implements Serializable {

    private Long user_id;
    private Long merchant_id;
}
