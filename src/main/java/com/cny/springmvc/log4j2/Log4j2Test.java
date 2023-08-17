package com.cny.springmvc.log4j2;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * @author : chennengyuan
 */
@Slf4j
public class Log4j2Test {

    public static void main(String[] args) {
        log.info("info");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        log.trace("trace");

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }


    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int left=0;
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }






}
