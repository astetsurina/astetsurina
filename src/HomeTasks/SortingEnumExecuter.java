package HomeTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 * Created by Alien on 12-Oct-15.
 */
/*. В enum хранится 7 явно заданных
текстовых строк. Создать программу, которая
отсортирует и выведет на экран строки в
алфавитном порядке, используя коллекции.*/

public class SortingEnumExecuter {
    //чтобы создать enum строк необходимо сделать энам с конструктором принимающим строку.
    public enum EnumOfStrings {
        STRING_ONE("a"),
        STRING_TWO("c"),
        STRING_THREE("d"),
        STRING_FOUR("z"),
        STRING_FIVE("y"),
        STRING_SIX("a"),
        STRING_SEVEN("b");

        private final String text;
        //конструктор принимающий строку, если его не будет, то enum не будет понимать что строка.
        EnumOfStrings(String text) {
            this.text = text;
        }

        //базовый метод enum переписывается (Override) и возращается по STRING_ONE.toString()  - его строковое значение. a
        @Override
        public String toString(){
            return text;
        }
    }

    //свойство твоего класса executer.
    List<EnumOfStrings> collection;

    //конструктор твоего эксекьютер класса, ТЫ ВЕСЬ КОД ПИСАЛА ПРОСТО В КЛАССЕ, а надо было в методе. Поэтому метод sort не находило.
    public SortingEnumExecuter() {
        //превращаем enum в коллекцию. здесь будет что-то типа STRING_ONE, STRING_TWO, STRING_THREE итд.
        this.collection = Arrays.asList(EnumOfStrings.values());
    }

    //просто метод который выовдит коллекцию в строку.
    public String getArrayItems(List<EnumOfStrings> inputArray){
        String result = "";
        for(int i = 0; i < inputArray.size(); i++){
            if (i != 0){
                result += ", ";
            }
            /*в массиве можно достучаться следующим образом inputArray[i] но коллекция имеет свой интерфейс
            в коллекциях нужно писать get(i) возарщает элемент коллекции в данном случае к примеру STRING_ONE
            потом вызываем toString() это наш переписаный метод
            @Override
            public String toString(){
                return text;
            }
            и он вернёт текст значения enum. т.е. для STRING_ONE вернёт 'a'
            */
            result += inputArray.get(i).toString();
        }
        return result;
    }

    public String getResult() {
        String result = "Initial collection: \n";
        result += getArrayItems(collection);
        //это метод который сортирует collection, а после это компаратор записанный в лямда выражении.
        Collections.sort(collection,(o1, o2) -> o1.toString().compareTo(o2.toString()));

        /*это аналогично следующему
        Collections.sort(collection,
                new Comparator<EnumOfStrings>() {
                    public int compare(EnumOfStrings o1, EnumOfStrings o2) {
                        return o1.toString().compareTo(o2.toString());
                    }
                }
        );
        o1.toString().compareTo(o2.toString()); - значение элемента для сравнения
        STRING_ONE сравнивается с STRING_TWO и тд с каждым элементом.
        но мы делаем toString() а это возарвщает a и c соответсвенно. т.е. мы сортируем не по энам элементу, а по его значению.
        */
        result += "\nSorted collection:\n";
        result += getArrayItems(collection);
        return result;
    }
}
