package study;


public class Sosu {
	


	public static void main(String[] args) {
		/*
		 * 234567
			2357
		 */
		int j;
		for(int i=2;i<=10;i++) {
			for( j=2; i>j ;j++) {
				if(i%j==0) {
					break;
				}
				else {
					System.out.println(i);
					
				}
			}
			
		}
		

	}

}
