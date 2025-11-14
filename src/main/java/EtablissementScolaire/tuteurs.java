package EtablissementScolaire;

import java.util.Date;

public class tuteurs extends User{
    private String descriptiomDuLienAvecEtudiant;

    public tuteurs(String id, String nom, String prenom, Date dateDeNaissance, String email, String numeroDetelephone, String descriptiomDuLienAvecEtudiant) {
        super(id, nom, prenom, String.valueOf(dateDeNaissance), email, numeroDetelephone);
        this.descriptiomDuLienAvecEtudiant = descriptiomDuLienAvecEtudiant;
    }
}
