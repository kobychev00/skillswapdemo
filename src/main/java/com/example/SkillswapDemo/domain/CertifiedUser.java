package com.example.SkillswapDemo.domain;

import java.util.Date;

public class CertifiedUser extends User{
    private String certificationId;

    public CertifiedUser(int id,
                         String login,
                         String password,
                         String name,
                         String surname,
                         Date registrationDate,
                         String certificationId) {
        super(id, login, password, name, surname, registrationDate);
        this.certificationId = certificationId;
    }

    public String getCertificationId() {
        return certificationId;
    }

    public void setCertificationId(String certificationId) {
        this.certificationId = certificationId;
    }

    public boolean isCertified (){
        return (certificationId != null && certificationId.startsWith("CERT-"));
    }
    @Override
    public String getFullName (){
        return getName() + " " + getSurname();
    }

    @Override
    public StringBuilder getFullInfo() {
        StringBuilder result = new StringBuilder();
        result.append("</b>User Info<br></b>")
                .append("<table border = '1', style = 'border-collapse: collapse;'>")
                .append("<tr><th>ID</th><th>Login</th><th>Name</th><th>Surname</th><th>Registration Date</th><th>Certification ID</th></tr>")
                .append("<tr>")
                .append("<td>").append(getId()).append("</td>")
                .append("<td>").append(getLogin()).append("</td>")
                .append("<td>").append(getName()).append("</td>")
                .append("<td>").append(getSurname()).append("</td>")
                .append("<td>").append(getRegistrationDate()).append("</td>")
                .append("<td>").append(getCertificationId()).append("</td>")
                .append("</table>");
        return result;
    }
}
