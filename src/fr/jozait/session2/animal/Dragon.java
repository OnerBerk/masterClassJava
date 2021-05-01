package fr.jozait.session2.animal;

public class Dragon extends Animal implements Scream.AnimalScream {
    public Dragon(String name) {
        super(name);
    }

    @Override
    public void scream() {
        System.out.println("RRRRRrrrrrrrr");
    }

    @Override
    public void eat() {
        System.out.println("i eat some bambou");
    }
}
