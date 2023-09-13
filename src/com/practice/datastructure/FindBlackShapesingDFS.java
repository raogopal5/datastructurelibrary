package com.practice.datastructure;

import java.util.*;

public class FindBlackShapesingDFS {

    static class UF {
        private int count;
        private int[] parent;
        private int[] size;

        public UF(int n) {
            count = 0;
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i ++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x) {
            while (parent[x] != x) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            if (size[rootX] <= size[rootY]) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            } else {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
            }
            count --;
        }

        public int count() {
            return this.count;
        }

        public void incrementCount() {
            this.count ++;
        }
    }
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int index(int n) {
            return x * n + y;
        }

        public boolean valid(int m, int n) {
            return x >= 0 && x < m && y >= 0 && y < n;
        }

        @Override
        public int hashCode() {
            int hash = 17;
            hash += this.x * 31;
            hash += this.y * 31;
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            Node n = (Node) o;
            return n.x == x && n.y == y;
        }
    }

    public int black(String[] A) {
        int m = A.length;
        int n = A[0].length();
        Queue<Node> queue = new ArrayDeque<>();
        Set<Node> visited = new HashSet<>();
        UF blk = new UF(m * n);
        int[] dx = new int[]{-1,0,1,0};
        int[] dy = new int[]{0,1,0,-1};
        for (int i = 0; i < m; i ++) {
            String s = A[i];
            for (int j = 0; j < n; j ++) {
                char c = s.charAt(j);
                if (c == 'X') {
                    blk.incrementCount();
                    queue.offer(new Node(i, j));
                }
            }
        }
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (visited.add(node)) {
                for (int i = 0; i < 4; i ++) {
                    Node next = new Node(node.x + dx[i], node.y + dy[i]);
                    if (next.valid(m, n) && A[next.x].charAt(next.y) == 'X') {
                        blk.union(node.index(n), next.index(n));
                        queue.offer(next);
                    }
                }
            }
        }
        return blk.count();
    }

}
