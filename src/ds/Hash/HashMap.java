package ds.Hash;


import java.util.Arrays;
import java.util.LinkedList;

/**
 * The Class HashMap
 *
 * @author mohamed.fawzy
 */
public class HashMap {

    LinkedList<Entry>[] linkedLists = new LinkedList[10];

    public void put(Integer key, String value){
        Integer hash = hash(key);
        if(linkedLists[hash] != null){
            LinkedList<Entry> entries = linkedLists[hash];
            if(entries.size() == 1 && entries.get(0).key.equals(key)){
                entries.get(0).value = value;
            } else {
                boolean newEntry = true;
                for(Entry entry : entries){
                    if(entry.key.equals(key)){
                        entry.value = value;
                        newEntry = false;
                        break;
                    }
                }
                if(newEntry){
                    entries.addLast(new Entry(key, value));
                }
            }
        } else {
            linkedLists[hash] = new LinkedList<>();
            linkedLists[hash].add(new Entry(key, value));
        }
    }

    public String get(Integer index){
        LinkedList<Entry> linkedList =  linkedLists[hash(index)];
        if(linkedList != null)
            for(Entry entry : linkedList){
                if(entry.key.equals(index))
                    return entry.value;
            }
        return null;
    }

    public void remove(int index){
        LinkedList<Entry> linkedList =  linkedLists[hash(index)];
        if(linkedList != null)
            for(Entry entry : linkedList){
                linkedList.remove(entry);
                return;
            }
    }

    private Integer hash(Integer key) {
        return key % linkedLists.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(linkedLists);
    }


}

    
