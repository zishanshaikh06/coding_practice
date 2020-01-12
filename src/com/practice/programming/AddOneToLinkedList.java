package com.practice.programming;

public class AddOneToLinkedList {

    public static void main(String[] args) {
        AddOneToLinkedList addOneToLinkedList = new AddOneToLinkedList();

        addOneToLinkedList.addNode(1);
        addOneToLinkedList.addNode(9);
        addOneToLinkedList.addNode(9);
        addOneToLinkedList.addNode(8);

        addOneToLinkedList.printList();

        addOneToLinkedList.addNumberToList(1);
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    ListNode head = null;

    public void reverse() {
        ListNode prev = null;
        ListNode current = head, next = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void addNumberToList(int num) {
        reverse();
        printList();

        ListNode temp = head;

        int sum = temp.val + num;

        int carry = 0;

        if (sum > 9) {
            temp.val = 0;
            carry = 1;

            temp = temp.next;

            while (temp != null) {

                sum = temp.val + carry;

                if (sum > 9) {

                    temp.val = 0;
                    carry = 1;

                } else{
                    temp.val = sum;
                }

                temp = temp.next;

            }

        } else {
            temp.val = sum;
        }

        reverse();
        printList();


    }

    public void printList() {

        ListNode n = head;

        System.out.println("");

        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }

    }

    public void addNode(int val) {

        ListNode listNode = new ListNode(val);

        if (head == null) {
            head = new ListNode(val);
            return;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new ListNode(val);
        return;


    }


}
