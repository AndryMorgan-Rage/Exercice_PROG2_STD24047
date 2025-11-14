package EtablissementScolaire;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Examen {
    private int id;
    private String titre;
    private cour courRattacher;
    private String DateAndHours ;
    private int coefficience;
    private List<historiquesDesNotes> historiquesDesNotes;


    public Examen(int id, String titre,  cour courRattacher , String dateAndHours, int coefficience) {
        this.id = id;
        this.titre = titre;
        this.courRattacher = courRattacher;
        DateAndHours = dateAndHours;
        this.coefficience = coefficience;

    }


    public double calculeNote(List<Examen> examen) {

     {
        if (historiquesDesNotes == null ) {
            return 0.00;
        }
        double calculDenoteEtcoefficien = historiquesDesNotes.stream()
                .mapToDouble(historiquesDesNotes -> historiquesDesNotes.getNewNote()*coefficience)
                .sum();
        }
        double sumCoefficience = examen.stream().mapToDouble(Examen::getCoefficience).sum();
    return 0;
    }



}
