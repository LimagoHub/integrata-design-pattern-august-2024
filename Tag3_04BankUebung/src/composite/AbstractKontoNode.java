package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractKontoNode implements Iterable<AbstractKontoNode> {
    private AbstractKontoNode parent = null;
    private String label;

    public AbstractKontoNode(String label) {
        this.label = label;
    }

    public AbstractKontoNode getParent() {
        return parent;
    }

    public void setParent(AbstractKontoNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<AbstractKontoNode> getChildren() {
        return Collections.emptyList();
    }

    public void print() {
        this.iterator().forEachRemaining(System.out::println);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( getClass().getSimpleName() +"{");
        sb.append("label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Iterator<AbstractKontoNode> iterator() {
        final List<AbstractKontoNode> nodes = new ArrayList<AbstractKontoNode>();
        iteratorImpl(nodes);
        return nodes.iterator();
    }
    private void iteratorImpl(final List<AbstractKontoNode> nodes) {
        nodes.add(this);
        for(var child: this.getChildren()){
            child.iteratorImpl(nodes);
        }
    }

}
