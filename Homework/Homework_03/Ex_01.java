// Задание 1
// 1.Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package Homework.Homework_03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Ex_01 {
    public static void main(String[] args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        ArrayList<Integer> arr = new ArrayList<>();
        arr = FillRandom(10);
        System.out.println("Получен новый рандомный список: " + "\n");
        PrintArray(arr);
        DeleteEvenNumbers(arr);
        PrintArray(arr);
        FindMinNumber(arr);
        FindMaxNumber(arr);
    }

    public static ArrayList<Integer> FillRandom(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static void DeleteEvenNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println("Список отфильтрован, чётные числа удалены: " + "\n");
    }

    public static void FindMinNumber(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int num = list.get(i);
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Минимальное значение в отфильтрованном списке: " + min + "\n");
    }

    public static void FindMaxNumber(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int num = list.get(i);
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное значение в отфильтрованном списке: " + max + "\n");
    }

    public static void FidMidNumber(ArrayList<Integer> list) {
        
    }

    public static void PrintArray(ArrayList<Integer> list) {
        for (Integer el : list) {
            System.out.print(el + "\t");
        }
        System.out.println("\n");
    }
}
