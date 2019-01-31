package cl.lge.nube.model;

public class UserDTO {

    private String name;
    private String username;
    private String password;

    public UserDTO(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public UserDTO(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
