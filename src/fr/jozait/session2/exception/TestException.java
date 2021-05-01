package fr.jozait.session2.exception;

/*
 * creer une exception qui s'appelleras NotEvenException
 * creer une methode qui prend un nombre en entree et retourne une exceptions avec msg "le nbr est impair " si il l'es
 * dans la methode main appeler la methode creer en lui donnant un, ombre impair
 */

public class TestException {

    public static void isEven(int number) throws NotEvenException {
        if (number % 2 != 0) {
            throw new NotEvenException("Le nombre est impair");
        }
    }

    public static void main(String[] args) {
        try {
            isEven(5);
        } catch (NotEvenException e) {
            e.printStackTrace();
        }
    }

}
