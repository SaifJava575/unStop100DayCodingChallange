package com.unstop.day05;
import java.util.Scanner;

class TreeNode {
    int left, right;
    TreeNode(int left, int right) {
        this.left = left;
        this.right = right;
    }
}

public class DY_07_MarathonCity {
    private static TreeNode[] tree;
    private static int maxDiameter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        tree = new TreeNode[n + 1];

        for (int i = 1; i <= n; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            tree[i] = new TreeNode(left, right);
        }

        dfs(1);

        System.out.println(maxDiameter);
        scanner.close();
    }

    private static int dfs(int node) {
        if (node == -1) {
            return 0;
        }

        int leftDepth = dfs(tree[node].left);
        int rightDepth = dfs(tree[node].right);

        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
