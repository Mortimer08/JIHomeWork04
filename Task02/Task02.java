/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
package Task02;
public class Task02 {
    public static void main(String[] args) {
        MyQueue examplQueue = new MyQueue(); // создание объекта MyQueue
        System.out.println(examplQueue.first()); // просмотр первого объекта в очереди
        examplQueue.enqueue(10);            // добавление элементов в конец очереди
        examplQueue.enqueue(20);            // добавление элементов в конец очереди
        examplQueue.enqueue(30);            // добавление элементов в конец очереди
        System.out.println(examplQueue.first());    // просмотр первого объекта в очереди
        System.out.println(examplQueue.dequeue());  // извлечение и вывод в консоль первого элемента из очереди
        System.out.println(examplQueue.first());    // просмотр первого объекта в очереди
    }
}
