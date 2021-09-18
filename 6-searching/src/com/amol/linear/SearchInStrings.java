package com.amol.linear;

public class SearchInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Amol Ghuge";
		char target ='u';
		boolean ans = searchInString(name, target);
		System.out.println(ans);
		boolean ans1 = searchInString2(name, target);
		System.out.println(ans1);
		
	}
	
	static boolean searchInString2(String name, char target) {
		if(name.length()==0) {
			return false;
		}
		
		for(char ch : name.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		return  false;
	}
	
	static boolean searchInString(String name, char target) {
		if(name.length()==0) {
			return false;
		}
		for(int i =0; i< name.length(); i++) {
			if(target == name.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
