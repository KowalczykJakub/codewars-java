import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Kata {

    public static List<Integer> treeByLevels(Node node) {

        List<Integer> al = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        Node tempNode;

        if (node == null)
            return al;

        queue.add(node);
        al.add(node.value);

        while (!queue.isEmpty()) {

            tempNode = queue.remove();

            if (tempNode.left != null) {

                queue.add(tempNode.left);
                al.add(tempNode.left.value);
            }

            if (tempNode.right != null) {

                queue.add(tempNode.right);
                al.add(tempNode.right.value);
            }
        }

        return al;
    }
}
