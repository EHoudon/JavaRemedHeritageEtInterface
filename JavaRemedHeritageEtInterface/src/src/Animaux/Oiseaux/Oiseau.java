package src.Animaux.Oiseaux;

import src.Animaux.IAnimal;
import src.Comportements.ICrier;
import src.Comportements.IVoler;

public abstract class Oiseau implements IAnimal, IVoler{
    @Override
    public int getNombreDePattes() {
        return 2;
    }

}
