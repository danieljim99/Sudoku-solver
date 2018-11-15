import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SudokuController {

    @FXML
    private TextField box00;

    @FXML
    private TextField box01;

    @FXML
    private TextField box02;

    @FXML
    private TextField box03;

    @FXML
    private TextField box04;

    @FXML
    private TextField box05;

    @FXML
    private TextField box06;

    @FXML
    private TextField box07;

    @FXML
    private TextField box08;

    @FXML
    private TextField box10;

    @FXML
    private TextField box11;

    @FXML
    private TextField box12;

    @FXML
    private TextField box13;

    @FXML
    private TextField box14;

    @FXML
    private TextField box15;

    @FXML
    private TextField box16;

    @FXML
    private TextField box17;

    @FXML
    private TextField box18;

    @FXML
    private TextField box20;

    @FXML
    private TextField box21;

    @FXML
    private TextField box22;

    @FXML
    private TextField box23;

    @FXML
    private TextField box24;

    @FXML
    private TextField box25;

    @FXML
    private TextField box26;

    @FXML
    private TextField box27;

    @FXML
    private TextField box28;

    @FXML
    private TextField box30;

    @FXML
    private TextField box31;

    @FXML
    private TextField box32;

    @FXML
    private TextField box33;

    @FXML
    private TextField box34;

    @FXML
    private TextField box35;

    @FXML
    private TextField box36;

    @FXML
    private TextField box37;

    @FXML
    private TextField box38;

    @FXML
    private TextField box40;

    @FXML
    private TextField box41;

    @FXML
    private TextField box42;

    @FXML
    private TextField box43;

    @FXML
    private TextField box44;

    @FXML
    private TextField box45;

    @FXML
    private TextField box46;

    @FXML
    private TextField box47;

    @FXML
    private TextField box48;

    @FXML
    private TextField box50;

    @FXML
    private TextField box51;

    @FXML
    private TextField box52;

    @FXML
    private TextField box53;

    @FXML
    private TextField box54;

    @FXML
    private TextField box55;

    @FXML
    private TextField box56;

    @FXML
    private TextField box57;

    @FXML
    private TextField box58;

    @FXML
    private TextField box60;

    @FXML
    private TextField box61;

    @FXML
    private TextField box62;

    @FXML
    private TextField box63;

    @FXML
    private TextField box64;

    @FXML
    private TextField box65;

    @FXML
    private TextField box66;

    @FXML
    private TextField box67;

    @FXML
    private TextField box68;

    @FXML
    private TextField box70;

    @FXML
    private TextField box71;

    @FXML
    private TextField box72;

    @FXML
    private TextField box73;

    @FXML
    private TextField box74;

    @FXML
    private TextField box75;

    @FXML
    private TextField box76;

    @FXML
    private TextField box77;

    @FXML
    private TextField box78;

    @FXML
    private TextField box80;

    @FXML
    private TextField box81;

    @FXML
    private TextField box82;

    @FXML
    private TextField box83;

    @FXML
    private TextField box84;

    @FXML
    private TextField box85;

    @FXML
    private TextField box86;

    @FXML
    private TextField box87;

    @FXML
    private TextField box88;

    @FXML
    private Button solveButton;

    static TextField boxes[][];
    
    @FXML
    void solveSudoku(ActionEvent event) {
    	createBoxArray();
    	Sudoku sudoku = new Sudoku();
    	sudoku.createSudoku();
    	sudoku.solveSudoku();
    	printSudoku(sudoku);
    }
    
    void printSudoku(Sudoku sudoku) {
    	for(int i = 0; i < 9; i++) {
    		for(int j = 0; j < 9; j++) {
    			boxes[i][j].setText(sudoku.box[i][j] + "");
    		}
    	}
    }
    
    void createBoxArray() {
    	boxes = new TextField[9][9]; 
    	boxes[0][0] = box00;
    	boxes[0][1] = box01;
    	boxes[0][2] = box02;
    	boxes[0][3] = box03;
    	boxes[0][4] = box04;
    	boxes[0][5] = box05;
    	boxes[0][6] = box06;
    	boxes[0][7] = box07;
    	boxes[0][8] = box08;
    	boxes[1][0] = box10;
    	boxes[1][1] = box11;
    	boxes[1][2] = box12;
    	boxes[1][3] = box13;
    	boxes[1][4] = box14;
    	boxes[1][5] = box15;
    	boxes[1][6] = box16;
    	boxes[1][7] = box17;
    	boxes[1][8] = box18;
    	boxes[2][0] = box20;
    	boxes[2][1] = box21;
    	boxes[2][2] = box22;
    	boxes[2][3] = box23;
    	boxes[2][4] = box24;
    	boxes[2][5] = box25;
    	boxes[2][6] = box26;
    	boxes[2][7] = box27;
    	boxes[2][8] = box28;
    	boxes[3][0] = box30;
    	boxes[3][1] = box31;
    	boxes[3][2] = box32;
    	boxes[3][3] = box33;
    	boxes[3][4] = box34;
    	boxes[3][5] = box35;
    	boxes[3][6] = box36;
    	boxes[3][7] = box37;
    	boxes[3][8] = box38;
    	boxes[4][0] = box40;
    	boxes[4][1] = box41;
    	boxes[4][2] = box42;
    	boxes[4][3] = box43;
    	boxes[4][4] = box44;
    	boxes[4][5] = box45;
    	boxes[4][6] = box46;
    	boxes[4][7] = box47;
    	boxes[4][8] = box48;
    	boxes[5][0] = box50;
    	boxes[5][1] = box51;
    	boxes[5][2] = box52;
    	boxes[5][3] = box53;
    	boxes[5][4] = box54;
    	boxes[5][5] = box55;
    	boxes[5][6] = box56;
    	boxes[5][7] = box57;
    	boxes[5][8] = box58;
    	boxes[6][0] = box60;
    	boxes[6][1] = box61;
    	boxes[6][2] = box62;
    	boxes[6][3] = box63;
    	boxes[6][4] = box64;
    	boxes[6][5] = box65;
    	boxes[6][6] = box66;
    	boxes[6][7] = box67;
    	boxes[6][8] = box68;
    	boxes[7][0] = box70;
    	boxes[7][1] = box71;
    	boxes[7][2] = box72;
    	boxes[7][3] = box73;
    	boxes[7][4] = box74;
    	boxes[7][5] = box75;
    	boxes[7][6] = box76;
    	boxes[7][7] = box77;
    	boxes[7][8] = box78;
    	boxes[8][0] = box80;
    	boxes[8][1] = box81;
    	boxes[8][2] = box82;
    	boxes[8][3] = box83;
    	boxes[8][4] = box84;
    	boxes[8][5] = box85;
    	boxes[8][6] = box86;
    	boxes[8][7] = box87;
    	boxes[8][8] = box88;
    }

}