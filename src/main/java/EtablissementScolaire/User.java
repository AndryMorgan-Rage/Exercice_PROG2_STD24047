package EtablissementScolaire;

import java.util.Date;

public class User {
    private final String id;
    private final String nom;
    private final String prenom;
    private final String dateDeNaissance;
    private final String email;
    private final String numeroDetelephone ;

    public User(String id, String nom, String prenom, String dateDeNaissance, String email, String numeroDetelephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.numeroDetelephone = numeroDetelephone;
    }
}
