
public class User {
    private int id;
    private String name;
    private String birth;

    public User() {
    }

    public User(int id, String name, String birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getBirth() {

        return birth;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}


