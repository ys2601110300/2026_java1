package ai0611.abstractTest;

public class RunPerson {
    public static void main(String[] args) {
        //  추상(abstrct)
    //    Person person = new Person();
        Man man = new Man();
        man.name = "김폴리";
        man.weight = 70;
        man.height = 180;

        Woman woman = new Woman();
        woman.name = "박인순";
        woman.weight = 48;
        woman.height = 170;

        man.eat("김치찌개");
        man.study();
        man.sleep(8);

        woman.eat("파스타");
        woman.study();
        woman.sleep(10);
    }
}
