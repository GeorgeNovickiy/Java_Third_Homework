package Java_Homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(23, 123, 0, 9, -8));
        System.out.println(al);
        System.out.println("Максимальный элемент списка:" + Collections.max(al));
        System.out.println("Минимальный элемент списка:" + Collections.min(al));
        int sum=0;
        for (int s : al){
            sum += s;
        };
        System.out.println("Ср. арифм. списка:" + (sum/al.size()));
        int i = 0;
        while (i < al.size()){
            if (al.get(i) % 2 == 0) al.remove(i);
            else i++;
        }
        System.out.println("Список без четных чисел: " + al);

    }
}
