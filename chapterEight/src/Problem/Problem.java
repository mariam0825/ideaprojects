package Problem;

public class Problem {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    Problem(String name){
        this.name = name;
    }
    private String description;
    private  String type;
    private boolean Status;
}
