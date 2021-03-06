package program;
// incepem cu clasa care nu are dependinte externe?
public abstract class Animal {
    private String name; //in diagrama e +, adica public, dar noi facem private (-)

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
