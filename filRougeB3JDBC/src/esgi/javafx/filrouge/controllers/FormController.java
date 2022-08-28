/*==============================================================================================*/
/* 							Implémentation du contrôleur (FormController)					    */
/*==============================================================================================*/

package esgi.javafx.filrouge.controllers;

import java.io.IOException;
import java.util.regex.Pattern;

import esgi.javafx.filrouge.beans.User;
import esgi.javafx.filrouge.services.UserService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FormController {
	// Les attributs
	// Ajouter d'autres champs au formulaire (Date de naissance, adresse mail...)
    @FXML
    private TextField lastnameField;

    @FXML
    private TextField firstnameField;
    
    @FXML
    private TextField datebirthField;
    
    @FXML
    private TextField mailaddressField;
    
    @FXML
    private Label successLogin;

    private Stage dialogStage;

    private User user;

    private UserService userService;
    
    private Stage stage;
	 private Scene scene;
    
    // Méthode d'initialisation
    @FXML
    private void initialize() {
	user = new User();
	userService = new UserService();
    }
    // Les autres méthodes
    @FXML
    private void register() {
	if (isInputValid()) {
	    user.setLastname(lastnameField.getText());
	    user.setFirstname(firstnameField.getText());
	    user.setDateBirth(datebirthField.getText());
	    user.setMailAddress(mailaddressField.getText());
	    userService.createUser(user);
	    // Afficher un messahe lors de la création d'un utilisateur
	    successLogin.setText("Utilisateur créé avec succès!");

	}
    }
    
    // Affichage de la liste des utilisateurs :
    // - Au niveau de l'interface graphique, ajout d'un bouton "Utilisateurs" en dessous
    // du bouton s'inscrire.
    // - Lorsqu'on clique sur le bouton utilisateurs, la liste des utilisateurs s'affichent dans
    // l'interface graphique.
    @FXML
    public void printUser(ActionEvent event) throws IOException {
		 Parent root = FXMLLoader.load(getClass().getResource("/esgi/javafx/filrouge/views/UserList.fxml"));
		 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	 }

    private boolean isInputValid() {
	String errorMessage = "";

	if (lastnameField.getText() == null || lastnameField.getText().length() == 0) {
	    errorMessage += "Le nom est obligatoire\n";
	}

	if (firstnameField.getText() == null || firstnameField.getText().length() == 0) {
	    errorMessage += "Le prénom est obligatoire\n";
	}
	
	if (mailaddressField.getText() != null && isEmailAdress(mailaddressField.getText()) == false ) {
		errorMessage += "Le format de l'adresse mail n'est pas correct\n";
	}
	
	/*if (datebirthField.getText() == null || datebirthField.getText().length() == 0) {
	    errorMessage += "La date de naissance est obligatoire\n";
	}
	
	if (mailaddressField.getText() == null || mailaddressField.getText().length() == 0) {
	    errorMessage += "L'adresse mail est obligatoire\n";
	}*/

	if (errorMessage.length() == 0) {
	    return true;
	} else {
	    Alert alert = new Alert(AlertType.ERROR);
	    alert.initOwner(dialogStage);
	    alert.setTitle("Les champs sont mal renseignés");
	    alert.setHeaderText("Veuillez corriger les champs concernés");
	    alert.setContentText(errorMessage);

	    alert.showAndWait();

	    return false;
	}
    }
    
    public boolean isEmailAdress(String email) {
        Pattern p = Pattern
                .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
        java.util.regex.Matcher m = p.matcher(email.toUpperCase());
        return m.matches();
    }
}
