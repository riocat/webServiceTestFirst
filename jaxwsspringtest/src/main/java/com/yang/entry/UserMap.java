package com.yang.entry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2017/5/23.
 */
@XmlType(name = "UserMap")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserMap {
    private String key;
    private User user;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
