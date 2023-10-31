package src.Animaux.Félins;

import src.Animaux.IAnimal;
import src.Comportements.ICourir;
import src.Comportements.ICrier;

public abstract class Felin implements IAnimal, ICourir, ICrier {
    @Override
    public int getNombreDePattes() {
        return 4;
    }
}
