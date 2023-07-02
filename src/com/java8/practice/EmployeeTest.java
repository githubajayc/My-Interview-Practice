package com.java8.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee(101,"Ajay",27,"M","IT",2023,60000.00),
                new Employee(102,"Abhi",37,"M","HR",2014,51000.00),
                new Employee(103,"Shraddha",43,"F","Finance",2013,88000.00),
                new Employee(104,"Kailsh",51,"M","HR",2021,46000.00),
                new Employee(105,"Srushti",32,"F","Finance",2023,56000.00));
		
//      //Count of Employee by Department
		Map<String, Long> empCountByDept = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(empCountByDept);
        
        //avg salary of male female
        
        Map<String, Double> avgSalaryByGender = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
	    System.out.println(avgSalaryByGender);
	    
	    //Highest Paid Employee
	    List<Employee> highetsPaid = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(1).collect(Collectors.toList());
	    System.out.println(highetsPaid);
	    
	    //avg age of each dept
	    
	    Map<String, Double> avgAgeByDept = list.stream().collect(Collectors.groupingBy(Employee :: getDepartment,Collectors.averagingInt(Employee :: getAge)));
	    System.out.println(avgAgeByDept);
	    
	    //seniormost employee
	    
	    Optional<com.java8.practice.Employee> seniormost = list.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
	    System.out.println(seniormost);
	    List<Employee> senior = list.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).limit(1).collect(Collectors.toList());
	    System.out.println("SeniorMost Emplloyee (Alternate Way)" + senior);
	    
	    //Youngest employee
	    
	    Optional<com.java8.practice.Employee> ypungest = list.stream().max(Comparator.comparingInt(Employee::getYearOfJoining));
	    System.out.println(ypungest);
	    
	    List<Employee> youngest = list.stream().sorted(Comparator.comparingInt(Employee::getAge)).limit(1).collect(Collectors.toList());
	    System.out.println("Youngest by Other way " + youngest);
	    
	    Map<Integer, Long> countByGender = list.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));
	    System.out.println(countByGender);
	    
	    
	    
	}

}
