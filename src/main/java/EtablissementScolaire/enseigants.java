package EtablissementScolaire;

import java.util.Date;

public class enseigants extends User{
    private String specialites;

    public enseigants(String id, String nom, String prenom, Date dateDeNaissance, String email, String numeroDetelephone, String specialites) {
        super(id, nom, prenom, String.valueOf(dateDeNaissance), email, numeroDetelephone);
        this.specialites = specialites;
    }
}
