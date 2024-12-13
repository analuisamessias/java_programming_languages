package java_programming_languages.aula03_java;

public interface MyCollection{
  void add(String item);
      // Adiciona uma String a lista
  boolean isEmpty();
      //Testa se a lista está vazia.
      //Return true se a lista estiver vazia, 
      // false caso contrário.
  String remove();
      //Remove um elemento da lista, retornando-o
      // como resultado da chamada.
      //Return item que foi removido da lista.
}