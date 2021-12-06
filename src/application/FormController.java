package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class FormController implements Initializable{
	
	@FXML
    private TextField mailID;

    @FXML
    private TextField nameID;

    @FXML
    private TableView<Details> firstTable;
    
    @FXML
    private TableColumn<Details,String> temailID;

    @FXML
    private TableColumn<Details,String> tuserName;

    @FXML
    private Label userID;
    
    public void addToTable(ActionEvent event)
    {
    	String userName = nameID.getText();
    	String mailId = mailID.getText();
    	System.out.println("Username entered" +userName);
    	System.out.println("Email id" +mailId);
    	ObservableList<Details> addDetails = firstTable.getItems();
    	addDetails.add(
    			         new Details(
    			        		 nameID.getText(),
    			        		 mailID.getText()
    			        		 )
    			         
    			);
    	nameID.setText("");
    	mailID.setText("");
    }

  

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		System.out.println("Inside Initialize");
		tuserName.setCellValueFactory(new PropertyValueFactory<Details,String>("tuserName"));
		temailID.setCellValueFactory(new PropertyValueFactory<Details,String>("temailID"));
	
	}
    
}
