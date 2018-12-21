/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queen8;

/**
 *
 * @author f1614391
 */
public class Queen8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N, x, i, j, fs, count;
        count=0;
        N = 8;
        x = 2 * N - 1;
        int q[] = new int[N];//配列を宣言して、配列変数の実体化(何個箱を作るか)
        int fy[] = new int[N];
        int fl[] = new int[x];
        int fr[] = new int[x];
        char maru = '\u3007';
        char ten = '\u30FB';

        for (q[0] = 0; q[0] <= N - 1; q[0]++) {
            for (q[1] = 0; q[1] <= N - 1; q[1]++) {
                for (q[2] = 0; q[2] <= N - 1; q[2]++) {
                    for (q[3] = 0; q[3] <= N - 1; q[3]++) {
                        for (q[4] = 0; q[4] <= N - 1; q[4]++) {
                            for (q[5] = 0; q[5] <= N - 1; q[5]++) {
                                for (q[6] = 0; q[6] <= N - 1; q[6]++) {
                                    for (q[7] = 0; q[7] <= N - 1; q[7]++) {
                                        count++;
                                        for (i = 0; i < N; i++) {
                                            fy[i] = 1;//配列変数の初期化
                                        }
                                        for (i = 0; i < 2 * N - 1; i++) {
                                            fl[i] = 1;
                                            fr[i] = 1;
                                        }
                                        fs = 1;

                                        for (i = 0; i <= N - 1; i++) {
                                            //フラグチェック
                                            if ((fy[q[i]] == 1) & (fl[i + q[i]] == 1) & (fr[q[i] + N - (i + 1)] == 1)) {
                                                fy[q[i]] = 0;
                                                fl[i + q[i]] = 0;
                                                fr[q[i] + N - (i + 1)] = 0;
                                            } else {
                                                fs = 0;
                                            }
                                        }
                                        if (fs == 1) {
                                            System.out.println(q[0] + " " + q[1] + " " + q[2] + " " + q[3] + " " + q[4] + " " + q[5] + " " + q[6] + " " + q[7] + " --> " + fs);
                                            for (i = 0; i <= N - 1; i++) {
                                                for (j = 0; j <= N - 1; j++) {
                                                    if (q[j] == i) {
                                                        System.out.print(maru);
                                                    } else {
                                                        System.out.print(ten);
                                                    }
                                                }
                                                System.out.println("");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("計算回数 = " + count);
    }
}
