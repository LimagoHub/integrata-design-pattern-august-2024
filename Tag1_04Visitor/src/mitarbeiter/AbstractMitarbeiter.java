package mitarbeiter;

import mitarbeiter.visitors.MitarbeiterVisitor;

public abstract class AbstractMitarbeiter {

    private String name;

    public AbstractMitarbeiter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( getClass().getSimpleName() + "{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
    public abstract void accept(MitarbeiterVisitor visitor) ;
}
