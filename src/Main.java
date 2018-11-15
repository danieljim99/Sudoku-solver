public class Main {
	public static void main(String[] args) {
		Sudoku facil = new Sudoku();
		facil.makeSudoku();
		facil.printSudoku();
		System.out.println("\n");
		facil.solveSudoku();
		facil.printSudoku();
	}
}