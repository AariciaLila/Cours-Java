/*==============================================================================================*/
/* 										Implémentation du bean User								*/
/*==============================================================================================*/

// - 2 attributs : lastname et firstname
// - Geetters et setters

package esgi.javafx.filrouge.beans;

import java.io.Serializable;

public class User implements Serializable {
    
    private static final long serialVersionUID = 549783449923538561L;
    
    private String lastname;
    private String firstname;
    private String date_birth;
    private String mail_address;
    
    public User() {
	
    }

    public User(String lastname, String firstname, String date_birth, String mail_address) {
	this.lastname = lastname;
	this.firstname = firstname;
	this.date_birth = date_birth;
	this.mail_address = mail_address;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }
    
    public String getDateBirth() {
	return date_birth;
    }

    public void setDateBirth(String date_birth) {
	this.date_birth = date_birth;
    }
    
    public String getMailAddress() {
	return mail_address;
    }

    public void setMailAddress(String mail_address) {
	this.mail_address = mail_address;
    }
}
