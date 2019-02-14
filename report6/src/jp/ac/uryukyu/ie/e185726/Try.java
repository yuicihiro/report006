package jp.ac.uryukyu.ie.e185726;

public class Try {
    private static void retry() {
        boolean retry = true;

        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("もう一度続ける場合は「1」を入力して下さい");
            int re = sc.nextInt();
            if (re == 1) {
                System.out.println("よし！もう一回勝負しましょう！");
            } else {
                retry = false;
            }
        } catch (Exception e) {
            retry = false;;
        }
    }
}