// Задание 1
// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

package Seminar.Seminar_04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        int number = GetNumber("Input the list size: ");
        ArrayList<Integer> list = ListRandom(number);
        PrintList(list);
        Collections.sort(list);
        PrintList(list);
    }

    public static int GetNumber(String text) {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static ArrayList<Integer> ListRandom(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }

    static void PrintList(ArrayList<Integer> list) {
        System.out.print("\n");
        for (Integer i : list) {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
    }
}
