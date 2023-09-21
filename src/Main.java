public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

   String firstName=" Ivan ";
   String middleName=" Ivanovich ";
   String lastName=" Ivanov ";
   String fullName=lastName+firstName+middleName;
   System.out.println("Ф.И.О. сотрудника - "+fullName);

         System.out.println("Задание 2");

   System.out.println(fullName.toUpperCase());

         System.out.println("Задание 3");
   String newFirstName=firstName.replace(" Ivan "," Семён ");
   String newMiddleName=middleName.replace(" Ivanovich "," Семёнович ");
   String newLastName=lastName.replace(" Ivanov "," Иванов ");
   String newFullName=newLastName+newFirstName+newMiddleName;
   if (newFullName.contains("ё")) {
       newFullName=newFullName.replace("ё", "е");
           System.out.println("Данные Ф.И.О. сотрудника - " + newFullName.toUpperCase());}
   else{
       System.out.println("Данные Ф.И.О. сотрудника - " + newFullName.toUpperCase());}
        }
    }
