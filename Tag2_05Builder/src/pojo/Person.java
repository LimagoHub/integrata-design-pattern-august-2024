package pojo;

public class Person {

    private String vorname;
    private String nachname;


    public Person() {
        this("John", "Doe");
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private Person person = new Person();
        public PersonBuilder vorname(String vorname) {
            person.setVorname(vorname);
            return this;
        }
        public PersonBuilder nachname(String nachname) {
            person.setNachname(nachname);
            return this;
        }

        public Person build() {
            // mögliche Validierungen
            return person;
        }
    }

}
