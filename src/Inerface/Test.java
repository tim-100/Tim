package Inerface;

public class Test {
    public static void main(String[] args) {
        Animal anim = new Animal(5);
        Person pers = new Person("red");
       outInfo(anim);
       outInfo(pers);
    }
    public static void outInfo(Info info){
        info.showInfo();
    }
}
