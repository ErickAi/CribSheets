package com.er.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countHotels = scanner.nextInt();
        int numEachStars = countHotels / 5;
        int[] ratings = new int[countHotels];
        int[] stars = new int[countHotels];
        for (int i = 0; i < countHotels; i++) {
            ratings[i] = scanner.nextInt();
        }
        int setStar = 1;
        int minRating = ratings[0];
        int thisIndex = 0;
        for (int index = 0; index < countHotels; index++) {
            if (0< ratings[index] && ratings[index] < minRating) {
                minRating = ratings[index];
                thisIndex = index;
            }
            stars[thisIndex] = setStar;
            ratings[thisIndex] = -1;
            setStar++;
        }
        for (int i = 0; i < stars.length; i++) {
            System.out.print(stars[i] + " ");
        }
    }
}
