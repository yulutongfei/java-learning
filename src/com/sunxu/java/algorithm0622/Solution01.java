package com.sunxu.java.algorithm0622;

import java.util.Objects;
import java.util.Stack;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/22 23:51
 */
public class Solution01 {

    public static void main(String[] args) {
        assert false;
        UnitTest.run();
    }

    public boolean isValid(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (str.length() % 2 == 1) {
            return false;
        }
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Objects.equals(c, '(')) {
                characters.push(c);
            }
            if (Objects.equals(c, ')')) {
                characters.pop();
            }
        }
        return characters.isEmpty();
    }
}

class UnitTest {
    private
    static Solution01 solution = new Solution01();

    public
    static void testEmptyString() {
        assert solution.isValid(null);
        assert solution.isValid("");
    }

    public
    static void testSingleChar() {
        assert !solution.isValid("(");
        assert !solution.isValid(")");
    }

    public
    static void testTwoChars() {
        assert solution.isValid("()");
        assert !solution.isValid("((");
        assert !solution.isValid("))");
        assert !solution.isValid(")(");
    }

    public
    static void test3Chars() {
        assert !solution.isValid("())");
        assert !solution.isValid("(((");
        assert !solution.isValid(")))");
        assert !solution.isValid(")()");
    }

    public
    static void test4Chars() {
        assert solution.isValid("()()");
        assert solution.isValid("(())");
        assert !solution.isValid("))((");
    }

    public
    static void testOther() {
        assert solution.isValid("()()()");
        assert solution.isValid("((()))");
        assert solution.isValid("()(())");
        assert !solution.isValid("()(()(");
    }

    public
    static void run() {
        testEmptyString();
        testSingleChar();
        testTwoChars();
        test3Chars();
        test4Chars();
        System.out.println("test over");
    }
}
