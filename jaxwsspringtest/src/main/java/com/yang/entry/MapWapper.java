package com.yang.entry;

import com.yang.util.MapAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Map;

/**
 * Created by ASUS on 2017/5/23.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MapWapper {

    @XmlJavaTypeAdapter(value = MapAdapter.class)
    private Map<String, User> map;

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }
}
