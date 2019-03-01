package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Word tango = new Word();
        Scanner scanner = new Scanner(System.in);
        String[] word = new String[9];

        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい");


        while (String input_word != "e") {

            System.out.print("次の単語と意味を入力して下さい。”e”で終了します。");
            String input_word = scanner.next();
            String input_meaning = scanner.next();

            System.out.println();
        }
    }


        for (int i = 0; i < ; i++) {
            System.out.println("単語：" + tango.getWord() + " 意味：" + tango.getMeaning());
        }
        System.out.println( + "件登録しました。");



    }

