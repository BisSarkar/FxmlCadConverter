/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadexchange;
import javafx.application.Application; 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage; 
 

 public class CurrencyConverterMain1_1 extends Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
 
    @Override
    public void start(Stage stage) throws Exception {
        
     
	  
      //Creating Text File        
      TextField textField1 = new TextField();   
      TextField textField2 = new TextField(); 
      
     
        //Toggle group of radio buttons       
      ToggleGroup groupCurrency = new ToggleGroup(); 
      RadioButton usRadio = new RadioButton("$ USD"); 
      usRadio.setToggleGroup(groupCurrency); 
     
      RadioButton ukRadio = new RadioButton("£ UK"); 
      ukRadio.setToggleGroup(groupCurrency); 
     
      RadioButton euroRadio = new RadioButton("€ EURO"); 
      euroRadio.setToggleGroup(groupCurrency); 
      
      RadioButton pesoRadio = new RadioButton("$ PESO"); 
      pesoRadio.setToggleGroup(groupCurrency);
     
      RadioButton yuanRadio = new RadioButton("¥ YUAN"); 
      yuanRadio.setToggleGroup(groupCurrency); 
      
       RadioButton rupeesRadio = new RadioButton("₹ RUPEES"); 
      rupeesRadio.setToggleGroup(groupCurrency); 
     
      //Creating Buttons 
      Button button1 = new Button("Convert"); 
      button1.setStyle("-fx-background-color: #00ff00");
 
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      
      //Setting size for the pane  
      gridPane.setMinSize(400, 400); 
       
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
    
      gridPane.add(textField1, 0, 0); 
      gridPane.add(textField2, 2, 0); 
      gridPane.add(usRadio, 0, 1);       
      gridPane.add(ukRadio, 0, 2); 
      gridPane.add(euroRadio, 0, 3);       
      gridPane.add(pesoRadio, 0, 4);
      gridPane.add(yuanRadio, 0, 5);
      gridPane.add(rupeesRadio, 0, 6);
      gridPane.add(button1, 0, 7); 
      //button1.setOnAction("#calcConvert");
    //  button1.setOn
      
      //Creating a scene object 
      Scene scene = new Scene(gridPane);  
      
      //Setting title to the Stage 
      stage.setTitle("Canadian Currency Converter"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
      
    
    }
}


