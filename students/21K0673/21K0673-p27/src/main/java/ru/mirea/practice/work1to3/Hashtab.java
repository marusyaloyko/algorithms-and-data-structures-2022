package ru.mirea.practice.work1to3;

public class Hashtab<K, V> {
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final int DEFAULT_LENGTH = 16;
    private final int arrayLength;
    private int size;
    private Node<K, V>[] tables;

    public Hashtab() {
        this(DEFAULT_LENGTH, DEFAULT_LOAD_FACTOR);
    }

    public Hashtab(int length) {
        this(length, DEFAULT_LOAD_FACTOR);
    }

    public Hashtab(int length, float loadFactor) {
        if (length <= 0) {
            throw new IllegalArgumentException("Длина инициализации должна быть больше 0");
        }
        if (loadFactor <= 0) {
            throw new IllegalArgumentException("Коэффициент нагрузки должен быть больше 0");
        }
        this.arrayLength = length;
        tables = new Node[length];
    }

    public void hashtabAdd(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        int possiblePosition = hashtabHash(key);
        if (tables[possiblePosition] == null) {
            tables[possiblePosition] = newNode;
        } else {
            Node<K, V> retrievedNode = tables[possiblePosition];
            while (retrievedNode != null) {
                if (retrievedNode.getKey().equals(key)) {
                    retrievedNode.setValue(value);
                    return;
                }
                retrievedNode = retrievedNode.getNext();
            }
        }
    }

    public Node hashtabDelete(K key) {
        Node<K, V> removeNode = hashtabLookup(key);
        Node<K, V> prevNode = removeNode.getPrev();
        Node<K, V> nextNode = removeNode.getNext();
        if (nextNode != null) {
            nextNode.setPrev(prevNode);
        }
        if (prevNode != null) {
            prevNode.setNext(nextNode);
        } else {
            int lookupPosition = hashtabHash(key);
            tables[lookupPosition] = nextNode;
        }
        return removeNode;
    }

    public Node hashtabLookup(K key) {
        int lookupPosition = hashtabHash(key);
        Node<K, V> retrievedNode = tables[lookupPosition];
        while (retrievedNode != null) {
            if (retrievedNode.getKey().equals(key)) {
                return retrievedNode;
            } else {
                retrievedNode = retrievedNode.getNext();
            }
        }
        return null;
    }

    private int hashtabHash(K key) {
        if (key instanceof String) {
            int h = 0;
            for (int i = 0; i < ((String) key).length(); i++) {
                h += ((String) key).charAt(0);
                h += h << 10;
                h ^= h << 6;
            }
            h += h << 3;
            h ^= h >> 11;
            h += h << 15;
            return (h & 0xff) % (tables.length - 1);
        } else {
            return (key.hashCode() & 0xff) % (tables.length - 1);
        }
    }

    public void print() {
        for (int i = 0; i < tables.length; i++) {
            if (tables[i] != null) {
                System.out.println(i + "\t " + tables[i]);
            }
        }
        System.out.println("\n");
    }

    public void clear() {
        tables = new Node[arrayLength];
        size = 0;
    }

    public int size() {
        return size;
    }
}
