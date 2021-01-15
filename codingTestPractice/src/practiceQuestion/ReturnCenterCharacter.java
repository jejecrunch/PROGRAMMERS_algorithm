package practiceQuestion;

public class ReturnCenterCharacter {
	
	public static void main(System[] args) {
		
		System.out.println(Solution("abcde"));
		System.out.println(Solution("qwer"));
	}
	
	public static String Solution(String s) {
		String answer=" ";
		StringBuilder sb = new StringBuilder();
		
		if(s.length()%2 == 0) {
			sb.append(s.charAt(s.length()/2));
			sb.append(s.charAt((s.length()/2)+1));
			answer=sb.toString();
		} else {
			sb.append(s.charAt(s.length()/2));
			answer=sb.toString();
		}
		return answer;
	}

}
