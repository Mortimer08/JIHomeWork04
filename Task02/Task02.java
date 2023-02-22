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
        System.out.printf("Первый элемент в пустой очереди: %d%n", examplQueue.first()); // просмотр первого объекта в очереди
        examplQueue.enqueue(10);            // добавление элементов в конец очереди
        examplQueue.enqueue(20);            // добавление элементов в конец очереди
        examplQueue.enqueue(30);            // добавление элементов в конец очереди
        System.out.printf("Первый элемент в очереди: %d%n", examplQueue.first());    // просмотр первого элемента в очереди
        System.out.printf("Извлечён первый элемент очереди: %d%n", examplQueue.dequeue());  // извлечение и вывод в консоль первого элемента из очереди
        System.out.printf("Теперь первый элемент в очереди: %d%n", examplQueue.first());  // просмотр первого элемента в очереди
    }
}
