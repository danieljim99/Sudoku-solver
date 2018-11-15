import javafx.application.Application;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Prorgam extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		URL res = getClass().getClassLoader().getResource("sudoku.fxml");
		Parent root = FXMLLoader.load(res);
		Scene scene = new Scene(root);
		stage.setTitle("Sudoku Solver");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}