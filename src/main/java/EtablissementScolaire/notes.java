package EtablissementScolaire;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter

public class notes {
    private  etudiant etudiant;
    private  List<historiquesDesNotes>  historiquesDesNotes;
    private double valeurInitiale;

    public notes( double valeurInitiale) {
        this.etudiant=etudiant;
        this.historiquesDesNotes = new ArrayList<>();
        this.valeurInitiale = valeurInitiale;
    }




    public void changerLaValeur (double newNote) {
        if (this.valeurInitiale != newNote) {
            historiquesDesNotes changement = new historiquesDesNotes( this.valeurInitiale,  newNote);
            this.historiquesDesNotes.add(changement);
            this.valeurInitiale = newNote;
            System.out.println("un note modifier et ajouter dans l'historique ");
        }else{
            System.out.println("aucun changement");
        }
    }

    public void seeTheHistoriquesDesNotes() {
        if (historiquesDesNotes.isEmpty()) {
            System.out.println("aucun changement !");

        }
        for (historiquesDesNotes historiquesDesNote : historiquesDesNotes) {
            System.out.println("historiquesDesNotes: " + historiquesDesNote);
        }
    }


}
