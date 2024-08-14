package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KontoGruppe extends AbstractKontoNode {

    private final List<AbstractKontoNode> children = new ArrayList<>();

    public KontoGruppe(String label) {
        super(label);
    }

    @Override
    public List<AbstractKontoNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void appendChild(final AbstractKontoNode child) {
        child.setParent(this);
        children.add(child);
    }
    public void removeChild(final AbstractKontoNode child) {
        child.setParent(null);
        children.remove(child);
    }
}
