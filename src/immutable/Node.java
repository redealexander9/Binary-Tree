package immutable;

import java.util.List;

class Node extends Map {
final String key;
final Integer value;
final Map left;
final Map right;
public Node(String key, Integer value, Map left, Map right){
    this.key = key;
    this.value = value;
    this.left = left;
    this.right = right;
}

public Map setValue(String key, Integer value){
    Node n;
    if(this.key.equals(key)){
        n = new Node(this.key, value, left, right);
        return n;
    }
    else if(this.key.compareTo(key) > 0){
        n = new Node(this.key, this.value, left.setValue(key, value), right);
        return n;
    }
    else{
        n = new Node(this.key, this.value, left, right.setValue(key, value));
        return n;
    }

}

public int size(){
    return 1 + left.size() + right.size();
}

public int depth(){
    return 1 + left.depth() + right.depth();
}

public boolean empty(){
    return false;
}

public Integer getValue(String key){
    if(this.key.equals(key)){
        return this.value;
    }
    else if(this.key.compareTo(key) > 0){
        return left.getValue(key);
    }
    else{
        return right.getValue(key);
    }

}


protected void addEntries(List<Entry> list){
    left.addEntries(list);
    List.add(key);
    right.addEntries(list);
}

}
