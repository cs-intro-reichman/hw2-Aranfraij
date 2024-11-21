public class Collatz {
	public static void main(String args[]) {
	    int highestSeed = Integer.parseInt(args[0]); 
		String mode = args[1];
		
		for (int seed = 1; seed <= highestSeed; seed++) {
			int x = seed;
			boolean flag = false;
			String output = x + " ";
			// Generates a hailstorm sequence, until it reaches 1.
			int count = 1;
			while(x != 1 || !flag){
				if (!flag){
					flag = true;
				}
				if (x % 2 == 0) {
					x = x / 2;
				} else {
					x = 3 * x + 1;
				}
				output = output + x + " ";
				count++;
			}
			if (mode.equals("v")){
				System.out.println((output + "(" + count + ")"));
			}
		}
		System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
	}
}
