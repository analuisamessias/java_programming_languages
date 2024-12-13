package java_programming_languages.aula04_java;

public class Main {
    public static void add(Stack s, String value){
        Node novo = new Node();
        novo.value = value;
        novo.next = s.top;
        s.top = novo;
    }

    public static boolean isEmpty(Stack s){
        return s.top == null;
    }

    public static String remove(Stack s){
        String res = s.top.value;
        s.top = s.top.next;
        return res;
    }
    public static void main(String[] args){
        Stack s = new Stack();
        add(s, "o rato");
        add(s, "roeu");
        add(s, "a roupa");
        add(s, "do rei");
        add(s, "de Roma");

        while(!isEmpty(s)){
            System.out.println(remove(s));
        }
    }
}
