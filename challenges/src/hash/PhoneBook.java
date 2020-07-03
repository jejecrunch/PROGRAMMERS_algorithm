package hash;
import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		
	}

	class Solution {
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        Arrays.sort(phone_book);
	        
	        String temp = "^"+phone_book[0]+".*";
	        for(int i = 1;i<phone_book.length;i++){
	            if(phone_book[i].matches(temp)) return !answer;
	        }
	        
	        return answer;
	    }
	}
}


