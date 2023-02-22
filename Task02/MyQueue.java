/*
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
package Task02;

import java.util.LinkedList;

public class MyQueue {
    LinkedList <Integer> myLinkedList;

    // int length;

    MyQueue() {
        myLinkedList = new LinkedList<>();
        // length = myLinkedList.size();
    }

    void enqueue(Integer elem) {
        myLinkedList.add(elem);
    }
    Integer dequeue(){
        if (myLinkedList.size()!=0) {
            return myLinkedList.pop();
        }
        return null;
    }
    Integer first() {
        if(myLinkedList.size()!=0){
        return myLinkedList.getFirst();
        }
        return null;
    }
    
}
