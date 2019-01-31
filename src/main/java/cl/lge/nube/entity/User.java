package cl.lge.nube.entity;

import javax.persistence.*;

@Entity
@Table(name="user_table")
public class User {

    @Id
    @SequenceGenerator(name="user_seq", sequenceName="user_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user_seq")
    private Long id;

    private String name;

    private String username;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
