package src;

import src.Animaux.IAnimal;

public class FormatMessage {
    public static String Format(IAnimal animal, String message){
        return String.format("%s: %s", animal.getNom(), message);
    }
}
