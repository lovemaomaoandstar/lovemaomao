package com.zs.study.company;

import java.util.Stack;

/**
 * 问题描述:给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
 */
public class JavaStack {

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = str.toCharArray();
        for(char charEntity : chars){
            if(stack.size() == 0){
                stack.push(charEntity);
            }else if(isValidString(stack.peek(),charEntity)){
                stack.pop();
            }else{
                stack.push(charEntity);
            }
        }
        return stack.size() == 0;
    }

    public static boolean isValidString(char a,char b) {
        return (a=='('&& b==')' || a=='['&& b==']' || a=='{'&& b=='}');
    }
}
