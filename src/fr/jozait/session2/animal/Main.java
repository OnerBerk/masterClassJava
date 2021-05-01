package fr.jozait.session2.animal;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Billy");
        Loup loup = new Loup("Kurt");

        System.out.println("Je suis un dragon et je m'appel " + dragon.getName());
        dragon.eat();
        dragon.scream();

        System.out.println("\nJe suis un Loup et je m'appel " + loup.getName());
        loup.eat();
        loup.scream();

        loup.setName("\nWolf");
        System.out.println(loup.getName());
    }
}
