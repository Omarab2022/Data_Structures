import java.util.ArrayList;
import java.util.List;

public class Heap {


   private List<Integer> Heap ;

    public Heap(){
        this.Heap  = new ArrayList<Integer>() ;
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(Heap);
    }

    private int LeftChild(int index){
        return index*2+1;
    }


    private int RightChild(int index){
        return index*2+2;
    }

    private int Parent(int index){
        return (index-1)/2;
    }

    private void swap(int index1 , int index2){
        int temp = Heap.get(index1);
        Heap.set(index1 , Heap.get(index2));
        Heap.set(index2,temp);
    }

    public void insert(int value){

        Heap.add(value);
        int current  = Heap.size()-1;

        while( current > 0 && Heap.get(current) > Heap.get(Parent(current))){
            swap(current , Parent(current));
            current=Parent(current);
        }
    }

    public Integer Remove(){
        if (Heap.size() == 0 ){
            return null;
        }

        if (Heap.size()==1){
           return Heap.remove(0);
        }

        int MaxValue = Heap.get(0);

        Heap.set(0, Heap.remove(Heap.size()-1));
        SinkDown(0);

        return MaxValue;
    }

    private void SinkDown(int index) {

        int maxIndex  = index;

        while (true){
            int leftindex = LeftChild(index);
            int rightindex = RightChild(index);

            if (leftindex < Heap.size()-1 && Heap.get(leftindex) > Heap.get(maxIndex)) {
                maxIndex = leftindex;
            }

            if (rightindex < Heap.size()-1 && Heap.get(rightindex) > Heap.get(maxIndex)) {
                maxIndex = rightindex;
            }

            if (index != maxIndex){
                swap(index,maxIndex);
                index= maxIndex;
            }else {
                return;
            }
        }
    }

    public void PrintHeap(){
        for (int i = 0; i < Heap.size(); i++) {
            System.out.print(Heap.get(i) + " ");
        }
    }

}
