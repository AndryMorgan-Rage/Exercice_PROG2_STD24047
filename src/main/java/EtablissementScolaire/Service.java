package EtablissementScolaire;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Service {
    private Examen examen;
    private etudiant etudiant;
    private notes note ;
    private historiquesDesNotes historiquesDesNotes;

    public double getExamenGrade(Examen examen, etudiant etudiant, Instant t) {
        List<Examen>examens = new ArrayList<>();
        examens.add(examen);
        double noteFinaleExamen = examen.calculeNote(examens);
        Instant dateActuelle =Instant.now();
        System.out.println("voici la note de l'examen de : "+ noteFinaleExamen + "de l'etudiant : " + etudiant.getnom()+ " " +dateActuelle) ;
        return noteFinaleExamen;
    };

    public double getCourseGrade (cour cour, etudiant etudiant, Instant t) {
      List<notes> note =  new ArrayList<>();
      note.stream()
              .map(notes -> getHistoriquesDesNotes())
              .count();

        return 0;
    }
}


