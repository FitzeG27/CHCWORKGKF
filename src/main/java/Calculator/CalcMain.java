package Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalcMain extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("calculator.fxml"))));
        stage.setTitle("Calculator");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
