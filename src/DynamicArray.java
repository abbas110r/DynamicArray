public class DynamicArray {
    private int[] data;
    int nextElement;
    DynamicArray(){
       this.data = new int[5];
       nextElement=0;
    }
    public void add(int e){

        if(nextElement== data.length){
            int[]newData = new int[2* data.length];
            for (int i=0;i< data.length;i++){
                newData[i] = data[i];
            }
            data=newData;
            data[nextElement]=e;
            nextElement++;

        }
        else{
            data[nextElement]=e;
            nextElement++;
        }
    }
    public void addAtIndex(int i,int ele){
        int[]temp = new int[nextElement+1];
        if(i==0){

            int k =1;
            for (int j=0;j<nextElement;j++){
                temp[k] = data[j];
                k++;
            }
            temp[0] = ele;
            data = temp;
        }
        else{
            for(int j=0;j<i;j++){
                temp[j]=data[j];
            }
            for(int j=i;j<nextElement;j++){
                temp[j] = data[j];
            }
            temp[i] = ele;
            data = temp;
        }

    }
    public void set(int i,int elem){
        data[i]=elem;
    }
    public void remove(){
        int data1[]=new int[nextElement-1];
        for (int i=0;i<data1.length;i++){
            data1[i] = data[i];
        }
        data=data1;
        nextElement--;
    }
    public int size(){
        return nextElement;
    }
    public boolean isEmpty(){
        if (nextElement==0){
            return true;
        }
        return false;
    }

    public void get(int i){
        if (i>=nextElement || i<=0){
            return;
        }
        System.out.println( data[i]);
    }
    public void print(){
        for (int i=0;i< nextElement;i++){
            System.out.print(data[i]+" ");
        }

    }

}
