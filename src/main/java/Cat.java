public class Cat {
    private String name;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Cat: name = %s", name);
    }
}
