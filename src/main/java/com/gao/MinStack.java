package com.gao;

import java.util.ArrayList;
import java.util.List;

/**
 * User: wangchen
 * Date: 14/11/10
 * Time: 20:16
 */
public class MinStack {
    public static void main(String[] args) {


    }

    class MyStack{

        int[] list = new int[10000000];
        int index = 0;
        int size = 0;
        int minx = 0;

        public void push(int x) {

            list[index] = x;
            index++;
            size++;
            minx = 0;
        }

        public void pop() {
            list[size - 1] = 0;
        }

        public int top(){
            minx = 0;
            return list[size - 1];
        }

        public int getMin() {
            if (minx != 0)
                return minx;
            int min = list[0];
            for (int i = 1; i < list.length; i++) {
                if (min > list[i]) {
                    min = list[i];
                }
            }

            minx = min;
            return min;
        }
    }

    class Stack{

        List<Integer> list = new ArrayList<Integer>();

        public void push(int x) {
            list.add(x);
        }

        public void pop() {
            if (!list.isEmpty()) {

                list.remove(list.size() - 1);
            }
        }

        public int top() {

            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }

            return 0;
        }

        public int getMin(){

            int min = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (min > list.get(i)) {
                    min = list.get(i);
                }
            }

            return min;
        }
    }
}
