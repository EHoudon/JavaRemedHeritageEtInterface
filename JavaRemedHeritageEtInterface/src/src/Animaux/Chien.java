package src.Animaux;

import src.Comportements.ICourir;
import src.Comportements.ICrier;
import src.FormatMessage;

public class Chien implements IAnimal, ICourir, ICrier {
    @Override
    public String getNom() {
        return "Chien";
    }

    @Override
    public int getNombreDePattes() {
        return 4;
    }

    @Override
    public void cours() {
        System.out.println(FormatMessage.Format(this,"J'adore ça"));
    }

    @Override
    public void crie() {
        System.out.println(FormatMessage.Format(this,"Wouaff"));
    }
}
