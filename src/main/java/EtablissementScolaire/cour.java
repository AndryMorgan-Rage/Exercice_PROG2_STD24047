package EtablissementScolaire;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
public class cour {
    private int id ;
    private String label;
    private int credits;
    private String enseignant;
    private List<Examen> examens;



}
