package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;

    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {
        private int id = 0;

        public boolean hasNext() {
            return next() != null;
        }

        public Integer next() {
            int value;
            if (backed != null) {
                if (id / 2 < backed.length) {
                    value = backed[id / 2];
                    id++;
                    return value;
                }

            }
            return null;
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
