package sourcecode_2023.July;

/*
[146. LRU Cache]
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.



Example 1:

Input
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4


Constraints:

1 <= capacity <= 3000
0 <= key <= 104
0 <= value <= 105
At most 2 * 105 calls will be made to get and put.
 */


import java.util.HashMap;

public class LeetCode146_LRUCache {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.July
     * @CreateTime: 2023/7/10
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class LRUCache {


        public Node head;
        public Node end;
        public int capacity;
        public HashMap<Integer, Node> hashMap;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            hashMap = new HashMap<Integer, Node>();
        }

        public int get(int key) {
            Node node = hashMap.get(key);
            if (node == null){
                return -1;
            }
            refreshNode(node);
            return node.value;
        }

        public void put(int key, int value) {
            Node node = hashMap.get(key);
            if (node == null) {

                if (hashMap.size() >= capacity) {
                    int oldKey = removeNode(head);
                    hashMap.remove(oldKey);
                }
                node = new Node(key, value);
                addNode(node);
                hashMap.put(key, node);
            } else {

                node.value = value;
                refreshNode(node);
            }
        }

        public void remove(String key) {
            Node node = hashMap.get(key);
            removeNode(node);
            hashMap.remove(key);
        }

        private void refreshNode(Node node) {

            if (node == end) {
                return;
            }

            removeNode(node);

            addNode(node);
        }


        private int removeNode(Node node) {
            if(node == head && node == end){

                head = null;
                end = null;
            }else if(node == end){

                end = end.pre;
                end.next = null;
            } else if (node == head){

                head = head.next;
                head.pre = null;
            } else {

                node.pre.next = node.next;
                node.next.pre = node.pre;
            }
            return node.key;
        }


        private void addNode(Node node) {
            if(end != null) {
                end.next = node;
                node.pre = end;
                node.next = null;
            }
            end = node;
            if(head == null){
                head = node;
            }
        }
    }

    class Node {
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
        public Node pre;
        public Node next;
        public int key;
        public int value;
    }


}
