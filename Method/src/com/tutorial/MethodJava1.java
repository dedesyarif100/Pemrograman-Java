// Method ---------------------------------------------------------
// package com.tutorial;

class StrukturData {
    String linkedList;
    String doubleLinkedList;
    String stack;
    String queue;
    String array;
    String binarytree;
    String heap;
    String hashing;
    String graph;
    String matrix;
    int codeData;

    StrukturData(String linkedList, String doubleLinkedList, String stack, String queue, String array, String binarytree, String heap, String hashing, String graph, String matrix, int codeData) {
        this.linkedList = linkedList;
        this.doubleLinkedList = doubleLinkedList;
        this.stack = stack;
        this.queue = queue;
        this.array = array;
        this.binarytree = binarytree;
        this.heap = heap;
        this.hashing = hashing;
        this.graph = graph;
        this.matrix = matrix;
        this.codeData = codeData;
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Struktur Data " + this.linkedList);
        System.out.println("Struktur Data " + this.doubleLinkedList);
        System.out.println("Struktur Data " + this.stack);
        System.out.println("Struktur Data " + this.queue);
        System.out.println("Struktur Data " + this.array);
        System.out.println("Struktur Data " + this.binarytree);
        System.out.println("Struktur Data " + this.heap);
        System.out.println("Struktur Data " + this.hashing);
        System.out.println("Struktur Data " + this.graph);
        System.out.println("Struktur Data " + this.matrix);
        System.out.println("Struktur Data " + this.codeData);
    }

    // method tanpa return dan dengan parameter
    void setValue(String linkedList, String doubleLinkedList, String stack, String queue, String array, String binarytree, String heap, String hashing, String graph, String matrix){
        this.linkedList = linkedList;
        this.doubleLinkedList = doubleLinkedList;
        this.stack = stack;
        this.queue = queue;
        this.array = array;
        this.binarytree = binarytree;
        this.heap = heap;
        this.hashing = hashing;
        this.graph = graph;
        this.matrix = matrix;
    }

    // method dengan return tapi tidak ada parameter
    String getLinkedList() {
        return this.linkedList;
    }

    int getCode() {
        return this.codeData;
    }

    // method dengan return dan dengan parameter
    String message(String message) {
        return message + " Data Structure " + this.linkedList;
    }
}

public class MethodJava1 {
    public static void main(String[] args) {
        StrukturData data = new StrukturData("linkedList", "doubleLinkedList", "stack", "queue", "array", "binarytree", "heap", "hashing", "graph", "matrix", 123);
        StrukturData Struct = new StrukturData("linkedList", "doubleLinkedList", "stack", "queue", "array", "binarytree", "heap", "hashing", "graph", "matrix", 123);

        // Tampilkan method tanpa return dan tanpa parameter
        System.out.println("Tampilkan method tanpa return dan tanpa parameter");
        data.show();

        // Tampilkan method tanpa return dan dengan parameter
        System.out.println("Tampilkan method tanpa return dan dengan parameter");
        Struct.setValue("linkedList", "doubleLinkedList", "stack", "queue", "array", "binarytree", "heap", "hashing", "graph", "matrix");
        Struct.show();

        // Tampilkan method dengan return tapi tidak ada parameter
        System.out.println("Tampilkan method dengan return tapi tidak ada parameter");
        System.out.println(data.getLinkedList());
        System.out.println(data.getCode());

        // Tampilkan method dengan return dan ada parameter
        System.out.println("Tampilkan method dengan return dan dengan parameter");
        String files = data.message("Struktur");
        System.out.println(files);
    }
}
