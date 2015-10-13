package HomeTasks;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alien on 12-Oct-15.
 */
/*Cоздать две произвольных коллекции со
строковыми данными, сравнить содержимое,
вывести количество одинаковых и отличающихся
записей.*/

public class CompareCollectionsExecuter {

    private List<String> collection1 = new LinkedList<String>();
    private List<String> collection2 = new LinkedList<String>();

    public CompareCollectionsExecuter() {
        this.collection1.add("a");
        this.collection1.add("aaa");
        this.collection1.add("aaavas");

        this.collection2.add("b");
        this.collection2.add("bbb");
        this.collection2.add("aaavas");
        this.collection2.add("fsdgh");
    }

    public String getResult(){
        String result = "";
        int equal = 0;
        int notEqual = Math.abs(collection1.size() - collection2.size());
        for (String currentItem : collection1) {
            if (collection2.contains(currentItem)) {
                equal++;
            }
            else {
                notEqual++;
            }
        }
        result = equal + " " + notEqual;
        return result;
    }




}
