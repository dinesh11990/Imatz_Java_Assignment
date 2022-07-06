package practice.loops;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEFG";
		String extractedString = str.substring(2,5);
		
		System.out.println(extractedString);
		
		if(str.length()==5)
		{
			System.out.println("the string length is 5");
		}else {
			
			System.out.println("the string length is not 5");
		}
		
		
	}

}

