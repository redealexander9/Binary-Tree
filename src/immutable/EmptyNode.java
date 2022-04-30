package immutable;

import java.util.List;

class EmptyNode extends Map {
public static final EmptyNode instance = new EmptyNode();
private EmptyNode(){

}

 public static Map instance() {
 return Map.create();
 }

 public int size(){
 return 0;
}
public int depth(){
 return 0;
}
public boolean empty(){
 return true;
}
public Integer getValue(String key){
 return null;
}
public Map setValue(String key, Integer value){
 Node n = new Node(key, value, null, null);
 return n;
}
protected void addEntries(List<Map.Entry> list){}


}
