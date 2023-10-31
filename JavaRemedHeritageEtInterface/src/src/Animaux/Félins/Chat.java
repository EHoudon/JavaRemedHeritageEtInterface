package src.Animaux.Félins;

import src.FormatMessage;

public class Chat extends Felin{
    @Override
    public String getNom() {
        return "Chat";
    }

    @Override
    public void cours() {
        System.out.println(FormatMessage.Format(this, "Quand j'aurai fini ma sieste"));
    }

    @Override
    public void crie() {
        System.out.println(FormatMessage.Format(this,"Miaouuuu"));
    }
}
