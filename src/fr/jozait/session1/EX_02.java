package fr.jozait.session1;

import java.util.Scanner;

/*
 *entrez une chaine de caracteres
 * afficher la chainr de caracters
 * afficher sa taille
 * afficher la en miniscule
 * afficher la en majuscule
 * ordonner les lettre par ordre alphabetique avce une bouble
 * afficher la chaine de caractere a l'envers
 * afficher true si c'est un palindrome
 *
 */

public class EX_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("entrez un texte : ");
        String chaine = scan.nextLine();
        char temp = ' ';
        char[] chars = new char[chaine.length()];
        //char[] est le type array que l'on declare avec un nombre de caractere

        System.out.println("mon texte est :" + chaine);
        System.out.println("la longueur est de :" + chaine.length());
        System.out.println("mon texte en miniscule :" + chaine.toLowerCase());
        System.out.println("mon texte en majuscule :" + chaine.toUpperCase());

        for (int i = 0; i < chaine.length(); i++) {
            chars[i] = chaine.charAt(i);
            //Retourne le caractère de la chaîne correspondant
            // à la position indiquée en paramètre de charAt().
            System.out.println(chars[i]);
        }

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] > chars[i + 1]) {
                temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
                i = -1;
            }
        }

        String chaineSorted = "";
        for (int i = 0; i < chars.length; i++) {
            chaineSorted = chaineSorted + chars[i];
        }
        System.out.println("Triée : " + chaineSorted);


        String chaineReversed = "";
        for (int i = chaine.length() - 1; i >= 0; i--) {
            chaineReversed = chaineReversed + chaine.charAt(i);
        }
        System.out.println("Inverse : " + chaineReversed);

        if (chaine.equals(chaineReversed)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
