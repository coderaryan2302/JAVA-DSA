package hashMaps;

import java.util.LinkedList;

public class implementation {

    static class MyHashMap<K, V> {

        private static final int DEFAULT_CAPACITY = 4;
        private static final float LOAD_FACTOR = 0.75f;

        // Node
        private class Node {

            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size;
        private LinkedList<Node>[] buckets;

        MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        // Create Buckets
        private void initBuckets(int n) {

            buckets = new LinkedList[n];

            for (int i = 0; i < n; i++)
                buckets[i] = new LinkedList<>();
        }

        // Hash Function
        private int hashFunction(K key) {
            return Math.abs(key.hashCode()) % buckets.length;
        }

        // Search Key in Bucket
        private int searchInBucket(LinkedList<Node> bucket, K key) {

            for (int i = 0; i < bucket.size(); i++) {

                if (bucket.get(i).key.equals(key))
                    return i;
            }

            return -1;
        }

        // Rehash
        private void rehash() {

            LinkedList<Node>[] oldBuckets = buckets;

            initBuckets(oldBuckets.length * 2);

            size = 0;

            for (LinkedList<Node> bucket : oldBuckets)
                for (Node node : bucket)
                    put(node.key, node.value);
        }

        // Insert / Update
        public void put(K key, V value) {

            int bucketIndex = hashFunction(key);

            LinkedList<Node> bucket = buckets[bucketIndex];

            int index = searchInBucket(bucket, key);

            if (index == -1) {

                bucket.add(new Node(key, value));
                size++;

            } else {

                bucket.get(index).value = value;
            }

            if ((float) size / buckets.length > LOAD_FACTOR)
                rehash();
        }

        // Get Value
        public V get(K key) {

            int bucketIndex = hashFunction(key);

            LinkedList<Node> bucket = buckets[bucketIndex];

            int index = searchInBucket(bucket, key);

            return index == -1 ? null : bucket.get(index).value;
        }

        // Remove Key
        public V remove(K key) {

            int bucketIndex = hashFunction(key);

            LinkedList<Node> bucket = buckets[bucketIndex];

            int index = searchInBucket(bucket, key);

            if (index == -1)
                return null;

            size--;

            return bucket.remove(index).value;
        }

        public boolean containsKey(K key) {
            return get(key) != null;
        }

        public int size() {
            return size;
        }

        public int capacity() {
            return buckets.length;
        }

        public float loadFactor() {
            return (float) size / buckets.length;
        }
    }

    public static void main(String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);

        System.out.println("A : " + map.get("A"));
        System.out.println("B : " + map.get("B"));

        map.put("A", 100);

        System.out.println("Updated A : " + map.get("A"));

        System.out.println("Remove C : " + map.remove("C"));

        System.out.println("Contains D : " + map.containsKey("D"));

        System.out.println("Size : " + map.size());

        System.out.println("Capacity : " + map.capacity());

        System.out.println("Load Factor : " + map.loadFactor());
    }
}

/*

HashMap Implementation

Definition

• HashMap Array + LinkedList (Separate Chaining) se implement hota hai.
• Har Array Index ko Bucket kehte hain.
• Har Bucket me Key-Value Nodes store hote hain.

Components

Node

• Key
• Value

Buckets

• LinkedList ka Array

Hash Function

• Key ko Bucket Index me convert karta hai.

Formula

index = abs(hashCode) % bucket.length

Working

put(key, value)

1. Bucket Index find karo.
2. Bucket me Key search karo.
3. Key mil jaye to Value update karo.
4. Nahi mile to naya Node add karo.
5. Load Factor check karo.
6. Zarurat ho to Rehash karo.

get(key)

1. Bucket find karo.
2. Key search karo.
3. Value return karo.

remove(key)

1. Bucket find karo.
2. Key search karo.
3. Node delete karke Value return karo.

containsKey(key)

• Key exist karti hai ya nahi check karta hai.

Collision

• Jab do Keys same Bucket me aa jati hain.

Solution

• Separate Chaining (LinkedList)

Rehashing

• Load Factor limit cross hone par Bucket size double hoti hai.
• Sare Elements dobara insert kiye jate hain.

Load Factor

Formula

size / capacity

Default

0.75

Time Complexity

Average

• put() → O(1)
• get() → O(1)
• remove() → O(1)
• containsKey() → O(1)

Worst Case

• put() → O(n)
• get() → O(n)
• remove() → O(n)
• containsKey() → O(n)

Rehash

• O(n)

Space Complexity

• O(n)

Advantages

• Fast Searching
• Fast Insertion
• Fast Deletion
• Dynamic Resizing
• Collision Handling

Disadvantages

• Extra Memory use hoti hai.
• Worst Case O(n)
• Rehashing expensive ho sakti hai.

Applications

• Dictionary
• Phone Book
• Student Records
• Banking
• Cache
• Frequency Counting
• Database Indexing

*/