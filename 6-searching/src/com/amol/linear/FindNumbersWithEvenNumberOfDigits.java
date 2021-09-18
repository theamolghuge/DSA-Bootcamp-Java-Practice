package com.amol.linear;

class FindNumbersWithEvenNumberOfDigits {
	
	public static void main(String[] args) {
	
		int [] nums = {12, 345, 2, 6, 7892};
	//	System.out.println(evenDigits(132));
		System.out.println(findNumbers(nums));
	}
	
    static int findNumbers(int[] nums) {
        
        int count = 0;
        
        for(int i =0; i< nums.length; i++){
            if(evenDigits(nums[i])%2==0){
                count++;
            }
        }
        
        return count;
    }
    
    static int evenDigits(int num){
        int digitCount = 0;
        while(num!=0){
            digitCount++;
            num = num/10;
        }
        return digitCount;
    }
}