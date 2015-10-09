package HomeTasks;

import java.util.Random;

/**
 * Created by Alien on 08-Oct-15.
 */
/*2. ������� �����, ������� ����� �������� ���������
������ �� ����� � ������. � ������� ����������
������ ��������� 5 �������� �� 10 ���������
������ ���������� ������� � ������� ��� 5
�������� �� �����, ������ �� ��������� ������.
*/
public class EchoArrayExecuter {
    int[][] array;

    public EchoArrayExecuter() {
        array = new int[5][10];

        Random randomObj = new Random();
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomObj.nextInt();
            }
        }
    }

    public String getResult(){
        String result = "";

        for(int i = 0; i < array.length; i++) {
            result += "Array " + i + ":";
            for (int j = 0; j < array[i].length; j++) {
                result += array[i][j] + " ";
            }
            result += "\n";
        }

        return result;
    }
}
