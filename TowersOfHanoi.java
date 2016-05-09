
public class TowersOfHanoi {

	public static void TowersOfHanoi(int n, char fromPeg,char toPeg, char auxPeg){
		
		if(n==1){
			System.out.println("Move disk 1 from peg "+ fromPeg + " toPeg "+ toPeg);
			return;
		}
		TowersOfHanoi(n-1, fromPeg, auxPeg,toPeg);
		System.out.println("Move disk from peg  "+ fromPeg +" toPeg "+ toPeg);
		TowersOfHanoi(n-1, auxPeg, toPeg,fromPeg);
		
	}
	
	
	public static void main(String[] args) {
		
		
		TowersOfHanoi(5, 'A', 'B', 'C');

	}

}
