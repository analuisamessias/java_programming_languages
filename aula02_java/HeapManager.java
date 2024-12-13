package java_programming_languages.aula02_java;
public class HeapManager {
    private static final int NULL = -1;
    private int[] memory;
    private int freeStart;

    public HeapManager(int[] initialMemory){
        this.memory = initialMemory;
        this.memory[0] = memory.length;
        this.memory[1] = NULL;
        freeStart = 0;
    }

    public int allocate(int n){
        int size = n + 1;
        int p = this.freeStart;
        int previousP = NULL;
        while(p != NULL && this.memory[p] < size){
          previousP = p;
          p = this.memory[p+1];
        }
        
        if(p == NULL)
            throw new OutOfMemoryError();
        
        int nextFree = this.memory[p+1];
        int remaining = this.memory[p] - size;
        if(remaining > 1){
            this.memory[p] = size;
            nextFree = p+ size;
            this.memory[nextFree] = remaining;
            this.memory[nextFree+1] = this.memory[p+1];
        }

        if(previousP == NULL)
            this.freeStart = nextFree;
        else 
            this.memory[previousP + 1] = nextFree;

        return p+1;
    }


    public void deallocate(int contentAddress){
        int blockAddress = contentAddress - 1;
        this.memory[contentAddress] = freeStart;
        this.freeStart = blockAddress;
    }

    public void deallocateV2(int contentAddress){
        int blockAddress = contentAddress - 1;
        int p = this.freeStart;
        int previousP = NULL;
        while(p != NULL && p < blockAddress){
            previousP = p;
            p = this.memory[p+1];
        }

        if(blockAddress + this.memory[blockAddress] == p){
            this.memory[blockAddress] += this.memory[p];
            p = this.memory[p+1];
        }

        if(previousP == NULL){
              this.freeStart = blockAddress;
              this.memory[blockAddress+1] = p;
        } else if(previousP + this.memory[previousP] == blockAddress){
            this.memory[previousP] += memory[blockAddress];
        } else{
            this.memory[previousP+1] = blockAddress;
            this.memory[blockAddress+1] = p;
        }
    }

    public static void main(String[] args){
        int[] arr = new int[10];
        HeapManager m = new HeapManager(arr);

        int p1 = m.allocate(4);
        System.out.println("pi= " + p1);

        int p2 = m.allocate(2);
        System.out.println("p2= " + p2);

        m.deallocate(p1);
        
        int p3 = m.allocate(1);
        System.out.println("p3= " + p3);
    }
}
