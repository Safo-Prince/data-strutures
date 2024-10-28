package HashMaps;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.value = value;
            this.key = key;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {

        var index = hash(key);
        if (entries[index] == null)
            entries[index] = new LinkedList<>();


        var bucket = entries[index];

        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }

        }

        bucket.addLast(new Entry(key, value));

    }


    public int hash(int key) {
        return key % entries.length;

    }

    public String get(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket != null) {
            for (var entry : bucket)
                if (entry.key == key)
                    return entry.value;
        }

        return null;
    }

    public void remove(int key) {
        var index = hash(key);
        if (entries[index] == null)
            throw new IllegalStateException();
        for (var entry : entries[index]) {
            if (entry.key == key) {
                entries[index].remove(entry);
                return;
            }
        }
        throw new IllegalStateException();

    }

    private LinkedList<Entry> getBucket(int key){
        return entries[hash(key)];
    }
    private LinkedList<Entry> getOrCreateBucket(int key){
        var index = hash(key);
        var bucket = entries[index];
        if(bucket == null)
            entries[index] = new LinkedList<>();
        return bucket;
    }

    private Entry getEntry(int key) {
        var index = hash(key);
        var bucket = entries[index];

        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key) {
                    return entry;
                }

            }
        }
            return null;

    }
}
