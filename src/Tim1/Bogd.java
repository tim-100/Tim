package Tim1;

public class Bogd extends Family implements Semiy {

    private final String fam;

    public Bogd(){
        super("Dmitrii", 52);
        this.fam = "Bogdanov";
    }

    public  void infoBogd() {
        System.out.println("Фамилия: " + this.fam + "; Имя: "+ super.getName() + "; возраст: "+ super.getAge());
    }

    @Override
    public void kalinino() {
        System.out.println("Живёт на Калинино");
    }
}
