package practise;

import HeapPQ.MinHeap;

import java.util.ArrayList;
import java.util.Iterator;

public class minHeap<T extends Comparable<T>> {

    private ArrayList<T> list;

    public minHeap(){
        list=new ArrayList<>();
    }

    public int parent(int index){
        return (index-1)/2;
    }

    public int left(int index){
        return (index*2)+1;
    }

    public int right(int index){
        return (index*2)+2;
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);   // basically we insert the newly added element at last in its correct place
    }

    public void upheap(int index){
        int parent=parent(index);
        if(index>0 && list.get(index).compareTo(list.get(parent))<0){
            swap(index,parent);
            upheap(parent);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty list");
        }

        swap(0,list.size()-1);
        T root=list.remove(list.size()-1);
        downheap(0);
        return root;
    }

    public void swap(int first,int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    public void downheap(int index){
        int smallest=index;
        int left=left(index);
        int right=right(index);

        if(left<list.size() && list.get(smallest).compareTo(list.get(left))>0){
             smallest=left;
        }

        if(right<list.size() && list.get(smallest).compareTo(list.get(right))>0){
            smallest=right;
        }

        if(smallest!=index){
            swap(index,smallest);
            downheap(index);
        }


    }




    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data=new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }

    public void print(){
        Iterator<T> iterator=list.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }


    public static void main(String[] args) throws Exception{
        minHeap<Integer> heap=new minHeap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

        heap.print(); // original heap
        System.out.println();
        System.out.println(heap.remove());
        ArrayList list1=heap.heapSort();
        System.out.println(list1);  // sorted heap

    }



}
