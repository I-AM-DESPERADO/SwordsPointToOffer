package com.tz.optional;

import org.jetbrains.annotations.Contract;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * create by tz on 2018-07-13
 */

public class OptionalTest1 {
    public static String getUserName (User user) {
        return Optional.ofNullable(user).map(User -> User.getUserName()).orElse("Unknown");
    }


    public static String getMapUserName(Map<String, String> map) {
        return Optional.ofNullable(map).map(map1 -> map1.get("userName")).orElse("unknowMapName");
    }

    public static void main(String[] args) {
//        User user = new User();
//        user.setUserId(1);
//        //user.setUserName("tz");
//        user.setAge(12);
//        String userName = getUserName(user);
//        System.out.println("userName = " + userName);

        Map<String,String> map = new HashMap<>();
        map.put("userId", "1");
        //map.put("userName","tz");
        String mapUserName = getMapUserName(map);
        System.out.println("MapUserName = " + mapUserName);
    }

}
