package solution_task;

public class CalculateSalary {

    // TODO: 16.03.2021 Разработайте метод расчета заработной платы
    //  зарплата = опыт работы * оклад;
    public static double calcWage(Employees employeeKey, Position positionValue) {

        return employeeKey.getWorkExperience() * positionValue.getSalary();
    }
}
