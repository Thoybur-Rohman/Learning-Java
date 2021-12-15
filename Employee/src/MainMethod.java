public class MainMethod {
    public static void main (String[] args){

        Employee EmployeeOne = new Employee("Thoybur Rohman ", "Reading",
                15000,20);
        Employee EmployeeTwo = new Employee("Saniya Rahman ", "London",
                20000,20);

        EmployeeOne.raiseSalary();

        System.out.println(EmployeeOne.salary);
        System.out.println(EmployeeTwo.salary);
    }
}
