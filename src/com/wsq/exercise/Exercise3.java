package com.wsq.exercise;

import java.util.ArrayList;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Exercise3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(listNode.next != null){
            arrayList.add(0,listNode.val);
        }
        return arrayList;
    }
    public static void main(String[] args) {
        ListNode head = null;
        ListNode rear = null;
        head.next = null;
        rear.next = null;
        int[] ints = new int[]{1, 2, 3};
        for(int i = 0; i < 3; i++){
            ListNode listNode = new ListNode(ints[i]);
            listNode.next = rear;
            if(head.next == null){
                head.next = listNode;
            }
            rear = listNode;
        }
    }
}
