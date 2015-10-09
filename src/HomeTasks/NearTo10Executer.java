package HomeTasks;

import java.util.List;

/**
 * Created by Alien on 05-Oct-15.
 */
/*Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n. */

public class NearTo10Executer {
    int firstNumber;
    int secondNumber;

    public NearTo10Executer(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String getResult(){
        String results = "";
        int edgeNumber = 10;
        int firstResult = Math.abs(edgeNumber - this.firstNumber); /*модуль*/
        int secondResult = Math.abs(edgeNumber - this.secondNumber);

        if(firstResult == secondResult) {
            //results = String.valueOf(this.firstNumber) + " and " + String.valueOf(this.secondNumber);
            results += String.valueOf(this.firstNumber);
            results += " and ";
            results += String.valueOf(this.secondNumber);
        }else if(firstResult > secondResult){
            results += String.valueOf(this.secondNumber);
        }else{
            results += String.valueOf(this.firstNumber);
        }

        return results;
    }
}