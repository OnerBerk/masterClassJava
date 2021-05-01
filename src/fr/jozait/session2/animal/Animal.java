package fr.jozait.session2.animal;
/*
 * creer une class mere animal
 * cette class doit avoir une attribut nom et une methode manger
 * creer 2 class animal de votre choix qui herite de la classe animal
 * redefiniser la methode manger dans les classe enfant pour detailler ce que mange l'instance d'animal
 * definiser une interface et declarer la methode cri dedans
 * implementer cette interface par les class enfant
 * definisser la methode cri dans les class enfants pour avoir un cri par animal
 * tester la methode dans main
 */


public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}
