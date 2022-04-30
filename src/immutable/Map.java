package immutable;
import java.util.ArrayList;
import java.util.List;

public abstract class Map  {

    ArrayList<String> List = new ArrayList<String>();
    public interface Entry{
        String getKey();
        Integer getValue();
    }
    public static Map create(){
        return EmptyNode.instance;
    }

    public abstract int depth();

    public abstract int size();

    public abstract Map setValue(String key, Integer value);

    public abstract Integer getValue(String key);

    public abstract boolean empty();
    public List<Entry> entries(){

        ArrayList<Entry> allEntries = new ArrayList<Entry>();
        addEntries(allEntries);
        return allEntries;
    }

    protected abstract void addEntries(List<Entry> list);

}

