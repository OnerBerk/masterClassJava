package fr.jozait.session2.animal;

public class Loup extends Animal implements Scream.AnimalScream {
    public Loup(String name) {
        super(name);
    }

    @Override
    public void scream() {
        System.out.println("WAouuuuhhhhhh");
    }

    @Override
    public void eat() {
        System.out.println("i eat some Lambs");
    }
}
