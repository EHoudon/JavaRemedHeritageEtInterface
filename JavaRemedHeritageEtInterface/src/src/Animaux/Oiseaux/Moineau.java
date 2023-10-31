package src.Animaux.Oiseaux;

import src.Comportements.ICrier;
import src.Comportements.IVoler;
import src.FormatMessage;

public class Moineau extends Oiseau implements ICrier {
    @Override
    public String getNom() {
        return "Moineau";
    }

    @Override
    public void crie() {
        System.out.println(FormatMessage.Format(this,"cui-cui"));
    }

    @Override
    public void vole() {
        System.out.println(FormatMessage.Format(this,"Apparement je suis le seul à savoir faire ça ici"));
    }
}
