package jp.ac.uryukyu.ie.e185726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io .*;

public class Main {
    //勝敗数をカウントする変数
    static int win = 0;
    static int lose = 0;

    //もう一度やるか
    static boolean retry = true;

    public static void main(String[] args) {
        // TODO code application logic here
        //「グー」「チョキ」「パー」の定数
        final int GU = 0;
        final int CHO = 1;
        final int PA = 2;

        //プレイヤーが打ち込む文字
        String gu = "グー";
        String cho = "チョキ";
        String pa = "パー";



        System.out.println("じゃんけんの時間だ！絶対勝つ");
        //プレイヤー打ち込んだ文字を受け取る
        while (retry) {
            try {
                //入力ストリームの生成

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String player;
                while (true) {
                    //「グー」「チョキ」「パー」のどれかを打ち込んで下さいと表示。
                    System.out.println("「グー」「チョキ」「パー」のどれかを打ち込んで下さい　⇒　");
                    player = br.readLine();
                    if (gu.equals(player) || cho.equals(player) || pa.equals(player)) {
                        System.out.println("あなたが出したのは「" + player + "」です。");
                        break;
                    } else {
                        System.out.println("「グー」「チョキ」「パー」以外は打ち込まないで下さい");
                    }
                }
                int cpu = (int) (Math.random() * 3);
                //cpuが出す役
                if (cpu == GU) {
                    System.out.println("私が出したのは「グー」です！！");
                } else if (cpu == CHO) {
                    System.out.println("私が出したのは「チョキ」です！！");
                } else if (cpu == PA) {
                    System.out.println("私が出したのは「パー」です！！");
                }
                switch (cpu) {
                    case 0:
                        if (gu.equals(player)) {
                            System.out.println("あいこでしょ");
                        } else if (cho.equals(player)) {
                            System.out.println("あなたの負けです！ざんねん！");

                            lose += 1;
                            Try more = new Try();
                            Result vs = new Result();
                        } else if (pa.equals(player)) {
                            System.out.println("あなたの勝ちです！");

                            win += 1;
                            Try more = new Try();
                            Result vs = new Result();
                        }
                        break;
                    case 1:
                        if (gu.equals(player)) {
                            System.out.println("あなたの勝ちです！");

                            win += 1;
                            Try more = new Try();
                            Result vs = new Result();
                        } else if (cho.equals(player)) {
                            System.out.println("あいこでしょ");
                        } else if (pa.equals(player)) {
                            System.out.println("あなたの負けです！");

                            lose += 1;
                            Try more = new Try();
                            Result vs = new Result();
                        }
                        break;
                    case 2:
                        if (gu.equals(player)) {
                            System.out.println("あなたの負けです！ざんねん！");

                            lose += 1;
                            Try more = new Try();
                            Result vs = new Result();
                        } else if (cho.equals(player)) {
                            System.out.println("あなたの勝ちです！やったね！！");

                            win += 1;
                            Try more = new Try();
                            Result vs = new Result();
                        } else if (pa.equals(player)) {
                            System.out.println("あいこでしょ");
                        }
                        break;

                }

            } catch (IOException e) {
                System.out.println("Exception :" + e);
            }
        }


    }




}




