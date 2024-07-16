package com.unstop.day01;

public class CityBiker {

	public static int findHighestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude;
            }
        }

        return highestAltitude;
    }

	public static void main(String[] args) {
		int arr[] = { -5, 5, 1, 5, -3 };
		int response = findHighestAltitude(arr);
		System.out.println("The max peak Element is ::" + response);

	}

}
