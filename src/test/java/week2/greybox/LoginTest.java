package week2.greybox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    /**
     * Als username 'app' is en password 'test' dan krijg je een
     *
     * @return true
     * <p>
     * Als username of password null is dan
     * @return false
     * @throws NullPointerException met de message "username or password is null" als username of password null is
     * @throws NullPointerException met de message "username of password is empty" als username of password "" is. Ook wel een lege string
     */
    @Test
    void loginTest() {
        Login login = new Login("app", "test");
    }
}
