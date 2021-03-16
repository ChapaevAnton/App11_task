public class Employees {

    // TODO: Класс Employees - самодостаточен, в нем уже есть все для решения, ну почти все...
    private String name; //ФИО
    private int workExperience; //опыт работы


    public Employees(String name, int workExperience) {
        this.name = name;
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public String getName() {
        return name;
    }

    // TODO: Подсказка - может быть стоит переопределить метод toString

}
