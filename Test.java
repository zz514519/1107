/**
 * Author : Zhang Zhe
 */
public class Test {
    public static void main(String[] args) {
        List node= new List();
        node.addFirst(12);
        node.addFirst(10);
        node.addFirst(98);
        node.display();
        node.remove(12);
        node.display();
    }
}
