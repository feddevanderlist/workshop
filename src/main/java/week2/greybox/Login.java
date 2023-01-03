package week2.greybox;

public class Login {
    private final String username;
    private final String password;

    public Login(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isSuccesvol() {
        if (username == null || password == null) {
            throw new NullPointerException("username or password is null");
        }
        if (username.isEmpty() || password.isEmpty()) {
            throw new NullPointerException("username of password is empty");
        }
        if (username.equals(password)) {
            return false;
        }
        return username.equals("app") && password.equals("test");
    }

}
