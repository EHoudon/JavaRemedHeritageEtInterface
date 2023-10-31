package src.Animaux;

import src.Comportements.ICourir;
import src.FormatMessage;

public class Girafe implements IAnimal, ICourir {
    @Override
    public String getNom() {
        return "Girafe";
    }

    @Override
    public int getNombreDePattes() {
        return 4;
    }

    @Override
    public void cours() {
        System.out.println(FormatMessage.Format(this,"Pas trop vite, avec mon grand cou c'est pas pratique"));
    }
}
