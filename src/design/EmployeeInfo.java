package design;

import java.util.Scanner;
public class EmployeeInfo extends EmployeeinfoAbstract implements Employee{

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */
   private  static String companyName;
   private String name;
   public static double salary;
   private int employeeID,employeeAge;

    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    public EmployeeInfo(int employeeId) {
        this.employeeID=employeeId;
        System.out.println(employeeId);

    }

    public EmployeeInfo(String name, int employeeId) {
        this.name=name;
        this.employeeID=employeeId;
        System.out.println(name+ " "+ employeeId);

    }
    public EmployeeInfo(String name, int employeeID,int employeeAge){
        this.name=name;
        this.employeeID=employeeID;
        this.employeeAge=employeeAge;
        System.out.println(name+ " "+ employeeAge);
    }

    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public static int calculateEmployeeBonus(int salary,int performance) {
        int total = 0;
        double bperformance= .10;
        double avg_performance= .08;
        if (performance>8){
            total= (int) (salary * bperformance);
        }else {
            total= (int) (salary *avg_performance);
        }
        System.out.println("Employee bonus= "+ total+"Dollar");
        return total;
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static int calculateEmployeePension(int i) {
        int ptotal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates

        String startyer=convertedJoiningDate.substring(convertedJoiningDate.length()-4);
        String currentdate= convertedJoiningDate.substring(convertedJoiningDate.length()-4);
        int strat=Integer.parseInt(startyer);
        int current=Integer.parseInt(currentdate);
        int work=strat-current;


        //calculate pension
        if(work==1){
            ptotal= (int) (salary*0.5);
        }else if (work==2){
            ptotal= (int) (salary*1.0);
        }else if (work<=1){
            ptotal=0;
        }
        System.out.println("you're pension are = "+ptotal);



        return ptotal;
    }
    public String setname(String name){
        this.name=name;
        return name;
    }
    public String getNamet(){
        return name;
    }
    public void professional(){
        System.out.println("Employee have to be profissional");
    }
    @Override
    public int EmployeeID(){
        return 0;
    }


    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName(){
        return null;
    }
    @Override
    public void assignDepartment() {
    }

    @Override
    public int calculateSalary() {
        return 0;
    }


    @Override
    public void benefitLayout() {


    }

    private static class DateConversion {

        public DateConversion(Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
        Months months=null;
        try {
            months = Months.valueOf(givenMonth);
        }catch(IllegalArgumentException e){
            System.out.println("you're date in wrog foramt,please try again with correct form");
        }
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
