/*==============================================================================================*/
/* 											Tests Junit										    */
/*==============================================================================================*/

package esgi.javafx.filrouge.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import esgi.javafx.filrouge.beans.User;
import esgi.javafx.filrouge.services.UserService;
// Test UserService
class UserServiceTest {
    
    private UserService us;
    
    @BeforeEach
    public void init() {
	us = new UserService();
    }
    
    @Test
    void createUser() {
	assertTrue(us.createUser(new User("Test", "Test", "Test", "Test")));
    }

}
