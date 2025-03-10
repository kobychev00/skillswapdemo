package com.example.SkillswapDemo.domain;

import java.util.Date;

public class PremiumUser extends CertifiedUser{
    private String premiumId;

    public PremiumUser(int id,
                       String login,
                       String password,
                       String name,
                       String surname,
                       Date registrationDate,
                       String certificationId,
                       String premiumId) {
        super(id, login, password, name, surname, registrationDate, certificationId);
        this.premiumId = premiumId;
    }

    public String getPremiumId() {
        return premiumId;
    }

    public boolean isPremium (){
        return premiumId != null && premiumId.startsWith("PREM-");
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
                .append("<tr><th>ID</th><th>Login</th><th>Name</th><th>Surname</th><th>Registration Date</th><th>Certification ID</th><th>Premium ID</th></tr>")
                .append("<tr>")
                .append("<td>").append(getId()).append("</td>")
                .append("<td>").append(getLogin()).append("</td>")
                .append("<td>").append(getName()).append("</td>")
                .append("<td>").append(getSurname()).append("</td>")
                .append("<td>").append(getRegistrationDate()).append("</td>")
                .append("<td>").append(getCertificationId()).append("</td>")
                .append("<td>").append(getPremiumId()).append("</td>")
                .append("</table>");
        return result;
    }
}
