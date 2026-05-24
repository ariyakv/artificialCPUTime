public class credentialsSetup {
    private String username;
    private String password;

    public credentialsSetup(String username, String password) {
        this.username = username;
        this.password = password;
    } //credentialsSetup

    public String getUsername() {
        return this.username;
    } //getUsername

    public String getPassword() {
        return this.password;
    } //getPassword

    public void setUsername(String username) {
        this.username = username;
    } //setUsername

    public void setPassword(String password) {
        this.password = password;
    } //setPassword
} //credentialsSetup
