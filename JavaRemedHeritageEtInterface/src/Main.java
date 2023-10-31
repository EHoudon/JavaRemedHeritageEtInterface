import src.Animaux.Girafe;
import src.Animaux.IAnimal;
import src.Animaux.Chien;
import src.Animaux.Félins.Chat;
import src.Animaux.Félins.Lion;
import src.Animaux.Oiseaux.Autruche;
import src.Animaux.Oiseaux.Moineau;
import src.Comportements.ICourir;
import src.Comportements.ICrier;
import src.Comportements.IVoler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<IAnimal> animals = new ArrayList<IAnimal>();
        animals.add(new Chien());
        animals.add(new Lion());
        animals.add(new Chat());
        animals.add(new Autruche());
        animals.add(new Moineau());
        animals.add(new Girafe());

//        System.out.println("Quel est votre nom?");
//        for (IAnimal animal : animals){
//            System.out.println(animal.getNom());
//        }

        for (IAnimal animal : animals){
            if (animal instanceof ICrier){
                ((ICrier) animal).crie();
            }
        }

        System.out.println("");

        for (IAnimal animal : animals){
            if (animal instanceof ICourir){
                ((ICourir) animal).cours();
            }
        }

        animals.stream()
                .filter(animalQuiSaitCourir -> animalQuiSaitCourir instanceof ICourir)
                .map(animalQuiSaitCourir -> (ICourir) animalQuiSaitCourir)
                .forEach(animalQuiSaitCourir -> animalQuiSaitCourir.cours());

        List<ICourir> animauxQuiCourent = animals.stream()
                .filter(animalQuiSaitCourir -> animalQuiSaitCourir instanceof ICourir)
                .map(animalQuiSaitCourir -> (ICourir) animalQuiSaitCourir)
                .collect(Collectors.toList());

        for (ICourir animalQuiCoure : animauxQuiCourent){
           animalQuiCoure.cours();
        }
    }
}