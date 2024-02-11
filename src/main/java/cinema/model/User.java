package cinema.model;

import jakarta.persistence.*;

@Entity
@Table(name="\"User\"") // Since "User" is a reserved keyword in PostgreSQL, it needs to be escaped with double quotes
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String username;
    private String email;
    private boolean status;
    private String phone;
    private String password;
    private int roleId;

    public User(int userId, String name, String username, String email, boolean status, String phone, String password, int roleId) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.email = email;
        this.status = status;
        this.phone = phone;
        this.password = password;
        this.roleId = roleId;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
