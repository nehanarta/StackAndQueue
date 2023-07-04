package com.bridglabz;

public class Stack {
    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head.next = head;

        return top;
    }

    int peek() {

        return head.data;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.println("null");

    }
}
