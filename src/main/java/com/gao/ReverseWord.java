package com.gao;

/**
 * User: wangchen
 * Date: 14/11/10
 * Time: 19:11
 * Given an input string, reverse the string word by word.
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 */
public class ReverseWord {
    public static void main(String[] args) {


        String str = "the sky is blue";

        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        String[] split = s.split(" ");

        for (int i = split.length - 1; i >=0 ; i--) {

            if (!split[i].equals("")) {

                sb.append(split[i]).append(" ");
            }
        }

        if (sb.length() > 0) {

            return sb.substring(0, sb.length() - 1);
        }
        return sb.toString();
    }
}
