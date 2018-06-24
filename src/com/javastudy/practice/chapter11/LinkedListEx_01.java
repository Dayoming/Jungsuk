package com.javastudy.practice.chapter11;

public class LinkedListEx_01 {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");

        System.out.println(a.getData());
        System.out.println(b.getData());
        System.out.println(c.getData());

        b.setPrevNode(a);
        b.setNextNode(c);
        c.setPrevNode(b);
        a.setNextNode(b);

        System.out.println(a.getPrevNode());
        System.out.println(a.getNextNode().getData());
        System.out.println(b.getPrevNode().getData());
        System.out.println(b.getNextNode().getData());
        System.out.println(c.getPrevNode().getData());
        System.out.println(c.getNextNode());

    }
}

class Node {
    String data;
    Node nextNode;
    Node prevNode;

    Node() {

    }

    Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }
}
