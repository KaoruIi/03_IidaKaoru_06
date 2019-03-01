package com.company;



public class CoinCase {

    public int fiveHundred;
    public int hundred;
    public int fifty;
    public int ten;
    public int five;
    public int one;


    public int addCoins(int input_coin, int input_count) {
        if (input_coin == 500) {
            fiveHundred = fiveHundred + input_count;
        } else if (hundred == 100) {
            hundred = hundred + input_count;
        } else if (fifty == 50) {
            fifty = fifty + input_count;
        } else if (ten == 10) {
            ten = ten + input_count;
        } else if (five == 5) {
            five = five + input_count;
        } else if (one == 1) {
            one = one + input_count;
        }
        return 0;
    }


        //硬貨が何枚あるか

    public int getCount(int input_coin) {
        if (input_coin == 500) {
            return fiveHundred;
        } else if (input_coin == 100) {
            return hundred;
        } else if (input_coin == 50) {
            return fifty;
        } else if (input_coin == 10) {
            return ten;
        } else if (input_coin == 5) {
            return five ;
        } else if (input_coin == 1) {
            return one;
        }
        return 0;
    }


        //総額

        public int getAmount() {
            return (fiveHundred * 500 + hundred * 100 + fifty * 50 + ten * 10 + five * 5 + one);
        }


    }
