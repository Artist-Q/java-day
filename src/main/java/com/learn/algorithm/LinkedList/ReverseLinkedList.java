package com.learn.algorithm.LinkedList;

import com.learn.algorithm.Node;

/**
 * reversed linked list
 *
 * @author Artist-Q
 * @version 1.0, 27/03/2021
 * @since 0.2.0
 */
public class ReverseLinkedList {

    public static Node reversedLinkedList(Node head) {
        if (null == head || null == head.getNext()) {
            return head;
        }
        Node cur = head;
        Node prev = null;

        while (null != cur) {
            Node temp = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        final int size = 5;
        final Node node = Node.prepareNodeData(5);
        Node.printLinkedList(node);
        final Node reversedHead = reversedLinkedList(node);
        System.out.println(reversedHead);
    }


}
