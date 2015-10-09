package HomeTasks;

import java.util.Random;

/**
 * Created by Alien on 08-Oct-15.
 */
/*6. ������� ��������� ������ �� 6 ����� �� 7 ��������
� ������ �� ��������� ����� ����� �� ������� [0;9].
������� ������ �� �����. ������������� ������
����� �������, ����� �� ������ ����� � ������
������ ����� � ���������� �������. ��� ����
�������� ������ ������� ������, � ����� ������
������������ �������� � ������ ����� ������. �������
��������� ��������� ������ �� ����� (�.�. �����
��������� ������ ���� ������������, � �����
������������� �� �������� ������ ������). �������
��������������� ������ �� �����.
*/
public class FirstHigherElementInArrayExecuter {
    int [][] array;

    public FirstHigherElementInArrayExecuter() {
        array = new int [6][7];
        Random randomObj = new Random();
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomObj.nextInt(9);
            }
        }
    }
    public String getResult(){
        String result = "";
        for(int i = 0; i < array.length; i++) {
            result += "Array " + i + ": ";
            for (int j = 0; j < array[i].length; j++) {
                result += array[i][j] + " ";
            }
            result += "\n";
        }

        for(int i = 0; i < array.length; i++) {
            int maxIndex = 0;
            int maxElementValue = array[i][maxIndex];

            for (int j = 1; j < array[i].length; j++){
                if (maxElementValue < array[i][j]){
                    maxElementValue = array[i][j];
                    maxIndex = j;
                }
            }

            if(maxIndex != 0){
                int temp = array[i][0];
                array[i][0] = maxElementValue;
                array[i][maxIndex] = temp;
            }
        }

        result += "\n============RESULT============\n";
        for(int i = 0; i < array.length; i++) {
            result += "Array " + i + ": ";
            for (int j = 0; j < array[i].length; j++) {
                result += array[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }


}
