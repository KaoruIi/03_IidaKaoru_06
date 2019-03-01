package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Word tango = new Word();

        Scanner scanner = new Scanner(System.in);

        List<Word> list = new ArrayList<>();

        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい");

        String input_word = scanner.next();
        String input_meaning = scanner.next();

        list.add();

        for (int i = 0; i < list.size(); i++) {
            System.out.println("単語：" + list.get(i).getWord() + " 意味：" + list.get(i).getMeaning());
        }

        System.out.println(list.size() + "件登録しました。");
        System.out.println();

        }
    }


