package solution_task;

public class Employees {

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

    // TODO: 16.03.2021
    @Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО='" + name + '\'' +
                ", опыт работы=" + workExperience + '}';
    }
}
