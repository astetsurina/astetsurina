package HomeTasks;

import java.util.Random;

/**
 * Created by Alien on 09-Oct-15.
 */
/*5. Создайте массив из 4 случайных целых чисел из отрезка
[10;99], выведите его на экран в строку. Определить и
вывести на экран сообщение о том, является ли массив
возрастающей последовательностью.
*/
public class RandomDigitsArrayExecuter {
    int [] array;

    //Конструктор по умолчаниюю Массив составляется из случайных чисел.
    public RandomDigitsArrayExecuter() {
        this.array = new int[4];

        Random randomObj = new Random();

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = randomObj.nextInt(90) + 10; /*отрезок [10;99]*/
        }
    }

    //Конструктор для заданного массива
    public RandomDigitsArrayExecuter(int[] predefinedArray) {
        this.array = predefinedArray;
    }

    public String getResult() {
        Boolean isSequence = true;  /* предпологаем что у нас возрастающая последовательность*/
        int value = this.array[0];  /*берём первый элемент с которого начинать*/
        for (int i = 1; i < this.array.length; i++) { /* начинаем со второго элемента тк уже 1й использовали выше*/
            if (value < this.array[i]) {  /*должно быть всегда меньше последующего*/
                value = this.array[i]; /* присваиваем текущее значение чтобы в следующей проверки использовать его*/
            } else {
                isSequence = false;
                break; /*насильно выходим из цикла*/
            }
        }

        String result = "\nObtained array: ";
        for (int i = 0; i < this.array.length; i++){
            result += this.array[i] + " ";
        }

        if(isSequence){
            result += " This array is increasing sequence."; /*говорим что это возврастающая последовательность*/
        }else{
            result += " This array is not increasing sequence."; /*наоборот*/
        }
        return result;
    }
}
