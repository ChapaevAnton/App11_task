package solution_task;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        //создаем должности
        //для решения - этот код изменять не нужно
        Position engineer = new Position(Position.ENGINEER, 1000);
        Position programmer = new Position(Position.PROGRAMMER, 800);
        Position designer = new Position(Position.DESIGNER, 300);
        Position architect = new Position(Position.ARCHITECT, 1500);

        //формируем массив должностей на предприятии
        //для решения - этот код изменять не нужно
        Position[] position = {engineer, programmer, designer, architect};

        // TODO: Для проверки результата, помните -> В ДАННЫЙ МОМЕНТ НА ПРЕДПРИЯТИИ РАБОТАЕТ 11 ЧЕЛОВЕК
        //  не надо никого принимать на работу или увольнять, не изменяйте численный состав.
        //формируем численные состав предприятия
        //для решения - этот код изменять не нужно
        List<Employees> employee = new ArrayList<>();
        employee.add(new Employees("Николаев", 10));
        employee.add(new Employees("Иванов", 5));
        employee.add(new Employees("Петров", 6));
        employee.add(new Employees("Сидоров", 5));
        employee.add(new Employees("Демидов", 20));
        employee.add(new Employees("Смирнов", 10));
        employee.add(new Employees("Антонов", 8));
        employee.add(new Employees("Николаев", 7));
        employee.add(new Employees("Хмурый", 5));
        employee.add(new Employees("Ткачев", 15));
        employee.add(new Employees("Демидов", 25));


        //формируем штатное расписание, где каждый сотрудник назначается
        // на определенную должность с соответствующим окладом
        //для решения - этот код изменять не нужно
        Map<Employees, Position> hashMapEmployees = new HashMap<>();
        for (int i = 0; i < employee.size(); i++) {
            hashMapEmployees.put(employee.get(i), position[i % position.length]);
        }

        // TODO: 16.03.2021 ЗАДАНИЕ
        // TODO: Произведите расчет заработной платы сотрудников
        //  исходя и опыта работы и оклада - зарплата = опыт работы * оклад;
        //  код решения писать здесь
        for (Map.Entry<Employees, Position> entryEmployee : hashMapEmployees.entrySet()) {
            double salary = CalculateSalary.calcWage(entryEmployee.getKey(), entryEmployee.getValue());
            entryEmployee.getValue().setWage(salary);
        }


        // TODO: Выведите упорядоченный список ВСЕХ сотрудников - штатное расписание (по ФИО и ОПЫТУ РАБОТЫ)
        //  с полной информацией о них, учитывайте тот факт что в базе есть однофамильцы.
        //  Пример: Сотрудник{ФИО='Демидов', опыт работы=25}->{Должность='Инженер', оклад=1000.0, зарплата=0.0
        //  а так же количество сотрудников в штатном расписании.
        //  Пример: Количество сотрудников в штатном расписании: 11
        //  код решения писать здесь

        Map<Employees, Position> orderedEmployees = new TreeMap<>(new ComparatorPosition.name().thenComparing(new ComparatorPosition.workExperience()));
        orderedEmployees.putAll(hashMapEmployees);

        for (Map.Entry<Employees, Position> entryEmployee : orderedEmployees.entrySet()) {

            System.out.println(entryEmployee.getKey() + "->" + entryEmployee.getValue());
        }

        if(orderedEmployees!=null) {
            System.out.println("Количество сотрудников в штатном расписании: " + orderedEmployees.size());
            System.out.println("Количество сотрудников на предприятии: " + employee.size());
            if (orderedEmployees.size() != employee.size())
                System.err.println("Ошибка!!! Cписок сотрудников не соответствуют штатному расписанию!!!\n " +
                        "включены не все, кого то придется уволить!!!");
        } else System.err.println("Приступите к решению задачи");
    }

}
