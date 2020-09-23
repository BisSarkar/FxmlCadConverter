/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadexchange;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class ForexExchangeController implements Initializable {

    /**
     * Initializes the controller class.
     */
  
    
    @FXML
    private TextField t1;
    
    
    
    @FXML
    private TextField t2;
    
    @FXML
    private Label lblEqual;
    
    @FXML
    private Label lblInfo;
    
    
     @FXML
    private ToggleGroup groupCurrency;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lblEqual.setText("=");
    }  
    
        @FXML
private void calcConvert(ActionEvent event) {
    if(!validateText(t1.getText()))
    {
     int a=Integer.parseInt(t1.getText());
     RadioButton selectedRadioButton = (RadioButton) groupCurrency.getSelectedToggle();
     String toogleGroupValue = selectedRadioButton.getText();
     
    String total="";
     
     if("_$ USD".equals(toogleGroupValue))
     {
       total = "$ "+ String.format("%.2f",(a * 0.8)); 
       lblInfo.setText("[ $1 CAD = $0.8 USD ]");
       lblInfo.setTextFill(Color.RED);
      
     }else if ("_£ POUND".equals(toogleGroupValue))
     {
         total = "£ "+ String.format("%.2f",(a * 0.52)); 
          lblInfo.setText("[ $1 CAD = £0.52 POUND ]");
          lblInfo.setTextFill(Color.BLUE);
          
     }else if ("_€ EURO".equals(toogleGroupValue))
     {
         total = "€ "+ String.format("%.2f",(a * 0.7));
        lblInfo.setText("[ $1 CAD = €0.7 EURO ]");
        lblInfo.setTextFill(Color.DARKORANGE);
        
     }else if ("_₱ PESO".equals(toogleGroupValue))
     {
         total = "₱ "+ String.format("%.2f",(a * 12.01)); 
         lblInfo.setText("[ $1 CAD = ₱12.01 PESO ]");
         lblInfo.setTextFill(Color.FORESTGREEN);
         
     }else if ("_¥ YUAN".equals(toogleGroupValue))
     {
         total = "¥ "+ String.format("%.2f",(a * 5.01));
         lblInfo.setText("[ $1 CAD = ¥5.01 YUAN ]");
         lblInfo.setTextFill(Color.FIREBRICK);
         
     }else if ("_₹ RUPEES".equals(toogleGroupValue))
     {
         total = "₹ "+ String.format("%.2f",(a * 49.77));
         lblInfo.setText("[ $1 CAD = ₹49.77 RUPEES ]");
         lblInfo.setTextFill(Color.DEEPPINK);
         
     }
     t2.setText(total);
    }else
    {
        t2.setText("Error: Invalid Input ");
        lblInfo.setText("");
        
    }
          
}

public boolean validateText(String t)
{
      boolean isValid=false;
       
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(Character.isLetter(ch))
            {
               isValid=true;  
            }
        }
       
        return isValid;
}

}
