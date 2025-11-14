package EtablissementScolaire;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Setter
@Getter

public class Promotion {

    private final Map<String, List<etudiant>> GroupeEtudiants;


    public Promotion( List<etudiant> groupeEtudiants) {
        GroupeEtudiants = groupeEtudiants.stream().collect(Collectors.groupingBy(etudiant::getGroupe));
    }
    public void affichergroupe (){
        this.GroupeEtudiants.forEach((GroupeEtudiants, etudiants) -> {
            System.out.println("groupe : "+ GroupeEtudiants +" : "+ etudiants);
        });
    }
}


