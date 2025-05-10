package com.example.SkillswapDemo.domain;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {
    private int id;
    private String login;
    private String password;
    private String name;
    private String surname;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm", timezone = "Europe/Moscow")
    private Date registrationDate;

    public User(int id, String login, String password, String name, String surname, Date registrationDate) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.registrationDate = registrationDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(int year, int month, int date) {
        this.registrationDate = new Date(year, month, date);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName (){
        return name + " " + surname;
    }

    public StringBuilder getFullInfo() {
        StringBuilder result = new StringBuilder();
        result.append("</b>User Info<br></b>")
                .append("<table border = '1', style = 'border-collapse: collapse;'>")
                .append("<tr><th>ID</th><th>Login</th><th>Name</th><th>Surname</th><th>Registration Date</th></tr>")
                .append("<tr>")
                .append("<td>").append(getId()).append("</td>")
                .append("<td>").append(getLogin()).append("</td>")
                .append("<td>").append(getName()).append("</td>")
                .append("<td>").append(getSurname()).append("</td>")
                .append("<td>").append(getRegistrationDate()).append("</td>")
                .append("</table>");
        return result;
    }
}
