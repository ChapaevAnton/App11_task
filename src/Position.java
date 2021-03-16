public class Position {

    // TODO: Класс Position - самодостаточен, в нем уже есть все для решения, ну почти все...
    public static final String ENGINEER = "Инженер";
    public static final String PROGRAMMER = "Программист";
    public static final String DESIGNER = "Дизайнер";
    public static final String ARCHITECT = "Архитектор";

    private String position; //должность
    private double salary; //оклад
    private double wage; //зарплата


    public Position(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getSalary() {
        return salary;
    }

    // TODO: Подсказка - может быть стоит переопределить метод toString

}
