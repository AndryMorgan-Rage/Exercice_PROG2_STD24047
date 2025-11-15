package EtablissementScolaire;

import java.util.Date;

public class User {
    protected   String id;
    protected String nom;
    protected   String prenom;
    protected   String dateDeNaissance;
    protected   String email;
    protected String numeroDetelephone ;

    public User(String id, String nom, String prenom, String dateDeNaissance, String email, String numeroDetelephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.numeroDetelephone = numeroDetelephone;
    }

}
