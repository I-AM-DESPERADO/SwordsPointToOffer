package com.tz.offor;

/**
 * create by tz on 2018-07-16
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * */
public class FirstNotRepeatingChar {
//    public int FirstNotRepeatingChar(String str) {
//        if (str.length() < 1 || "".equals(str)) return 0;
//        char[] chars = str.toCharArray();
//        int[] a = new int['z' + 1];
//        for (char m : chars) {
//            a[m]++;
//        }
//        for (int i = 0; i < chars.length; i++) {
//            if (a[chars[i]] == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static int FirstNotRepeatingChar(String str) {
//        if (str.length()<1 || str == null) return -1;
//        List<Character> characterList = new ArrayList<Character>();
//        List<Character> deleteList = new ArrayList<Character>();
//        for (int i = 0; i < str.length(); i++ ) {
//            Character ch = str.charAt(i);
//            if (!characterList.contains(ch)) {
//                //System.out.println(ch);
//                characterList.add(ch);
//
//            } else {
//                deleteList.add(ch);
//                }
//            characterList.removeAll(deleteList);
//        }
////        for (Character d : characterList) {
////            System.out.println(d);
////        }
//        //System.out.println(characterList.get(0));
//        if (characterList.size() > 0) return str.indexOf(characterList.get(0));
//        else return  -1;
//    }

    public static int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i<str.length(); i++) {
            Character c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c,1);
            }else {
                int mm =map.get(c);
                mm++;
                map.put(c, mm);
            }
        }
        for (int i = 0; i<str.length(); i++) {
            char c=str.charAt(i);
            if(map.get(c)==1) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        String a = "googgle";
        int result = FirstNotRepeatingChar(a);
    }
}
