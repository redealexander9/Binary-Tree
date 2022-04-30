package immutable;

import java.util.List;


class EmptyNode extends Map {

 public static Map instance = new EmptyNode();

 private EmptyNode() {


}
 public int size () {
  return 0;

 }
 public int depth () {
  return 0;
 }
 public boolean empty () {
  return true;
 }
 public Integer getValue (String key){
  return null;
 }
 public Map setValue (String key, Integer value){
  EmptyNode emp = new EmptyNode();
  return new Node(key, value, emp, emp);
 }
 protected void addEntries (List < Map.Entry > list) {
 }


}
