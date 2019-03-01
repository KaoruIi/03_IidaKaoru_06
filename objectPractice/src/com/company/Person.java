package com.company;

public class Person {
    public String name;
    public String area;

    public Person(){}

    public Person(String input_name, String input_area) {

        name = input_name;
        area = input_area;

    }

        public void getSelfIntroduction (){//メソッド
            System.out.println("私の名前は" + name + "です " + area + "出身です");
        }


}



