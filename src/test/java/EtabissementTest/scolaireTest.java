package EtabissementTest;

import EtablissementScolaire.Examen;
import EtablissementScolaire.Promotion;
import EtablissementScolaire.Service;
import EtablissementScolaire.cour;
import EtablissementScolaire.etudiant;
import EtablissementScolaire.notes;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class scolaireTest {
    @Test
    public void test() {
        etudiant morgan = new etudiant("std001","morgan","andry","14/07/05","email.hei","10333","K1","voahirana");

        notes morganNote = new notes(12.90);

        morganNote.setEtudiant(morgan);
        morganNote.changerLaValeur(15.00);
        morganNote.seeTheHistoriquesDesNotes();



       List<etudiant> etudiants = List.of(
               new etudiant(
                       "1001",
                       "Ranaivo",
                       "Harisoa",
                       "2003-09-12", // La date est une simple chaîne
                       "h.ranaivo@ecole.mg",
                       "0320101010",
                       "K1",
                       "M. Dupont"
               ),

        new etudiant(
                "1002",
                "Rakoto",
                "Fanilo",
                "2002-05-25", // La date est une simple chaîne
                "f.rakoto@ecole.mg",
                "0320202020",
                "K2",
                "Mme Rasoa"
        ),

        new etudiant(
                "1003",
                "Andrianina",
                "Mamy",
                "2004-11-03",
                "m.andrianina@ecole.mg",
                "0320303030",
                "K3",
                "M. Dupont"
        ),

        new etudiant(
                "1004",
                "Vololona",
                "Lova",
                "2003-01-01",
                "l.vololona@ecole.mg",
                "0320404040",
                "K1",
                "Mme Rasoa"
        ),
        new etudiant(
                "1005",
                "Randria",
                "Tojo",
                "30/07/2002", // Changement de format (si votre application le supporte)
                "t.randria@ecole.mg",
                "0320505050",
                "K2",
                "M. Rakotobe"
        ),

        new etudiant(
                "1006",
                "Razafy",
                "Nirina",
                "2004-02-14",
                "n.razafy@ecole.mg",
                "", // Téléphone vide
                "K3",
                "Mme Rasoa"
        ),

        new etudiant(
                "1007",
                "Haja",
                "Tiana",
                "2005-10-08",
                "t.haja@ecole.mg",
                "0320707070",
                "K4",
                "Mme Fara"
        ),

        new etudiant(
                "1008",
                "Bema",
                "Lalao",
                "2003-04-01",
                "l.bema@ecole.mg",
                "0320808080",
                "K1",
                "M. Dupont"
        ),

        new etudiant(
                "1009",
                "Sitraka",
                "Manjaka",
                "2006-12-31",
                "m.sitraka@ecole.mg",
                "0320909090",
                "K2",
                "M. Rakotobe"
        ),


        new etudiant(
                "1010",
                "Vonjy",
                "Fanja",
                "2002-03-20",
                "f.vonjy@ecole.mg",
                "0321010100",
                "K3",
                "N/A"
        )


       );

        Promotion mapromotion = new Promotion((List<etudiant>) etudiants);

        mapromotion.affichergroupe();



    }

}
