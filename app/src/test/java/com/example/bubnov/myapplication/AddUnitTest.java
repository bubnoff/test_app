package com.example.bubnov.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddUnitTest {
    @Test
    public void countMethod() {
        Node n1 = new Node(22);
        Node n2 = new Node(11);
        Node n3 = new Node(22);

        LinkedList s_list = new LinkedList();
        s_list.addInTail(n1);
        s_list.addInTail(n2);
        s_list.addInTail(n3);
        assertEquals(3, s_list.count());
    }
}
