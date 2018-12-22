package com.example.bubnov.myapplication;

import android.util.Log;

import java.util.ArrayList;

public class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addInTail(Node item) {
        if (this.head == null)
            this.head = item;
        else
            this.tail.next = item;
        this.tail = item;
    }

    public Node find(int value) {
        Node node = this.head;
        while (node != null) {
            if (node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    public ArrayList<Node> findAll(int value) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Node node = this.head;
        while (node != null) {
            if (node.value == value)
                nodes.add(node);
            node = node.next;
        }

        return nodes;
    }

    public boolean remove(int _value) {
        if(this.head.value == _value) {
            this.head = this.head.next;
            return true;
        }

        Node node = this.head;
        while (node != null) {
            if (node.next != null && node.next.value == _value){
                node.next = node.next.next;
                return true;
            }
            node = node.next;
        }
        // здесь будет ваш код удаления одного узла по заданному значению
        return false; // если узел был удалён
    }

    public void removeAll(int _value) {
        Node node = this.head;
        while (node != null) {
            if (node.next != null && node.next.value == _value){
                node.next = node.next.next;
               continue;
            }
            node = node.next;
        }

        if(this.head.value == _value) {
            this.head = this.head.next;
        }
    }

    public void clear() {
        head = null;
        tail = null;
        // здесь будет ваш код очистки всего списка
    }

    public int count() {
        Node node = this.head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count; // здесь будет ваш код подсчёта количества элементов в списке
    }

    public void insertAfter(Node _nodeAfter, Node _nodeToInsert) {
        // если _nodeAfter = null и список пустой,
        // добавьте новый элемент первым в списке
        if(_nodeAfter == null) {
            _nodeToInsert.next = this.head;
            this.head = _nodeToInsert;
        }else{
            Node node = this.head;
            // Вставка между узлами
            while (node != null) {
                if(_nodeAfter == node){
                    _nodeToInsert.next = node.next;
                    node.next = _nodeToInsert;
                    Log.e("TAG3", " - " + node.value);

                }
                node = node.next;
            }
        }
    }

}
