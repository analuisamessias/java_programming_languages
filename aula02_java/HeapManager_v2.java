package java_programming_languages.aula02_java;

public class HeapManager_v2 {
  private static final int NULL = -1;
  private int[] memory;
  private int freeStart;

  public HeapManager_v2(int[] initialMemory){
      this.memory = initialMemory;
      this.memory[0] = memory.length;
      this.memory[1] = NULL;
      freeStart = 0;
  }

  public int allocate(int n){
      int size = n + 1;
      int p = this.freeStart;
      int previousP = NULL;

      int bestFit = NULL;
      int previousFit = NULL;
      int small = Integer.MAX_VALUE;

      while(p != NULL){
        int blocksize = memory[p];
        if(blocksize >= size){
            int prev = blocksize - size;;
            if(prev < small){
                small = prev;
                bestFit = p;
                previousFit = previousP;
            }

            if(prev == 0){
                break;
            }
          }

          previousP = p;
          p = memory[p+1];
        }

        if(bestFit == NULL){
          throw new OutOfMemoryError();
        }

        int nextFree = memory[bestFit+1];
        int remaining = memory[bestFit] - size;
        if(remaining > 1){
          memory[bestFit] = size;
          nextFree = bestFit + size;
          memory[nextFree] = remaining;
          memory[nextFree+1] = memory[bestFit+1];
        }

        if(previousFit == NULL){
          this.freeStart = nextFree;
        }else{
          memory[previousFit+1] = nextFree;
        }
        return bestFit+1;
      }


    public void deallocate(int contentAddress){
      int blockAddress = contentAddress - 1;
      this.memory[contentAddress] = freeStart;
      this.freeStart = blockAddress;
    }

    public static void main(String[] args){
      HeapManager_v2 mm = new HeapManager_v2(new int[17]);

      int a = mm.allocate(2);
      int b = mm.allocate(1);
      int c = mm.allocate(1);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      mm.deallocate(a);
      mm.deallocate(c);

      int d = mm.allocate(1); 
      int e = mm.allocate(2);
      System.out.println("Endereços alocados:");
        System.out.println("b: " + b); 
        System.out.println("d: " + d); 
        System.out.println("e: " + e);
  }

}
