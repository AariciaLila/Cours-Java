package esgi.javafx.filrouge.controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import esgi.javafx.filrouge.beans.ModelTable;
import esgi.javafx.filrouge.utils.DataConnect;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TableController implements Initializable {
	
	@FXML
	private TableView<ModelTable> table;
	@FXML
	private TableColumn<ModelTable,String> col_firstname;
	@FXML
	private TableColumn<ModelTable,String> col_lastname;
	@FXML
	private TableColumn<ModelTable,String> col_email;
	
	private Stage stage;
	 private Scene scene;
	
	ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			Connection con = DataConnect.getConnection();
			
			ResultSet rs = con.createStatement().executeQuery("select lastname, firstname, mail_address from user");
		
			while(rs.next()) {
				oblist.add(new ModelTable(rs.getString("lastname"), rs.getString("firstname"), rs.getString("mail_address")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		col_firstname.setCellValueFactory(new PropertyValueFactory<>("firstname"));
		col_lastname.setCellValueFactory(new PropertyValueFactory<>("lastname"));
		col_email.setCellValueFactory(new PropertyValueFactory<>("email"));
		
		table.setItems(oblist);
	}
	
	// Ajout d'un bouton précédant :
	// - Afin de pouvoir revenir à la page du formulaire pour créer un utilisateur, ajout d'un 
	// bouton "précédant" en dessous du tableau comportant les utilisateurs.
	// - En cliquant sur le bouton "précédant" en dessous du tableau comportat les utilisateurs.
	@FXML
    public void previous(ActionEvent event) throws IOException {
		 Parent root = FXMLLoader.load(getClass().getResource("/esgi/javafx/filrouge/views/Form.fxml"));
		 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	 }

}
