package EtablissementScolaire;

import java.util.Date;

public class etudiant extends User{
    private String Groupe ;
    private String tuteur;
    public etudiant(String id, String nom, String prenom, String dateDeNaissance, String email, String numeroDetelephone, String groupe, String tuteur) {
        super(id, nom, prenom, dateDeNaissance, email, numeroDetelephone);
        this.tuteur = tuteur;
        this.Groupe = groupe;
    }
}

