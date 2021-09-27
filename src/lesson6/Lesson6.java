package lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        //1
        String firstName = "Ivan";
        String middleName = "Семёнович";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        //2
        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullName.toUpperCase());
        //3
        System.out.println("Данные ФИО сотрудника для административного отдела – " + fullName.replace(" ", ";"));
        //4
        System.out.println("Данные ФИО сотрудника – " + fullName.replace("ё", "е"));
        //5 (мой способ, без подсказки)
        String[] fio = fullName.split(" ");
        System.out.println("Имя сотрудника – " + fio[1]);
        System.out.println("Фамилия сотрудника – " + fio[0]);
        System.out.println("Отчество сотрудника – " + fio[2]);
        //5 (с подсказкой из ДЗ)
        String lastName1 = fullName.substring(0, fullName.indexOf(" "));
        String firstName1 = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        String middleName1 = fullName.substring(fullName.lastIndexOf(" ") + 1);
        System.out.println(lastName1 + " " + firstName1 + " " + middleName1);
        //6
        String fullName2 = "ivanov ivan ivanovich";
        char[] name = fullName2.toCharArray();
        for (int i = 0; i < name.length; i++) {
            if (i == 0 || name[i - 1] == ' ') {
                name[i] = Character.toUpperCase(name[i]);
            }
        }
        String fullName3 = new String(name);
        System.out.println(fullName3);
        //7
        String firstStr = "135";
        String secondStr = "246";
        StringBuilder thirdStr = new StringBuilder();
        for (int i = 0; i < firstStr.length(); i++) {
            thirdStr.append(firstStr.charAt(i));
            thirdStr.append(secondStr.charAt(i));
        }
        System.out.println(thirdStr);
        //8
        String a = "aabccddefgghiijjkk";
        char[] b = a.toCharArray();
        for (int i = 0; i < (a.length() - 1); i++) {
            if (b[i] == b[i + 1]) {
                System.out.print(b[i]);
            }
        }
    }
}
