package com.example.SkillswapDemo.domain;

public class CertifiedUser extends User{
    private String certificationId;

    public CertifiedUser(Long id,
                         String login,
                         String password,
                         String name,
                         String surname,
                         String cerficationId) {
        super(id, login, password, name, surname);
        this.certificationId = cerficationId;
    }
    public boolean isCertified (){
        return (certificationId != null && certificationId.startsWith("CERT-"));
    }
}
