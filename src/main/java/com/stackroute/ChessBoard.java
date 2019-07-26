package com.stackroute;

public class ChessBoard {
    public String chessBoardPattern(int m, int n) {

        String arr[][]=new String[m][n];

        if(m==0 || n==0)
            return null;

        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ((i+j)%2==0 ? "WW": "BB");
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+'|');
            }
            System.out.println();
        }
        return "Pattern Formed";
    }

}


