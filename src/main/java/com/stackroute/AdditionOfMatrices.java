package com.stackroute;

public class AdditionOfMatrices {
    public int[][] additionOfMatrix( int[][] a, int[][] b){

        if (a == null && b == null)
            return null;


        int c[][]=new int[a.length][b.length];


        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){


                c[i][j]=a[i][j]+b[i][j];

            }
        }
        return c;
    }
}
