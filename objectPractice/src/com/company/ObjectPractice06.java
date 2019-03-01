package com.company;

import java.util.Scanner;

public class ObjectPractice06 {

    public static void main(String[] args) {


        CoinCase cc = new CoinCase();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("硬貨の種類を入力してください。");
            int input_coin = scanner.nextInt();
            System.out.println("硬貨の枚数を入力してください。");
            int input_count = scanner.nextInt();

            cc.addCoins(input_coin, input_count);
            System.out.println();

        }

            System.out.print("500円は" + cc.getCount(500) + "枚");
            System.out.print("100円は" + cc.getCount(100) + "枚");
            System.out.print("50円は" + cc.getCount(50) + "枚");
            System.out.println("10円は" + cc.getCount(10) + "枚");
            System.out.println("5円は" + cc.getCount(5) + "枚");
            System.out.println("1円は" + cc.getCount(1) + "枚");
            System.out.println("総額は" + cc.getAmount() + "円");


    }

}


