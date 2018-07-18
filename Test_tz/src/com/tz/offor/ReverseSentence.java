package com.tz.offor;

/**
 * create by tz on 2018-07-18
 */

/**
 * 题目描述
 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 例如，“student. a am I”。
 后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 * */
public class ReverseSentence {
    public static String ReverseSentence(String str) {
        //trim() 函数移除字符串两侧的空白字符或其他预定义字符
        if (str == null || "".equals(str.trim())) return str;
        String[] split = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length-1; i >= 0; i-- ) {
            sb.append(split[i]);
            if (i > 0) sb.append(" ");
            //System.out.println(split[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String testString = "I am a student.";
        ReverseSentence(" ");
    }

}
