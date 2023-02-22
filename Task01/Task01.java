import java.util.LinkedList;
import java.util.Random;

/*
 Пусть дан LinkedList с несколькими элементами.
 Реализуйте метод, который вернет “перевернутый” список.
 Постараться не обращаться к листу по индексам.
 */
public class Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        linkedListRndFill(myLinkedList, 10);
        System.out.printf("Исходный LinkedList: %s%n", myLinkedList.toString());
        // System.out.println(myLinkedList.pollLast());
        myLinkedList = linkedListReverse(myLinkedList);
        System.out.printf("Перевёрнутый LinkedList: %s%n", myLinkedList.toString());
    }

    public static void linkedListRndFill(LinkedList<Integer> myLkdList, int size) {
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            myLkdList.add(rnd.nextInt(100));
        }
    }

    public static LinkedList<Integer> linkedListReverse(LinkedList<Integer> myLkdList) {
        LinkedList<Integer> targetLinkedList = new LinkedList<>();
        while (!myLkdList.isEmpty()) {
            targetLinkedList.add(myLkdList.pollLast());
        }
        return targetLinkedList;
    }
}