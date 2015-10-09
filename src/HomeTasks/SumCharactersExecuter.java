package HomeTasks;

/**
 * Created by Alien on 06-Oct-15.
 */
/*Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).*/

public class SumCharactersExecuter {
    int value;

    public SumCharactersExecuter(int value) {
        this.value = Math.abs(value);
    }

    public int getResult() {
        int result = 0;
        String valueString = String.valueOf(this.value);
        for (int i = 0; i < valueString.length(); i++) {
            char digitChar = valueString.charAt(i); /* return a char code of the value */
            int digit = Character.getNumericValue(digitChar); /* Returns the {@code int} value that the specified Unicode
     * character represents. For example, the character*/
            result += digit; /*result = result + value*/
        }
        return result;
    }
}


/*public int getResult() {
        int result;
        String valueString = String.valueOf(value);
        for (int i = 0; i < valueString.length(); i++) {
        int value = (int)valueString.charAt(i);
        if(i == 0)
        result = value;
        else
        result += value;
        }

        return result;
        }
        */