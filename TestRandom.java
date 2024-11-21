public  class  TestRandom {
	static int a = 0;
	public static void main(String[]  args) {
		int times = Integer.parseInt(args[0]);
		int count = 0;
		for (int i = 0; i < times; i++ ) {
			if (Math.random() > 0.5) {
				count++;
			}
		}
		System.out.println("> 0.5:  " + count + " times. ");
		System.out.println("<= 0.5: " + (times - count) + " times.");
		System.out.println("Ratio:  " + (count + 0.0) / (times - count));
	}
}
