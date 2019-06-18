public class DynamicArrayRun {
    public static void main(String[] args) {
        DynamicArray<Integer> da = new DynamicArray<Integer>();     // Making an array of integer type
        da.put(12);                                   //Adding element into array
        System.out.println("Size : " + da.getSize());         // Printing the size of array
        da.put(13);
        System.out.println("Size : " + da.getSize());
        da.put(14);
        System.out.println("Size : " + da.getSize());
        da.put(15);
        System.out.println("Size : " + da.getSize());
        da.put(16);
        System.out.println("Size : " + da.getSize());
        da.put(17);
        System.out.println("Size : " + da.getSize());

        for (int i = 0; i < da.getSize(); i++) {
            System.out.println(da.get(i));                      // Printing the Array
        }
    }
}
