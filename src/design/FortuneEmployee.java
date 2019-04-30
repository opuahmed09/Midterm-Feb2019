package design;

import databases.ConnectToSqlDB;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo employee1=new EmployeeInfo(1);
		EmployeeInfo employee2=new EmployeeInfo("Opu",2);
		EmployeeInfo employee3=new EmployeeInfo("Adnan",3,23);
		System.out.println("----------");
		EmployeeInfo.calculateEmployeeBonus(5000,7);
		EmployeeInfo.calculateEmployeeBonus(5000,10);
		System.out.println("-----------");
		employee1.setname("Showrob");
		System.out.println(employee1.getNamet());
		System.out.println("-------------");
		ConnectToSqlDB connect =new ConnectToSqlDB();
		connect.insertProfileToSqlTable("Employee","ID","AGE");




	}

}
