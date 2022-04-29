package Immutable;

class Node {

    final Map left;
    final Map right;
    final Integer value;
    final String key;
    public Node(String key, Integer value, Map right, Map left){
        this.left = left;
        this.right = right;
        this.value = value;
        this.key = key;

    }


}
