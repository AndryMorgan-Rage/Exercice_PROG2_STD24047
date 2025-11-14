package EtablissementScolaire;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class historiquesDesNotes {
    private double ancienNote;
    private double newNote;
    private LocalDateTime dateAndTime;

    public historiquesDesNotes( double newNote, double ancienNote) {
        this.dateAndTime = dateAndTime;
        this.newNote = newNote;
        this.ancienNote = ancienNote;
    }



    @Override
    public String toString() {
        return "L'ancienne note : "+ ancienNote +"et voici la nouvelle note : "+ newNote +" fait le : "+ LocalDateTime.now();
    }
}
