
package cadexchange;
import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene; 
import javafx.stage.Stage; 
 
public class CurrencyConverterMain extends Application {
     
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("CurrencyConverter.fxml"));
        stage.setTitle("Canadian Currency Converter");
   
        stage.setScene(new Scene(root));
        stage.show();
  
    }
}


