package HeapPQ;

import java.util.ArrayList;

public class MinHeap<T extends Comparable<T>> {

    private ArrayList<T> list;

    public MinHeap(){
        list=new ArrayList<>();
    }

    // calculation for parent

    public int parent(int index){
        return (index-1)/2;
    }

    // calculation for left

    public int left(int index){
        return 2*index+1;
    }

    // calculation of right

    public int right(int index){
        return 2*index+2;
    }

    // inserting an element

    public void insert(T value){
        list.add(value); // adding the value at end of the list
        upheap(list.size()-1);
    }

    // upheaping processs

    public void upheap(int value){
        int p=parent(value);
        if(list.get(value).compareTo(list.get(p))<0){
            swap(value,p);
            upheap(p);
        }
    }

    // swaping of elements

    public void swap(int first, int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    // removing an element

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty list");
        }

        T root=list.get(0);
        swap(0,list.size()-1);  // swap the first and last element
        list.remove(list.size()-1);
        return root;
    }

    // heapify down

    private void heapifyDown(int index){
        int smallest=index;
        int left=left(index);
        int right=right(index);

        // finding the smallest among root, left child and right child

        if(left<list.size() && list.get(index).compareTo(list.get(left))>0){
            smallest=left;
        }

        if(right<list.size() && list.get(index).compareTo(list.get(right))>0){
           smallest=right;
        }

        if(smallest!=index){
            swap(index,smallest);
            heapifyDown(index);
        }

    }

    // Utility method to display the heap
    public void printHeap() {
        System.out.println(list);
    }

    public static void main(String[] args) throws Exception {
         MinHeap<Integer> minHeap=new MinHeap<>();
            minHeap.insert(7);
            minHeap.insert(8);
            minHeap.insert(10);
            minHeap.insert(12);
            minHeap.insert(14);
            minHeap.insert(17);
            minHeap.insert(5);

            System.out.println("Initial Min-Heap:");
            minHeap.printHeap();

        System.out.println("Removed Element: "+minHeap.remove());

        System.out.println("Heap after Removal: ");
        minHeap.printHeap();
    }

}