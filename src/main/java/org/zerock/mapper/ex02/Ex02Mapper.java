package org.zerock.mapper.ex02;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zerock.domain.ex01.CustomerDto;
import org.zerock.domain.ex01.EmployeeDto;

public interface Ex02Mapper {

	@Select("SELECT CustomerName FROM Customers WHERE CustomerID = #{id}")
	String selectNameById(int id);
	
	@Select("SELECT CustomerName Name,Address, City, Country FROM Customers WHERE CustomerId =#{id}")
	CustomerDto selectCustomerById(int id);
	// 테이블의 컬럼명과 이게 같을 수 는 없음 
	//그럼 as로 바꿔어어어어
	
	@Select("SELECT FirstName,LastName,BirthDate FROM Employees WHERE EmployeeID = #{id}")
	EmployeeDto selectEmployeeById(int id);
	@Insert("INSERT INTO Customers "
			+ " (CustomerName,ContactName,City,Country,Address,PostalCode) "
			+ " VALUES (#{customerName}, #{contactName}, #{city}, #{country}, #{address}, #{postalCode}) ")
			
	int insertCustomer(CustomerDto customer);
	
	@Insert("INSERT INTO Employees "
			+ " (LastName,FirstName,Photo,Notes,BirthDate) "
			+ "VALUES(#{lastName}, #{firstName}, #{photo}, #{notes}, #{birthDate}) ")
	int insertEmployee(EmployeeDto employee);
	
	@Select("SELECT EmployeeID ID,FirstName,LastName,Photo,Notes,BirthDate " 
			+ "FROM Employees ORDER BY EmployeeID ")
	List<EmployeeDto> listEmployee();
	
	@Select("SELECT CustomerID id,ContactName,CustomerName, City, Country, Address, PostalCode "
			+ "FROM Customers ORDER BY CustomerID ")
	List<CustomerDto> listCustomer();
	@Select("SELECT CustomerID id, "
			+ "CustomerName, "
			+ "ContactName, "
			+ "Address, "
			+ "City, "
			+ "Country, "
			+ "PostalCode "
			+ "FROM Customers "
			+ "LIMIT #{from},#{row} ")
	List<CustomerDto> listCustomerPage(@Param("from")int page,@Param("row") int row);
	@Select("SELECT Count(CustomerID) FROM Customers ")
	int countCustomers();			
	
	
}
