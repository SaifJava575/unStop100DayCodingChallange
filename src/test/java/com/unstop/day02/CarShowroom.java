package com.unstop.day02;
import java.util.Scanner;

public class CarShowroom {

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);

        // Reading the number of cars
        int n = scanner.nextInt();
        int[] features = new int[n];

        // Reading the features of the cars
        for (int i = 0; i < n; i++) {
            features[i] = scanner.nextInt();
        }
*/
        // Calculate the blend score
    	int ar[]= {4,3,5,1,2};
        int blendScore = calculateBlendScore(ar);

        // Print the result
        System.out.println(blendScore);

       // scanner.close();
    }

    public static int calculateBlendScore(int[] features) {
        int blendScore = 0;

        // Iterate over each bit position (0 to 13, as maximum value is 10000)
        for (int bit = 0; bit < 14; bit++) {
            int count = 0;

            // Count how many numbers have this bit set
            for (int feature : features) {
                if ((feature & (1 << bit)) != 0) {
                    count++;
                }
            }

            // If count of set bits is odd, set this bit in the blend score
            if (count % 2 != 0) {
                blendScore |= (1 << bit);
            }
        }

        return blendScore;
    }
}
