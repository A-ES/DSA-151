package LinkedList.day22;

import java.util.HashMap;
import java.util.Map;

public class lru {

class LRUCache {
    public class Node{
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value){
            this.key=key;
            this.value=value;
        }
    }
    int capacity;
    Map<Integer, Node> map;
    Node head;
    Node tail;


    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map = new HashMap<>();
        this.head = new Node(-1,-1);
        this.tail = new Node(-1,-1);
        head.next= tail;
        tail.prev=head;
        }
        public void addNode(Node node){
            node.next = head.next;
            head.next.prev = node;
            node.prev = head;
            head.next = node;
        }
        public void removeNode(Node node){

            Node prev = node.prev;
            Node next = node.next;
            prev.next = next;
            next.prev = prev;
             node.prev = null;
    node.next = null;
            
        }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        else{
            Node node = map.get(key);
            removeNode(node);
            addNode(node);
            return node.value;
        }
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            addNode(node);
        }
        else{
            if(map.size()==capacity){
                Node lru = tail.prev;
                removeNode(lru);
                map.remove(lru.key);

            }
            Node newNode = new Node(key,value);
            addNode(newNode);
            map.put(key,newNode);
        }
        
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
    
}
