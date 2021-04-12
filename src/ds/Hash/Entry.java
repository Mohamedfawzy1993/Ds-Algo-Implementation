package ds.Hash;

/**
 * The Class Entry
 *
 * @author mohamed.fawzy
 */
public class Entry {
    Integer key;
    String value;

    public Entry(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Entry() {
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}

    
