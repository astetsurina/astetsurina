package HomeTasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.UUID;

/**
 * Created by Alien on 12-Oct-15.
 */
/*Замерить время добавления, поиска и
удаления объектов из коллекции в LinkedList,
ArrayList, TreeSet, HashSet. Сравнить время и
сделать вывод о том, в каких условиях какая
коллекция работает быстрее.*/

public class CollectionPerformanceExecuter {
    LinkedList<String> a1 = new LinkedList<String>();
    ArrayList<String> a2 = new ArrayList<String>();
    TreeSet<String> a3 = new TreeSet<String>();
    HashSet<String> a4 = new HashSet<String>();

    public CollectionPerformanceExecuter() {
    }

    public String getResult(){
        String result = "";

        long startTime1 = System.currentTimeMillis();
        for(int i = 0; i < 100; i++){
            String uuid = UUID.randomUUID().toString();
            a1.add(uuid);
        }
        long resultAdd1 = System.currentTimeMillis() - startTime1;

        startTime1 = System.currentTimeMillis();
        int removeI = 99;
        while(removeI > 0){
            a1.remove();
            removeI--;
        }
        long resultRemove1 = System.currentTimeMillis() - startTime1;


        long startTime2 = System.currentTimeMillis();
        for(int i = 0; i < 100; i++){
            String uuid = UUID.randomUUID().toString();
            a2.add(uuid);
        }
        long resultAdd2 = System.currentTimeMillis() - startTime2;

        startTime2 = System.currentTimeMillis();
        removeI = 99;
        while(removeI > 0){
            a2.remove(removeI);
            removeI--;
        }
        long resultRemove2 = System.currentTimeMillis() - startTime2;


        long startTime3 = System.currentTimeMillis();
        for(int i = 0; i < 100; i++){
            String uuid = UUID.randomUUID().toString();
            a3.add(uuid);
        }
        long resultAdd3 = System.currentTimeMillis() - startTime3;

        TreeSet<String> temp = new TreeSet<String>(a3);
        startTime3 = System.currentTimeMillis();
        temp.forEach(a3::remove);

        long resultRemove3 = System.currentTimeMillis() - startTime3;


        long startTime4 = System.currentTimeMillis();
        for(int i = 0; i < 100; i++){
            String uuid = UUID.randomUUID().toString();
            a4.add(uuid);
        }
        long resultAdd4 = System.currentTimeMillis() - startTime4;

        startTime4 = System.currentTimeMillis();
        removeI = 99;
        while(removeI > 0){
            a4.remove(removeI);
            removeI--;
        }
        long resultRemove4 = System.currentTimeMillis() - startTime4;

        result += "LinkedList adding: " + resultAdd1 + " and removing:" + resultRemove1 + "\n";
        result += "ArrayList adding: " + resultAdd2 + " and removing:" + resultRemove2 + "\n";
        result += "TreeSet adding: " + resultAdd3 + " and removing:" + resultRemove3 + "\n";
        result += "HashSet adding: " + resultAdd4 + " and removing:" + resultRemove4 + "\n";
        return result;
    }
}
