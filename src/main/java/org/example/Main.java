package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сумма вклада клиента: ");
        double x = sc.nextDouble();
        System.out.println("Процентная ставка: ");
        double Percent = sc.nextDouble();
        System.out.println("Количество периодов начислений процентов: ");
        int Quantity = sc.nextInt();
        double sum = x;
        for (int i = 0; i < Quantity; i++) {
            sum += sum * (Percent / 100);
        }
        System.out.println("Итоговая сумма вклада: " + sum);
    }
}