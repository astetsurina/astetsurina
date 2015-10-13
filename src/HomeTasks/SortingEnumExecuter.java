package HomeTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 * Created by Alien on 12-Oct-15.
 */
/*. � enum �������� 7 ���� ��������
��������� �����. ������� ���������, �������
����������� � ������� �� ����� ������ �
���������� �������, ��������� ���������.*/

public class SortingEnumExecuter {
    //����� ������� enum ����� ���������� ������� ���� � ������������� ����������� ������.
    public enum EnumOfStrings {
        STRING_ONE("a"),
        STRING_TWO("c"),
        STRING_THREE("d"),
        STRING_FOUR("z"),
        STRING_FIVE("y"),
        STRING_SIX("a"),
        STRING_SEVEN("b");

        private final String text;
        //����������� ����������� ������, ���� ��� �� �����, �� enum �� ����� �������� ��� ������.
        EnumOfStrings(String text) {
            this.text = text;
        }

        //������� ����� enum �������������� (Override) � ����������� �� STRING_ONE.toString()  - ��� ��������� ��������. a
        @Override
        public String toString(){
            return text;
        }
    }

    //�������� ������ ������ executer.
    List<EnumOfStrings> collection;

    //����������� ������ ���������� ������, �� ���� ��� ������ ������ � ������, � ���� ���� � ������. ������� ����� sort �� ��������.
    public SortingEnumExecuter() {
        //���������� enum � ���������. ����� ����� ���-�� ���� STRING_ONE, STRING_TWO, STRING_THREE ���.
        this.collection = Arrays.asList(EnumOfStrings.values());
    }

    //������ ����� ������� ������� ��������� � ������.
    public String getArrayItems(List<EnumOfStrings> inputArray){
        String result = "";
        for(int i = 0; i < inputArray.size(); i++){
            if (i != 0){
                result += ", ";
            }
            /*� ������� ����� ����������� ��������� ������� inputArray[i] �� ��������� ����� ���� ���������
            � ���������� ����� ������ get(i) ��������� ������� ��������� � ������ ������ � ������� STRING_ONE
            ����� �������� toString() ��� ��� ����������� �����
            @Override
            public String toString(){
                return text;
            }
            � �� ����� ����� �������� enum. �.�. ��� STRING_ONE ����� 'a'
            */
            result += inputArray.get(i).toString();
        }
        return result;
    }

    public String getResult() {
        String result = "Initial collection: \n";
        result += getArrayItems(collection);
        //��� ����� ������� ��������� collection, � ����� ��� ���������� ���������� � ����� ���������.
        Collections.sort(collection,(o1, o2) -> o1.toString().compareTo(o2.toString()));

        /*��� ���������� ����������
        Collections.sort(collection,
                new Comparator<EnumOfStrings>() {
                    public int compare(EnumOfStrings o1, EnumOfStrings o2) {
                        return o1.toString().compareTo(o2.toString());
                    }
                }
        );
        o1.toString().compareTo(o2.toString()); - �������� �������� ��� ���������
        STRING_ONE ������������ � STRING_TWO � �� � ������ ���������.
        �� �� ������ toString() � ��� ���������� a � c �������������. �.�. �� ��������� �� �� ���� ��������, � �� ��� ��������.
        */
        result += "\nSorted collection:\n";
        result += getArrayItems(collection);
        return result;
    }
}
