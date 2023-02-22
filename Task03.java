import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
Используйте итератор
*/
public class Task03 {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        linkedListRndFill(myLinkedList, 10);
        System.out.println(myLinkedList);
        System.out.printf("Сумма элементов: %d%n",linkedListSum(myLinkedList));
    }

    public static void linkedListRndFill(LinkedList<Integer> myLkdList, int size) {
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            myLkdList.add(rnd.nextInt(10));
        }
    }

    public static Integer linkedListSum(LinkedList<Integer> myLinkedList) {
        Integer sum = 0;
        Iterator<Integer> myIterator = myLinkedList.iterator();
        while (myIterator.hasNext()) {
            sum += myIterator.next();
        }
        return sum;
    }
}
