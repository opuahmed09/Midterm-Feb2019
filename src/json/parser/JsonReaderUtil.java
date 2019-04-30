package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


public class JsonReaderUtil {

    /*
      ToDo:API is given, This Rest API will give you a Json Array. It is parsed partially. Your task is to give the following output.

      output:

     "mrahman@gmail.com" "Matiur Rahman" "400k" "Finance"
     "mrahman@gmail.com" "Rohan Rahman" "100k" "Engineering"
     "kafil@gmail.com" "Kafil" "200k" "Backend End Team"
     "Dave@gmail.com" "David Lenard" "140k" "Engineering"
     "rivera@gmail.com" "Rivera Dupp" "150k" "Finance"
     "Anand@gmail.com" "Anand Thakkar" "120k" "SDET"
     "sumay@gmail.com" "Sumaya Akbar" "200k" "Finance"
     "mrahman@gmail.com" "Mizanur Rahman" "400k" "Finance"
     "mrahman2@gmail.com" "Mizanur Rahman" "405k" "Finance"
     "mdtaque@gmail.com" "rifat taque" "400k" "QA"
     "mdtaque@gmail.com" "rifat taque" "400k" "QA"

     */

    public static void main(String[] args) throws MalformedURLException, IOException {
        String urls = "http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources";

        List<Employee> emp = new ArrayList<Employee>();
        Employee employee;

        URL ur = new URL(urls);

        URLConnection request = ur.openConnection();
        request.connect();  // hitting the url

        JsonArray jsonArray = null;
        JsonParser jp = new JsonParser();
        JsonElement element = jp.parse(new InputStreamReader((InputStream) request.getContent()));

        if (element instanceof JsonObject) {
            JsonObject rootobj = element.getAsJsonObject();
        } else if (element instanceof JsonArray) {
            jsonArray = element.getAsJsonArray();
        }

        employee = new Employee();


        for (int i = 0; i < jsonArray.size() - 1; i++) {
            try {

                JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();


                String empName = jsonObject.get("empName").toString();
                employee.setEmpName(empName);

                String empEmail = jsonObject.get("empEmail").toString();
                employee.setEmpEmail(empEmail);

                String salary = jsonObject.get("salary").toString();
                employee.setSalary(salary);

                String department = jsonObject.get("department").toString();
                employee.setSalary(department);
                employee = new Employee(employee.getEmpName(), employee.getEmpEmail(), employee.getSalary()
                        , employee.getDepartment());


                emp.add(employee);


            } catch (Exception e) {


            }


        }



        for (Employee e : emp) {
            System.out.println(e.getEmpName() + " \n " + e.getEmpEmail() + "\n" + e.getSalary() + "\n" + e.getDepartment());
        }


    }




}
