package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
    public List<Integer> LotteryNumbers = new ArrayList<>();
    public List<Integer> ResultLottery = new ArrayList<>();

    public void GenerateNumbers(){
        for (int i = 1; i < 50; i++){
            LotteryNumbers.add(i);
        }
    }
    public void Randomize(){

        ResultLottery = LotteryNumbers.subList(0, 34);
    }
    int Result(List<Integer> lotteryNumbers){
        int number = 0;
        for (int i = 0; i < 49; i++){
            if(ResultLottery.contains(lotteryNumbers.get(i))){
                number++;
            }
        }

        return number;
    }
}
