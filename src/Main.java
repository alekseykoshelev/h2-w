public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
    }

    private static void task3() {
        var fullName = "Ёванов Семён Семёнович";
        var replaced = fullName.replace('ё', 'е').replace('Ё', 'Е').length();
        System.out.println(replaced);
    }

    private static void task2() {
        String firstName = "Aleksey";
        String middleName = "Igorevich";
        String lastName = "Koshelev";

        String upperFullName = (firstName + " " + middleName + " " + lastName).toUpperCase();
        System.out.println("ФИО сотрудника — " + upperFullName);
    }

    private static void task1() {
        String firstName = "Aleksey";
        String middleName = "Igorevich";
        String lastName = "Koshelev";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
}