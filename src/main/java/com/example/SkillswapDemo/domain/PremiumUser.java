package com.example.SkillswapDemo.domain;

public class PremiumUser extends CertifiedUser{
    private String premiumId;

    public PremiumUser(int id,
                       String login,
                       String password,
                       String name,
                       String surname,
                       String certificationId,
                       String premiumId) {
        super(id, login, password, name, surname, certificationId);
        this.premiumId = premiumId;
    }

    public boolean isPremium (){
        return premiumId != null && premiumId.startsWith("PREM-");
    }

    @Override
    public String getFullInfo() {
        return "<b>User info:</b><br>"
                + getId() + "<br>"
                + getLogin() + "<br>"
                + getName() + "<br>"
                + getSurname() + "<br>"
                + getCertificationId() + "<br>"
                + premiumId + "<br>";
    }
}
