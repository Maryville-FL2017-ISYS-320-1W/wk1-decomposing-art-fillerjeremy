/*
  	ISYS 320
  	Name(s): Jeremy Filler
  	Date: 11.3.17
*/

// 4. Your pseudocode algorithm for how to break down the figure
/*
 * Draw five asterisks. new line
 * Draw five asterisks. New line
 * Draw 1 space, 1 asterisk, 1 space, 1 asterisk, 1 space. New line
 * Draw 2 spaces. Draw 1 asterisk. Draw 2 spaces.
 * Draw 1 space, 1 asterisk, 1 space, 1 asterisk, 1 space. new line
 * Put a few lines in between.
 * Draw 2 more lines with 5 asterisks each.
 * Draw 1 space, 1 asterisk, 1 space, 1 asterisk, 1 space. New line
 * Draw 2 spaces, 1 asterisk, 2 spaces. new line
 * Draw 1 space, 1 asterisk, 1 space, 1 asterisk, 1 space. New line
 * Draw 2 lines with 5 asterisks.
 * Draw a couple more empty lines.
 * Draw three lines with 1 asterisk in the middle
 * Draw 2 lines with 5 asterisks.
 * Draw 1 space, 1 asterisk, 1 space, 1 asterisk, 1 space. New line
 * Draw 2 spaces, 1 asterisk, 2 spaces
 * Draw 1 space, 1 asterisk, 1 space, 1 asterisk, 1 space. New line
 */


public class StarFigures {

	public static void main(String[] args) {
		topsection();
		middlesection();
		bottomsection();
	}
	
	public static void topsection() {
		fivestar();
		fivestar();
		twostar();
		onestar();
		twostar();
		System.out.println();
		System.out.println();
	}
	
	public static void middlesection() {
		fivestar();
		fivestar();
		twostar();
		onestar();
		twostar();
		fivestar();
		fivestar();
		System.out.println();
		System.out.println();
	}

	public static void bottomsection() {
		onestar();
		onestar();
		onestar();
		fivestar();
		fivestar();
		twostar();
		onestar();
		twostar();
	}
	
	public static void onestar() {
		System.out.println("  *  ");
	}
	
	public static void twostar() {
		System.out.println(" * * ");
	}
	
	public static void fivestar() {
		System.out.println("*****");
	}
}
