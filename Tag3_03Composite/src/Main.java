import composite.AbstractNode;
import composite.Leaf;
import composite.Node;

public class Main {
    public static void main(String[] args) {
        Node root = new Node("root");

        Node child1 = new Node("child1");
        Node child2 = new Node("child2");

        root.appendChild(child1);
        root.appendChild(child2);

        Node child1_1 = new Node("child1_1");
        child1.appendChild(child1_1);

        Node child1_2 = new Node("child1_2");
        child1.appendChild(child1_2);

        Node child2_1 = new Node("child2_1");
        child2.appendChild(child2_1);

        Leaf leaf2_2 = new Leaf("leaf2_2");
        child2.appendChild(leaf2_2);

        traverse(root);
    }

    public static void traverse(AbstractNode node) {
        System.out.println(node);
        for (AbstractNode child : node.getChildren()) {
            traverse(child);
        }
    }
}