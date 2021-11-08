import java.util.Arrays;

public class DynamicArrayCopy {
    int arr[];
    int nextElement;
    DynamicArrayCopy(){
        arr = new int[5];
        nextElement=0;
    }
    public void add(int ele){
        if(nextElement== arr.length){
            int[]temp = new int[2*nextElement];
            for (int i=0;i<nextElement;i++){
                temp[i]=arr[i];
            }
            arr=temp;
        }
            arr[nextElement]=ele;
            nextElement++;

    }
    public void delete(int i){
        int temp[] = new int[nextElement-1];
        for (int j=0;j<i;j++){
            temp[j] = arr[j];
        }
        for (int j=i+1;j<nextElement;j++){
            temp[j]=arr[j];
        }
        arr = temp;
        nextElement--;
    }
    public void addAtIndex(int i,int ele){
        int[] temp= new int[nextElement+1];
        for (int j=0;j<i;j++){
            temp[j] = arr[j];
        }
        int temp1 = arr[i];
        temp[i+1] = temp1;
        temp[i] = ele;
        for (int j=i+1;j<nextElement;j++){
            temp[j+1] = arr[j];
        }
        arr =temp;
        nextElement++;
    }
    public void print(){
        for (int i=0;i<nextElement;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public int search(int ele){
        Arrays.sort(arr);
        int low=0,high=nextElement-1;
        int mid= low+high/2;
        while(low<=high){
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]<ele){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            mid= (low+high)/2;
        }

        return -1;
    }
    public void size(){
        System.out.println(nextElement);
    }
}
