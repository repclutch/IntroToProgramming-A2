
public class Exercise5_40 {

	public static void main(String[] args) {

		int heads = 0;
		int tails = 0;
		int count = 0;
		
		
		while (count < 1000000) {
			
			int coin = (int)(Math.random() * 2);
			count++;
			
			if (coin == 0) {
				heads++;
				
			} else 
				tails++;
			
		
		}
		
		System.out.println("Heads: " + heads);
		System.out.println("Tails: " + tails);
		
		
	}

}
