package solution_task;

import java.util.Comparator;

public class ComparatorPosition {

    // TODO: Создайте компараторы упорядочивающие список
    //  сотрудников по ФИО (name), если ФИО совпадает
    //  - примените дополнительную сортировку по ОПЫТУ РАБОТЫ (workExperience)
    //  Подсказка - определить два компаратора можно и в одном(файле) классе -
    //  используйте вложенные классы или выражения лямбда если вы с ними знакомы.
    //  Или действуйте по обстоятельствам исходя из своих знаний,
    //  ничего не мешает вам, создать еще один класс(файл) компаратора...

    public static class name implements Comparator<Employees> {

        @Override
        public int compare(Employees o1, Employees o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class workExperience implements Comparator<Employees> {

        @Override
        public int compare(Employees o1, Employees o2) {
            return o1.getWorkExperience() - o2.getWorkExperience();
        }
    }
}
