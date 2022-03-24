package Tim1;

public class Family {

    private String name;
    private int age;

    public Family(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void infoFamily() {
        System.out.println("Имя: " + name + "; возраст: " + age);
    }
}
