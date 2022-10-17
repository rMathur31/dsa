package dsaPractice;

public class TowersOfHanoi {

	public static void main(String[] args) {
		tower(3, 'S', 'H', 'D');
	}
	
	public static void tower(int n, char src, char help, char dest) {
		if(n == 1) {
			System.out.println("Transfer "+(n-1)+" from "+src+" to "+dest);
			return;
		}
		tower(n-1, src, dest, help);
		System.out.println("Transfer "+(n-1)+ " from "+src+" to "+dest);
		tower(n-1,help,src,dest);
	}
}