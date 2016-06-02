/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15936
 */
public class Matrix {

    public static double[][] multiply(double tab1[][], double tab2[][]) {
        int tab1k = tab1[0].length;
        int tab1w = tab1.length;
        int tab2k = tab2[0].length;
        int tab2w = tab2.length;
        double result[][] = new double[tab1w][tab2k];
        if (tab1k == tab2w) {
            for (int i = 0; i < tab1w; i++) {
                for (int j = 0; j < tab2k; j++) {
                    for (int k = 0; k < tab1k; k++) {
                        result[i][j] += tab1[i][k] * tab2[k][j];
                    }
                }
            }
        }
        return result;
    }
    public static String toString(double tab[][]) {
        String str="";
        int l=tab[0].length;
        for (int i=0;(i<tab.length);i++)
        {
            for (int j=0;j<l;j++)
            {
                str = str + tab[i][j] + " ";
            }
            str = str + "\n";
        }
        return str;
    }
    public static double[][] fill4x4v2d(double[][] result, double length, double angle) {
        //tworzenie macierzy, uciekalaby pamiec
        //double[][] result = new double[4][4];
        angle=Math.toRadians(angle);
        result[0][0]=Math.cos(angle);
        result[0][1]=-Math.sin(angle);
        result[0][2]=0;
        result[0][3]=length;
        result[1][0]=-result[0][1];
        result[1][1]=result[0][0];
        result[1][2]=0;
        result[1][3]=0;
        result[2][0]=0;
        result[2][1]=0;
        result[2][2]=1;
        result[2][3]=0;
        result[3][0]=0;
        result[3][1]=0;
        result[3][2]=0;
        result[3][3]=1;
        return result;
    }
    public static double[][] fill4x1v2d(double[][] result, double length) {
        //tworzenie macierzy, uciekalaby pamiec
        //double[][] result = new double[4][4];
        result[0][0]=length;
        result[1][0]=0;
        result[2][0]=0;
        result[3][0]=1;
        return result;
    }
}
