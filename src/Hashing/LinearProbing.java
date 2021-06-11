package Hashing;

public class LinearProbing {
    private int hashTableSize;
    private int[] hashTable;
    public LinearProbing(){
        hashTableSize=10;
        hashTable=new int[hashTableSize];
    }
    public int hashCode(int key){
        return key%hashTableSize;
    }
    public int lprobe(int element){
        int i=hashCode(element);
        int j=0;
        while(hashTable[(i+j)%hashTableSize]!=0)
            j++;
        return (i+j)%hashTableSize;
    }
    public void insert(int element){
        int i=hashCode(element);
        if(hashTable[i]==0)
            hashTable[i]=element;
        else
            i=lprobe(element);
        hashTable[i]=element;
    }

    public boolean search(int key){
        int i=hashCode(key);
        int j=0;
        while(hashTable[(i+j)%hashTableSize]!=key){
            if(hashTable[(i+j)%hashTableSize]==0)
                return false;
            j++;
        }
        return true;
    }

    public void display(){
        for(int i=0;i<hashTableSize;i++)
            System.out.print(hashTable[i]+" ");
        System.out.println("");
    }

    public static void main(String[] args) {
        LinearProbing l=new LinearProbing();
        l.insert(54);
        l.insert(78);
        l.insert(64);
        l.insert(92);
        l.insert(34);
        l.insert(86);
        l.insert(28);
        l.display();
        System.out.println(l.search(54));
    }
}
