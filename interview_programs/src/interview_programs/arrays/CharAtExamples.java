package interview_programs.arrays;

public class CharAtExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="COGNIZANT IS A WELL ORGANIZED STRUCTURE";
		
		           String lowerCase = s.toLowerCase();
		           System.out.println(lowerCase);
		           System.out.println();
		           char charAt = s.charAt(4);
		           System.out.println(charAt);
		                String replace = s.replace('I', 'E');
		                System.out.println(replace);
		                String replaceAllEx= s.replaceAll("IS", "is");
		                System.out.println(replaceAllEx);
		                
		                int length = s.length();
		                System.out.println(length);
		                
		                String replace2 = s.replace(" ", "");
		                int length2 = replace2.length();
		                System.out.println(length2);
		                System.out.println(replace2);
		                System.out.println(" Number Of White spaces removed : " +(length-length2));
		                
	}

}
