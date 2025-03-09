package com.example.SkillswapDemo.domain;

public class CertifiedUser extends User{
    private String certificationId;

    public CertifiedUser(int id,
                         String login,
                         String password,
                         String name,
                         String surname,
                         String certificationId) {
        super(id, login, password, name, surname);
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
    public String getFullInfo () {
        return "<b>User info:</b><br>"
                + getId() + "<br>"
                + getLogin() + "<br>"
                + getName() + "<br>"
                + getSurname() + "<br>"
                + getCertificationId() + "<br>";
    }
}
