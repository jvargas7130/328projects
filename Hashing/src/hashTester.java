
public class hashTester {

	public static void main(String[] args) {
		
		
		//part 1 
		part1();
		

	}
	//var str = "HELLO WORLD";
	//var res = str.charAt(0);
	
	public static void part1(){
		
		String string = "ieweweweweweweweuewuijiui";
		double sum = 0;
		int n = 1;
		
		for(int i = 0; i <string.length(); i++ ){
		char c = string.charAt(i);
			
			int s = Character.getNumericValue(c);
			
			double m = s + Math.pow(37,i);
			n++;
			sum = sum + (m*0.68033989);
			
			System.out.println(sum *1024);
		
		}	
		
		
	
		
		
		
		
	}

	
	

}
