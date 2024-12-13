package java_programming_languages.aula02_java;
import java.lang.StackOverflowError;

//Implementação do tipo PILHA
public class MemoryManager {
    private int[] memory;
    private int top;

    public MemoryManager(int[] initialMemory){
        this.memory = initialMemory;
    this.top = this.memory.length;
    }

    public int push(int memorySize){
        int size = memorySize + 1;
        int newTop = top;

        newTop -= size;
        if(newTop < 0)
            throw new StackOverflowError();
        
        memory[newTop] = this.top;
        this.top = newTop;

        return this.top + 1;
    }

    public void pop(){
        this.top = memory[this.top];
    }

    public static void main(String[] args){
        int[] arr = new int[8];
        MemoryManager m = new MemoryManager(arr);

        System.out.println(m.push(3));
        System.out.println(m.push(2));
        m.pop();
    }
}
