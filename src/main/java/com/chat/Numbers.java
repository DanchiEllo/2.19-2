package com.chat;

import java.util.Scanner;

public class Numbers {
    private final Scanner in = new Scanner(System.in);
    private float a;
    private float b;
    private float c;

    public void goTask() {
        this.setNumbers();
        this.numbersMultiplesOfFive();
        this.integerDivisionAB();
        this.dividingAB();
        this.dividingABCeil();
        this.dividingABFloor();
        this.dividingABRound();
        this.remainderDivisionBC();
        this.smallestAB();
        this.biggestBC();
    }

    private void setNumbers() {
        System.out.println("Введите числа a, b и c");
        System.out.print("a: ");
        a = in.nextInt();

        System.out.print("b: ");
        b = in.nextInt();

        System.out.print("c: ");
        c = in.nextInt();
    }

    private void numbersMultiplesOfFive() {
        System.out.println("\nПеременные кратные 5-ти:");
        String answer = "";
        if ((int) a % 5 == 0) {
            answer += ("a=" + Math.round(a) + " ");
        } if ((int) b % 5 == 0) {
            answer += ("b=" + Math.round(b) + " ");
        } if ((int) c % 5 == 0) {
            answer += ("c=" + Math.round(c) + " ");
        }
        if ((int) a % 5 != 0 && (int) b % 5 != 0 && (int) c % 5 != 0) {
            System.out.println("Нет значений кратных 5-ти");
        } else {
            answer = answer.trim().replaceAll(" ", ", ");
            System.out.println(answer);
        }
    }

    private void integerDivisionAB() {
        System.out.println("\nЦелочисленное деление a на b");
        System.out.println((int) (a/b));
    }

    private void dividingAB() {
        System.out.println("\nДеление a на b");
        System.out.println((a/b));
    }

    private void dividingABCeil() {
        System.out.println("\nРезультат деления a на b в большую сторону");
        System.out.println(Math.ceil(a/b));
    }

    private void dividingABFloor() {
        System.out.println("\nРезультат деления a на b в меньшую сторону");
        System.out.println(Math.floor(a/b));
    }

    private void dividingABRound() {
        System.out.println("\nРезультат деления a на b мат. округление");
        System.out.println(Math.round(a/b));
    }

    private void remainderDivisionBC() {
        System.out.println("\nОстаток от деления b на c");
        System.out.println(b % c);
    }

    private void smallestAB() {
        System.out.println("\nМеньшее из a и b");
        System.out.println(Math.min(a, b));
    }

    private void biggestBC() {
        System.out.println("\nБольшее из b и c");
        System.out.println(Math.max(b, c));
    }

}
