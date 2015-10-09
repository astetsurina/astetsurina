package HomeTasks;

import java.util.Arrays;

/**
 * Created by Alien on 09-Oct-15.
 */
/*4. В массиве хранится 7 явно заданных
текстовых строк. Создать программу, которая
отсортирует и выведет на экран строки в
алфавитном порядке
*/
public class ArrayAlphabeticSortingExecuter {
    String[] words = new String[] {"Zoo","Apple", "Ant", "Pen Test", "Pen", "1Mouse", "Nose"};
    public ArrayAlphabeticSortingExecuter() {
    }

    public String getResult() {
        String result = "Initial array: \n";
        result += getArrayItems(words);
        Arrays.sort(this.words);
        result += "\nSorted array:\n";
        result += getArrayItems(words);
        return result;
    }

    public String getArrayItems(String[] inputArray){
        String result = "";
        for(int i = 0; i < inputArray.length; i++){
            if (i != 0){
                result += ", ";
            }
            /*
            if( i != (array.length - 1){
                result += ","
            }
             */
            result += inputArray[i];

        }
        return result;
    }
}


