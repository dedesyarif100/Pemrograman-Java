// Class & Object , Constructor ---------------------------------------------------------
package com;

class Algorithms {
    String sorting;
    String searching;
    String greedyAlgorithms;
    String dynamicProgramming;
    String patternSearching;
    String divide;
    String conquer;

    // Constructor dengan parameters ---------------------------------------------------------
    Algorithms(String sorting, String searching, String greedy, String dynamic, String patternSearching, String divide, String conquer) {
        sorting = sorting;
        searching = searching;
        greedyAlgorithms = greedy;
        dynamicProgramming = dynamic;
        patternSearching = patternSearching;
        divide = divide;
        conquer = conquer;

        System.out.println(sorting);
        System.out.println(searching);
        System.out.println(greedyAlgorithms);
        System.out.println(dynamicProgramming);
        System.out.println(patternSearching);
        System.out.println(divide);
        System.out.println(conquer);
    }
}

public class javaKe2 {
    public static void main(String[] args) {
        // Object Dari Constructor ----------------------------------------------------------------
        Algorithms algoritma = new Algorithms("Sorting", "Searching", "greedy", "dynamic", "patternSearching", "divide", "conquer");
    }
}