package EtablissementScolaire;

import java.time.LocalDateTime;

public class historiquesDesNotes {
    private double ancienNote;
    private double newNote;
    private LocalDateTime dateAndTime;

    public historiquesDesNotes( double newNote, double ancienNote) {
        this.dateAndTime = dateAndTime;
        this.newNote = newNote;
        this.ancienNote = ancienNote;
    }

    public double getAncienNote() {
        return ancienNote;
    }

    public void setAncienNote(int ancienNote) {
        this.ancienNote = ancienNote;
    }

    public double  getNewNote() {
        return newNote;
    }

    public void setNewNote(int newNote) {
        this.newNote = newNote;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public String toString() {
        return "L'ancienne note : "+ ancienNote +"et voici la nouvelle note : "+ newNote +" fait le : "+ LocalDateTime.now();
    }
}
