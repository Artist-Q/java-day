package com.learn.algorithm;

/**
 * linked list data
 *
 * @author Artist-Q
 * @version 1.0, 27/03/2021
 * @since 0.2.0
 */
public class Node {

    /** 节点 值 */
    private Integer value;
    /** 下一个节点 */
    private Node next;

    public Node(Integer value, Node next) {
        this.value = value;
        this.next = next;
    }

    public static Node prepareNodeData(int size) {
        final Node head = new Node(0, null);
        Node prev = head;
        for (int i = 1; i < size; ++i) {
            final Node next = new Node(i, null);
            prev.setNext(next);
            prev = next;
        }
        return head;
    }

    public static void printLinkedList(Node head) {
        System.out.println(head);
    }

    public Integer getValue() {
        return value;
    }

    public Node setValue(Integer value) {
        this.value = value;
        return this;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return "Node{" +
            "value=" + value +
            ", next=" + next +
            '}';
    }
}
