package src.Animaux.Félins;

import src.FormatMessage;

public class Lion extends Felin {
    @Override
    public String getNom() {
        return "Lion";
    }

    @Override
    public void cours() {
        System.out.println(FormatMessage.Format(this,"Seulement pour chasser le gnou"));
    }

    @Override
    public void crie() {
        System.out.println(FormatMessage.Format(this,"Roaaar"));
    }
}
