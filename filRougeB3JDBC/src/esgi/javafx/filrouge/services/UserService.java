/*==============================================================================================*/
/* 								Implémentation du service (UserService)						    */
/*==============================================================================================*/

// Méthode de création d'un utilisateur dans la BDD

package esgi.javafx.filrouge.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import esgi.javafx.filrouge.beans.User;
import esgi.javafx.filrouge.utils.DataConnect;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class UserService {
	private Stage dialogStage;
	// Implémenter une méthode permettant de vérifier en amont de la création si l'utilisateur
	// existe déjà dans la BDD
	public boolean createUser(User user) {
		String errorMessage = "";
        boolean isMember = false;
        String query = "SELECT * FROM user WHERE lastname = ? AND firstname = ?";
    	try (Connection con = DataConnect.getConnection()) {
    	    PreparedStatement ps = con.prepareStatement(query);
    	    ps.setString(1, user.getLastname());
    	    ps.setString(2, user.getFirstname());
    	    ResultSet rs = ps.executeQuery();
    	    if(rs.next()) {
    	    	// Si l'utilisateur existe déjà, le doublon n'est pas créé dans la table User et
    	    	// un message est affiché à l'utilisateur "utilisateur déjà existant dans la BDD"
    	    	isMember = true;
    	    	System.out.printf("Utilisateur %s déjà existant dans la BDD", user.getLastname());
    	    	// Vérifier si l'utilisateur existe déjà dans la BDD
    	    	errorMessage += "L'utilisateur (" + user.getLastname() + ", " + user.getFirstname() + ") que vous souhaitez créer existe déjà!";
    	    	Alert alert = new Alert(AlertType.ERROR);
    		    alert.initOwner(dialogStage);
    		    alert.setTitle("Les champs sont mal renseignés");
    		    alert.setHeaderText("Veuillez corriger les champs concernés");
    		    alert.setContentText(errorMessage);

    		    alert.showAndWait();
    	    }else {
    	    	// Si l'utilisateur n'existe pas, il est créé dans la BDD et un message s'affiche
    	    	// à l'utilisateur "Création réussie!"
    	    	String query2 = "INSERT INTO user " + "(lastname, firstname, date_birth, mail_address) VALUES(?, ?, ?, ?)";
    	    	PreparedStatement ps2 = con.prepareStatement(query2);
	    	    ps2.setString(1, user.getLastname());
	    	    ps2.setString(2, user.getFirstname());
	    	    ps2.setString(3, user.getDateBirth());
	    	    ps2.setString(4, user.getMailAddress());
	    	    ps2.executeUpdate();
	    	    isMember = true;
	    	    System.out.printf("Création de l'utilisateur %s réussie !", user.getLastname());
    	    }
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	}
    	return isMember;
        }
    
 /*   public boolean createUser(User user) {
	boolean isCreated = false;
	String query = "INSERT INTO user " + "(lastname, firstname) VALUES(?, ?)";
	try (Connection con = DataConnect.getConnection()) {
	    PreparedStatement ps = con.prepareStatement(query);
	    ps.setString(1, user.getLastname());
	    ps.setString(2, user.getFirstname());
	    ps.execute();
	    isCreated = true;
	    System.out.printf("Utilisateur %s créé", user.getLastname());
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return isCreated;
    } */

}
