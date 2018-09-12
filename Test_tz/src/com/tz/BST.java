package com.tz;


import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;

/**
 * create by tz on 2018-09-12
 */
public class BST {
    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int N;

        public Node (Key key, Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }

    public int size() {
        return size();
    }



}
