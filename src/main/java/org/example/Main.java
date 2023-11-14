package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int l = 0; l < 5; l++) {
                if (i == 0) {
                    System.out.println("Введите текст элемента " + (l + 1)  + " для массива " + (i + 1) + ": ");
                    listA.add(scanner.nextLine());
                } else {
                    System.out.println("Введите текст элемента " + (l + 1)  + " для массива " + (i + 1) + ": ");
                    listB.add(scanner.nextLine());
                }
            }
            if (i == 0) System.out.println(listA); else System.out.println(listB);
        }
        System.out.println("------------------------------------------------------------------------------");
        Collections.reverse(listB);
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println(listC);
        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);
    }
}