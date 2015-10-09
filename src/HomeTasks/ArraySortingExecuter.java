package HomeTasks;

import java.util.Random;

/**
 * Created by Alien on 08-Oct-15.
 */
/*3. Создать метод, который будет сортировать
указанный массив по возрастанию любым
известным вам способом.
*/
public class ArraySortingExecuter {
    int[] array;

    public ArraySortingExecuter() {
        this.array = new int[5];

        Random randomObj = new Random();

        for (int j = 0; j < this.array.length; j++) {
            this.array[j] = randomObj.nextInt(100);
        }
    }

    public String getResult(){
        String result = "Array before: ";
        for (int j = 0; j < this.array.length; j++) {
            result += this.array[j] + " ";
        }
        result += "\nArray after: ";
        applyDefaultSorting();
        for (int j = 0; j < this.array.length; j++) {
            result += this.array[j] + " ";
        }

        return result;
    }

    public void applyDefaultSorting(){
        for (int i = 0; i < this.array.length; i++) {
            int min = this.array[i];
            int imin = i;
            for (int j = i+1; j < this.array.length; j++) {
                if (this.array[j] < min) {
                    min = this.array[j];
                    imin = j;
                }
            }
            if (i != imin) {
                int temp = this.array[i];
                this.array[i] = this.array[imin];
                this.array[imin] = temp;
            }
        }
    }
}
