package EtabissementTest;

import EtablissementScolaire.Examen;
import EtablissementScolaire.cour;
import EtablissementScolaire.etudiant;
import EtablissementScolaire.notes;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class scolaireTest {
    @Test
    public void test1SurLaNote() {
        etudiant morgan = new etudiant("std001","morgan","andry","14/07/05","email.hei","10333","K1","voahirana");
        notes morganNote = new notes(12.90);

        morganNote.setEtudiant(morgan);
        morganNote.changerLaValeur(15.00);
        morganNote.seeTheHistoriquesDesNotes();
    }

}
