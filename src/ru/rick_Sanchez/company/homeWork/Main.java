package ru.rick_Sanchez.company.homeWork;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Skinner", "Directer", 49, 30000);
        Employee employee1 = new Employee("Smoker", "Renegade", 40,20300);
        Employee employee2 = new Employee("Molder", "Agent", 35, 10450);
        Employee employee3 = new Employee("Scully", "Agent", 32,10500);
        Employee employee4 = new Employee("Grey", "Alien", 123, 0);

        employee.showInfo();
        employee1.showInfo();
        employee2.showInfo();
        employee3.showInfo();
        employee4.showInfo();
//------------------------------------------------------
        Employee[] arrEmployees = new Employee[5];
        arrEmployees[0] = employee;
        arrEmployees[1] = employee1;
        arrEmployees[2] = employee2;
        arrEmployees[3] = employee3;
        arrEmployees[4] = employee4;

        System.out.println("--------------------------------------------------------------");

        int searchAge = 40;
        System.out.println("Информация о сотрудниках чей возраст привышает "+searchAge +" лет:" + '\n');
        for(int i = 0; i < arrEmployees.length; i++) {
            if(arrEmployees[i].getAge() > searchAge){
                arrEmployees[i].showAllInfo();
            }
        }

        searchAge = 45;
        int increaseSalary = 5000;
        for(int j = 0; j < arrEmployees.length; j++) {
            if(arrEmployees[j].getAge() > searchAge) {
                arrEmployees[j].toRaiseWages(searchAge,increaseSalary);
                System.out.print(arrEmployees[j].getFirstName() + " " +arrEmployees[j].getSalary()+'\n');

            }
        }
        System.out.println();

        //-----------------------------------------------------------------------------------------
        //Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5
        double salarySum = 0;
        double ageSum = 0;
        for(int a = 0; a < arrEmployees.length; a++) {
            if(a < arrEmployees.length) {
                salarySum += arrEmployees[a].getSalary();
                ageSum += arrEmployees[a].getAge();
            }
        }
        System.out.println("Средняя заработная плата составляет: " + salarySum/arrEmployees.length + "$."+'\n' +
                            "Средний возраст сотрудников составляет: " + ageSum/arrEmployees.length+" лет.");




    }

}
