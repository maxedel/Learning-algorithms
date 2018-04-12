package com.peters.hackerrank.badge;

import java.util.Scanner;

public class BreakingTheRecords {

    static int[] breakingRecords(int[] score) {
        // Complete this function
        int highestScore = score[0];
        int lowestScore = score[0];
        int highestScoreCounter = 0;
        int lowestScoreCounter = 0;
        for(int s : score){
            if (s > highestScore){
                highestScore = s;
                highestScoreCounter++;
            }
            if (s < lowestScore){
                lowestScore = s;
                lowestScoreCounter++;
            }
        }
        return new int[] {highestScoreCounter, lowestScoreCounter};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
