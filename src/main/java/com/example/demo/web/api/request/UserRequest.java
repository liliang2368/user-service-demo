package com.example.demo.web.api.request;

public class UserRequest {
    private String username;
    private String password;
    private String email;
    private String yanzhengma;
    public UserRequest()
    {

    }

    public UserRequest(String username, String password, String email, String yanzhengma) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.yanzhengma = yanzhengma;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getYanzhengma() {
        return yanzhengma;
    }

    public void setYanzhengma(String yanzhengma) {
        this.yanzhengma = yanzhengma;
    }
}
