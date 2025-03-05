package com.example.SkillswapDemo.domain;

public class PremiumUser extends CertifiedUser{
    private String premiumId;

    public PremiumUser(Long id,
                       String login,
                       String password,
                       String name,
                       String surname,
                       String cerficationId,
                       String premiumId) {
        super(id, login, password, name, surname, cerficationId);
        this.premiumId = premiumId;
    }

    public boolean isPremium (){
        return premiumId != null && premiumId.startsWith("PREM-");
    }
}
