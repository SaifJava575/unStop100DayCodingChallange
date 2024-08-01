package com.unstop.day05;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class DY_08_RecentSubmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(getMaxQueueSize(N, arr));
    }
    
    public static int getMaxQueueSize(int N, int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 0;
        
        for (int i = 0; i < N; i++) {
            int currentTime = arr[i];
            
            while (!queue.isEmpty() && queue.peek() <= currentTime - 5000) {
                queue.poll();
            }
            
            queue.offer(currentTime);
            maxSize = Math.max(maxSize, queue.size());
        }
        
        return maxSize;
    }
}
