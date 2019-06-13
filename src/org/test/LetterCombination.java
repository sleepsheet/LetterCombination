package org.test;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
	
	public static void main(String[] args) {
		int[] arr = {2, 3};
		LetterCombination letter = new LetterCombination();
		List<String> result = letter.letterCombiantion(arr);
		System.out.println(result);
	}

	public List<String> letterCombiantion(int[] arr){
		char[][] chars = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, 
				{'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, 
				{'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'x'}};
		
		List<String> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			List<String> temp = new ArrayList<>();
			if(!list.isEmpty()) {
				for(int j = 0; j < list.size(); j ++) {
					for(int k = 0; k < chars[arr[i]].length; k++) {
						temp.add(list.get(j) + String.valueOf(chars[arr[i]][k]));
					}
				}
				list = temp;
			} else {
				for(char c : chars[arr[i]]) {
					list.add(String.valueOf(c));
				}
			}
		}
		return list;
	}
}
