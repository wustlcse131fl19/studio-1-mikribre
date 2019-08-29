package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");


		boolean xascending = x < y && x < z;
		boolean yascending = y < z;

		boolean xdescending = x > y && x > z;
		boolean ydescending = y > z;

		boolean isOrdered = (xascending && yascending) || (xdescending && ydescending);
		System.out.println(isOrdered);








	}

}
