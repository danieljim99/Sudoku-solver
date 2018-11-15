import java.util.Scanner;

public class Sudoku {
	int box[][];
	Conjunto numbers[][] = new Conjunto[9][9];
	
	Sudoku(){
		box = new int[9][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				numbers[i][j] = new Conjunto();
				box[i][j] = 0;
			}
		}
	}
	
	void createSudoku() {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print("[" + i + "][" + j + "]: ");
				addNumber(i, j, Integer.parseInt(SudokuController.boxes[i - 1][j - 1].getText()));
			}
		}
	}
	
	void makeSudoku() {
		Scanner keyboard = new Scanner(System.in);
		int n;
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print("[" + i + "][" + j + "]: ");
				n = keyboard.nextInt();
				addNumber(i, j, n);
			}
		}
		keyboard.close();
	}
	
	void addNumber(int i, int j, int n) {
		if(i > 0 && i < 10) {
			if (j > 0 && j < 10) {
				if (n >= 0 && n < 10) {
					box[i - 1][j - 1] = n;
					removePosiblesCuadrante(i, j, n);
					removePosiblesFila(i, n);
					removePosiblesColumna(j, n);
				}
			}
		}
	}
	
	void removePosiblesCuadrante(int i, int j, int n) {
		switch(i) {
		case 1:
		case 2:
		case 3:
			switch(j) {
			case 1:
			case 2:
			case 3:
				for(i = 0; i < 3; i++) {
					for(j = 0; j < 3; j++) {
						numbers[i][j].removePossible(n);
					}
				}
				break;
			case 4:
			case 5:
			case 6:
				for(i = 0; i < 3; i++) {
					for(j = 3; j < 6; j++) {
						numbers[i][j].removePossible(n);
					}
				}
				break;
			case 7:
			case 8:
			case 9:
				for(i = 0; i < 3; i++) {
					for(j = 6; j < 9; j++) {
						numbers[i][j].removePossible(n);
					}
				}
			}
			break;
		case 4:
		case 5:
		case 6:
			switch(j) {
			case 1:
			case 2:
			case 3:
				for(i = 3; i < 6; i++) {
					for(j = 0; j < 3; j++) {
						numbers[i][j].removePossible(n);
					}
				}
				break;
			case 4:
			case 5:
			case 6:
				for(i = 3; i < 6; i++) {
					for(j = 3; j < 6; j++) {
						numbers[i][j].removePossible(n);
					}
				}
				break;
			case 7:
			case 8:
			case 9:
				for(i = 3; i < 6; i++) {
					for(j = 6; j < 9; j++) {
						numbers[i][j].removePossible(n);
					}
				}
			}
			break;
		case 7:
		case 8:
		case 9:
			switch(j) {
			case 1:
			case 2:
			case 3:
				for(i = 6; i < 9; i++) {
					for(j = 0; j < 3; j++) {
						numbers[i][j].removePossible(n);
					}
				}
				break;
			case 4:
			case 5:
			case 6:
				for(i = 6; i < 9; i++) {
					for(j = 3; j < 6; j++) {
						numbers[i][j].removePossible(n);
					}
				}
				break;
			case 7:
			case 8:
			case 9:
				for(i = 6; i < 9; i++) {
					for(j = 6; j < 9; j++) {
						numbers[i][j].removePossible(n);
					}
				}
			}
		}
	}
	
	void removePosiblesFila(int i, int n) {
		for(int j = 0; j < 9; j++) {
			numbers[i - 1][j].removePossible(n);
		}
	}
	
	void removePosiblesColumna(int j, int n) {
		for(int i = 0; i < 9; i++) {
			numbers[i][j - 1].removePossible(n);
		}
	}
	
	void solveSudoku() {
		int n;
		int cont;
		do {
			cont = 0;
			for(int i = 1; i < 10; i++) {
				for(int j = 1; j < 10; j++) {
					if(box[i - 1][j - 1] == 0) {
						cont++;
						n = numbers[i - 1][j - 1].theOnlyPossible();
						addNumber(i, j, n);
					}
				}
			}
		} while (cont != 0);
	}
	
	void printSudoku() {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(box[i][j] == 0) {
					System.out.print(" ");
				} else {
					System.out.print(box[i][j]);
				}
				if(j == 2 || j == 5) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
			if(i == 2 || i == 5) {
				System.out.println("\n-----------------");
			} else {
				System.out.println("");
			}
		}
	}
}