package HomeTasks;

import java.util.Random;

/**
 * Created by Alien on 09-Oct-15.
 */
/*5. �������� ������ �� 4 ��������� ����� ����� �� �������
[10;99], �������� ��� �� ����� � ������. ���������� �
������� �� ����� ��������� � ���, �������� �� ������
������������ �������������������.
*/
public class RandomDigitsArrayExecuter {
    int [] array;

    //����������� �� ���������� ������ ������������ �� ��������� �����.
    public RandomDigitsArrayExecuter() {
        this.array = new int[4];

        Random randomObj = new Random();

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = randomObj.nextInt(90) + 10; /*������� [10;99]*/
        }
    }

    //����������� ��� ��������� �������
    public RandomDigitsArrayExecuter(int[] predefinedArray) {
        this.array = predefinedArray;
    }

    public String getResult() {
        Boolean isSequence = true;  /* ������������ ��� � ��� ������������ ������������������*/
        int value = this.array[0];  /*���� ������ ������� � �������� ��������*/
        for (int i = 1; i < this.array.length; i++) { /* �������� �� ������� �������� �� ��� 1� ������������ ����*/
            if (value < this.array[i]) {  /*������ ���� ������ ������ ������������*/
                value = this.array[i]; /* ����������� ������� �������� ����� � ��������� �������� ������������ ���*/
            } else {
                isSequence = false;
                break; /*�������� ������� �� �����*/
            }
        }

        String result = "\nObtained array: ";
        for (int i = 0; i < this.array.length; i++){
            result += this.array[i] + " ";
        }

        if(isSequence){
            result += " This array is increasing sequence."; /*������� ��� ��� ������������� ������������������*/
        }else{
            result += " This array is not increasing sequence."; /*��������*/
        }
        return result;
    }
}
