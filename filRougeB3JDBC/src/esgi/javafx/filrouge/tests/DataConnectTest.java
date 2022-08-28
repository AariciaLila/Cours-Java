/*==============================================================================================*/
/* 											Tests Junit										    */
/*==============================================================================================*/

package esgi.javafx.filrouge.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import esgi.javafx.filrouge.utils.DataConnect;
//Test DataConnect
class DataConnectTest {

    @Test
    void getConnection() {
	assertNotNull(DataConnect.getConnection());
    }

}
