package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Word[] words = new Word[10];

        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int index = 0;
        while (!input.equals("e")) {

            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0], tmp[1]);

            //例外処理
            try {
                words[index] = wd;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                break;
            }

            words[index] = wd;
            index++;

            System.out.println("次の単語と意味を入力して下さい。”e”で終了します。");
            input = scanner.nextLine();
        }

            for (int i = 0; i < index; i++) {
                System.out.println("単語：" + words[i].word + " 意味：" + words[i].meaning);
            }
            System.out.println(index + "件、登録しました。");

        }

    }
