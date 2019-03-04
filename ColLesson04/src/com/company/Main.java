package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Word> words = new ArrayList<>();

        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        int index = 0;
        while (!input.equals("e")) {

            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0], tmp[1]);
            words.add(wd);
            index++;

            System.out.println("次の単語と意味を入力して下さい。”e”で終了します。");
            input = scanner.nextLine();

        }

            for (int i = 0; i < index; i++) {
                System.out.println("単語：" + words.get(i).word + " 意味：" + words.get(i).meaning);
            }


            System.out.println( index + "件、登録しました。");

        }

    }

