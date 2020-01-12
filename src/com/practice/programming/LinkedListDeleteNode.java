package com.practice.programming;

public class LinkedListDeleteNode {

    public static void main(String[] args) {
        LinkedListDeleteNode listDeleteNode = new LinkedListDeleteNode();
        listDeleteNode.addNode(4);
        listDeleteNode.addNode(5);
        listDeleteNode.addNode(1);
        listDeleteNode.addNode(9);

        listDeleteNode.printList();

        System.out.println("Length: "+ listDeleteNode.length(listDeleteNode.head));

        listDeleteNode.head = listDeleteNode.reverse(listDeleteNode.head);

        listDeleteNode.printList();

        listDeleteNode.deleteNode(listDeleteNode.getNode(1));

        listDeleteNode.printList();

        System.out.println("Length: "+ listDeleteNode.length(listDeleteNode.head));
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getNode(int val){
        return new ListNode(val);
    }

    ListNode head = null;

    public int length(ListNode temp){

        if(temp == null){
            return 0;
        }

        return 1 + length(temp.next);

    }

    public ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode current = head, next = head;

        while(current!=null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        head = prev;

        return head;
    }

    public void printList(){

        ListNode n = head;

        System.out.println("");

        while(n!=null){
            System.out.print(n.val +" ");
            n = n.next;
        }

    }

    public void deleteNode(ListNode node) {

        ListNode temp = head;

        ListNode prev = null;

        if(temp!=null && temp.val== node.val){
            head = temp.next;
        }

        while(temp!=null && temp.val!=node.val){

            prev = temp;
            temp = temp.next;

        }

        if(temp == null) return;

        prev.next = temp.next;
    }

    public void addNode(int val) {

        ListNode listNode = new ListNode(val);

        if(head == null){
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
