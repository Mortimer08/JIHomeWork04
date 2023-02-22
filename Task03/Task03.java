package Task03;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
Используйте итератор
*/
public class Task03 {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        linkedListRndFill(myLinkedList, 100000);
        // System.out.println(myLinkedList);
        long time1 = System.currentTimeMillis();
        System.out.printf("Сумма элементов итератором: %d%n", linkedListSum(myLinkedList));
        long time2 = System.currentTimeMillis();
        System.out.printf("Время: %d%n", time2 - time1);
        System.out.printf("Сумма элементов по индексам: %d%n", linkedListAlterSum(myLinkedList));
        long time3 = System.currentTimeMillis();
        System.out.printf("Время: %d%n", time3 - time2);
        System.out.printf("Сумма элементов через извлечение: %d%n", linkedListAlterSum2(myLinkedList));
        long time4 = System.currentTimeMillis();
        System.out.printf("Время: %d%n", time4 - time3);

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

    public static Integer linkedListAlterSum(LinkedList<Integer> myLinkedList) {
        Integer sum = 0;
        for (int i = 0; i < myLinkedList.size(); i++) {
            sum += myLinkedList.get(i);
        }
        return sum;
    }
    public static Integer linkedListAlterSum2(LinkedList<Integer> myLinkedList) {
        Integer sum = 0;
        while (!myLinkedList.isEmpty()) {
            sum+=myLinkedList.pop();
        }
        return sum;
    }
}
