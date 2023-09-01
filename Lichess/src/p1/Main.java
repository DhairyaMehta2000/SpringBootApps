package p1;
import java.util.HashMap;
import java.util.Map;

class DoublyLinkedListNode<Key> {
    Key key;
    DoublyLinkedListNode<Key> prev;
    DoublyLinkedListNode<Key> next;

    public DoublyLinkedListNode(Key key) {
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList<Key> {
    DoublyLinkedListNode<Key> dummyHead;
    DoublyLinkedListNode<Key> dummyTail;

    public DoublyLinkedList() {
        dummyHead = new DoublyLinkedListNode<>(null);
        dummyTail = new DoublyLinkedListNode<>(null);
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public boolean isEmpty() {
        return dummyHead.next == dummyTail;
    }

    public void insertNodeAtEnd(final DoublyLinkedListNode<Key> node) {
        final DoublyLinkedListNode<Key> tailPrev = dummyTail.prev;
        dummyTail.prev = node;
        node.next = dummyTail;
        tailPrev.next = node;
        node.prev = tailPrev;
    }

    public void detachNode(final DoublyLinkedListNode<Key> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public DoublyLinkedListNode<Key> getFirstNode() {
        if (isEmpty()) {
            return null;
        }
        return dummyHead.next;
    }
}

interface EvictionPolicy<Key> {
    void keyAccessed(Key key);
    Key evict();
}

class LRUEvictionPolicy<Key> implements EvictionPolicy<Key> {
    private final Map<Key, DoublyLinkedListNode<Key>> map;
    private final DoublyLinkedList<Key> dll;

    public LRUEvictionPolicy() {
        map = new HashMap<>();
        dll = new DoublyLinkedList<>();
    }

    @Override
    public void keyAccessed(final Key key) {
        if (map.containsKey(key)) {
            dll.detachNode(map.get(key));
            dll.insertNodeAtEnd(map.get(key));
        } else {
            final DoublyLinkedListNode<Key> node = new DoublyLinkedListNode<>(key);
            dll.insertNodeAtEnd(node);
            map.put(key, node);
        }
    }

    @Override
    public Key evict() {
        final DoublyLinkedListNode<Key> lruNode = dll.getFirstNode();
        if (lruNode == null) {
            return null;
        }
        dll.detachNode(lruNode);
        map.remove(lruNode.key);
        return lruNode.key;
    }
}

class Cache<Key, Value> {
    private final int capacity;
    private final Map<Key, Value> cache;
    private final EvictionPolicy<Key> evictionPolicy;

    public Cache(int capacity, EvictionPolicy<Key> evictionPolicy) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.evictionPolicy = evictionPolicy;
    }

    public Value get(Key key) {
        Value value = cache.get(key);
        if (value != null) {
            evictionPolicy.keyAccessed(key);
        }
        return value;
    }

    public void put(Key key, Value value) {
        if (cache.size() >= capacity) {
            Key evictedKey = evictionPolicy.evict();
            if (evictedKey != null) {
                cache.remove(evictedKey);
            }
        }
        cache.put(key, value);
        evictionPolicy.keyAccessed(key);
    }
}

public class Main {
    public static void main(String[] args) {
        EvictionPolicy<Integer> evictionPolicy = new LRUEvictionPolicy<>();
        Cache<Integer, String> cache = new Cache<>(3, evictionPolicy);

        cache.put(1, "Value 1");
        cache.put(2, "Value 2");
        cache.put(3, "Value 3");

        System.out.println(cache.get(2)); // Output: Value 2
        System.out.println(cache.get(1)); // Output: Value 1

        cache.put(4, "Value 4");

        System.out.println(cache.get(3)); // Output: null

        System.out.println(cache.get(1)); // Output: Value 1
        System.out.println(cache.get(2)); // Output: Value 2
        System.out.println(cache.get(4)); // Output: Value 4
    }
}
