package com.unstop.day05;
import java.util.*;

public class DY_05_YoungestFamilyMember {

    public static int findYoungestMember(int n, int m, int[][] gifts) {
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int giver = gifts[i][0];
            int receiver = gifts[i][1];
            outDegree[giver]++;
            inDegree[receiver]++;
        }

        for (int i = 1; i <= n; i++) {
            if (outDegree[i] == 0 && inDegree[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] gifts = new int[m][2];

        for (int i = 0; i < m; i++) {
            gifts[i][0] = scanner.nextInt();
            gifts[i][1] = scanner.nextInt();
        }

        System.out.println(findYoungestMember(n, m, gifts));
    }
}
