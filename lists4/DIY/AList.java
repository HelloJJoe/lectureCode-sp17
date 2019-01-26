/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */

    private int[] item;
    private int size;

    public AList() {
        this.item = new int[100];
        this.size = 0;

    }
    private void resize(int capacity){
        int[] newArray = new int[capacity];
        System.arraycopy(item, 0, newArray, 0, size);
        item = newArray;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if(size == item.length){
            resize(size + 1);
        }
        item[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return item[size];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return item[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int last = item[size -1];
        size--;
        return last;
    }
} 