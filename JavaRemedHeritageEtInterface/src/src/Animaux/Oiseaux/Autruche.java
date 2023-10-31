package src.Animaux.Oiseaux;

import src.Comportements.ICourir;
import src.FormatMessage;

public class Autruche extends Oiseau implements ICourir {
    @Override
    public String getNom() {
        return "Autruche";
    }

    @Override
    public void cours() {
        System.out.println(FormatMessage.Format(this,"Je suis d'ailleurs le seul oiseau à savoir le faire"));
    }

    @Override
    public void vole() {
        System.out.println(FormatMessage.Format(this,"Euh... en fait non, demandez au moineau plutôt"));
    }
}
