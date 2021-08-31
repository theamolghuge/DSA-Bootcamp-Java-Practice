package com.amol;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

	public static void main(String[] args) {
		int extraCandies = 3;
		int[] candies = { 2, 3, 5, 1, 3 };
		System.out.println(kidsWithCandies(candies, extraCandies));
	}

	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		ArrayList<Boolean> result = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}
        for(int i = 0; i< candies.length; i++){
            if (candies[i] + extraCandies >= max)
				result.add(true);

			else
				result.add(false);
        }
		return result;
	}
}
