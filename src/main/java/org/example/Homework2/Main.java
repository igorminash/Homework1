package org.example.Homework2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static org.example.Homework2.DataBase.getLaptopList;
import static org.example.Homework2.Filter.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notebook> laptops = getLaptopList();
        HashMap<Integer, String> sortingValues = getSort();
        HashMap<String, ArrayList<String>> allStr = getChoices(sortingValues, laptops);
        Scanner sc = new Scanner(System.in);
        int firstChoice = filterFirst(sortingValues, sc);
        int secondChoice = filterSecond(sortingValues, laptops, allStr, sc, firstChoice);
        filterFinal(firstChoice, secondChoice, allStr, laptops);
        sc.close();
    }
}
