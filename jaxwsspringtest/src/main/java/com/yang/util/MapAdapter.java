package com.yang.util;

import com.yang.entry.User;
import com.yang.entry.UserMap;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2017/5/23.
 */
public class MapAdapter extends XmlAdapter<UserMap[], Map<String, User>> {
    @Override
    public Map<String, User> unmarshal(UserMap[] ums) throws Exception {
        Map<String, User> map = new HashMap<String, User>();
        for(UserMap um:ums){
            map.put(um.getKey(),um.getUser());
        }
        return map;
    }

    @Override
    public UserMap[] marshal(Map<String, User> v) throws Exception {
        UserMap[] ums = new UserMap[v.size()];
        int i = 0;
        for(String key :v.keySet()){
            UserMap um = new UserMap();
            um.setKey(key);
            um.setUser(v.get(key));
            ums[i++] = um;
        }
        return ums;
    }
}
