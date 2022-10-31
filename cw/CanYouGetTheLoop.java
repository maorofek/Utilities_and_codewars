import java.util.ArrayList;

public class CanYouGetTheLoop {

    public static void main(String[] args) {

    }

    public int loopSize(Node node) {
        ArrayList<Node> loopArr = new ArrayList<Node>();
        while (!loopArr.contains(node)) {
            loopArr.add(node);
            node = node.getNext();
        }
        int firstIndex = Math.max(0, loopArr.indexOf(node));
        return loopArr.size() - firstIndex;
    }


    public static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {
        }

        public Node(int _val, Node _next, Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }

        public Node getNext() {
            return next;
        }
    }
}
