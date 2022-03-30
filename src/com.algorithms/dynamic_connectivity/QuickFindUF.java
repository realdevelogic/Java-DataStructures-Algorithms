package com.algorithms.dynamic_connectivity;

import java.util.Arrays;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean isConnected(int p, int q) {
        System.out.println(id[p] == id[q]);
        return id[p] == id[q];
    }

    public int[] seeArray() {
        return id;
    }

    public void union(int p, int q) {
        int qid = id[q];
        int pid = id[p];
        for(int i = 0; i < id.length; i++) {
            if(id[i] == pid) id[i] = qid;
        }
    }

    public static void main(String[] args) {
        QuickFindUF uf = new QuickFindUF(10);
        uf.union(3, 5);
        uf.union(2, 7);
        uf.union(1, 6);
        uf.union(2, 4);
        uf.isConnected(2, 4);
        int result[] = uf.seeArray();
        System.out.println(Arrays.toString(result));
    }
}
