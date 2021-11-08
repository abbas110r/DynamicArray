public class DynamicArrayUse {
    public static void main(String args[]){
        DynamicArray arr = new DynamicArray();

//        System.out.println(arr.size());
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.print();
        System.out.println();
        arr.addAtIndex(1,7);
//        arr.size();
        arr.print();

//        System.out.println(arr.size());
//        arr.add(5);
//        arr.add(6);
//        arr.add(8);
//        arr.add(7);
//        arr.add(9);
//        arr.add(5);
//        arr.add(6);
//        arr.add(8);
//        arr.add(7);
//        arr.add(9);
//        arr.remove();
//        arr.add(9);
//        arr.remove();
//        arr.add(9);
//        arr.add(10);
//        arr.add(9);
//        arr.add(10);
//        arr.add(9);
//        arr.add(10);
        arr.print();
        System.out.println();
//        arr.get(1);
//        arr.print();
//        System.out.println();
//        System.out.println(arr.size());
//        arr.remove();
//        arr.remove();
//        System.out.println(arr.size());
//        arr.print();
        System.out.println(arr.isEmpty());
    }
}
