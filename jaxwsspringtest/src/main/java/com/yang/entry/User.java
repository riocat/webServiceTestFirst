package com.yang.entry;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by ASUS on 2017/5/22.
 */
public class User implements Serializable {

    private int id;

    private String name;

    private Date createDate;

    public User() {
    }

    public User(int id, String name, Date time) {
        this.id = id;
        this.name = name;
        this.createDate = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
