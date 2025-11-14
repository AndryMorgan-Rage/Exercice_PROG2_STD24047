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
    private List<cour> MatiereRattacher;
    private String DateAndHours ;
    private int coefficience;
    private historiquesDesNotes historiquesDesNotes;

    public Examen(int id, String titre, List<cour> MatiereRattacher, String dateAndHours, int coefficience) {
        this.id = id;
        this.titre = titre;
        this.MatiereRattacher = new ArrayList<>();
        DateAndHours = dateAndHours;
        this.coefficience = coefficience;
    }



@Override
    public String toString() {
        return "l'examen avec l'id : " + id + " "+titre +" "+ MatiereRattacher.stream().map(cour::getLabel) + DateAndHours + (historiquesDesNotes.getAncienNote()*coefficience+historiquesDesNotes.getNewNote()*coefficience)/coefficience+coefficience ;
}
}
