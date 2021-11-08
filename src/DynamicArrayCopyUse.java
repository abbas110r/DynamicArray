public class DynamicArrayCopyUse {
    public static void main(String args[]){
        DynamicArrayCopy arr = new DynamicArrayCopy();
        arr.add(1);
        arr.add(2);
        arr.addAtIndex(0,-2);
        arr.addAtIndex(0,-1);
        arr.addAtIndex(1,0);

//        arr.search(1);


        System.out.println(arr.search(2));
        System.out.println();
        arr.print();
//        arr.size();
        System.out.println();
//        arr.delete(1);
//        arr.print();
    }
}
