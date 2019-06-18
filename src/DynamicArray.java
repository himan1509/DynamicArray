import java.util.Arrays;

public class DynamicArray<T> {
    Object[] data;
    int size;

    public DynamicArray() {
        size = 0;                       //Initial Size.
        data = new Object[1];           //Initializing an Array.
    }

    public int getSize() {
        return data.length;
    }   //Used to get size of the Array.

    public T get(int index) {
        return (T) data[index];                     //Used to get the element at the given position.
    }

    public void put(T element) {
        ensureCapacity(size + 1);
        data[size++] = element;                     //Used to put element into array.
    }

    public void ensureCapacity(int minCapacity) {       //Comparison of size of array as well as increment
        int oldCapacity = getSize();                    // in size if needed.
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data, newCapacity);        //Copying the previous data into new array with increased size
        }
    }

}
