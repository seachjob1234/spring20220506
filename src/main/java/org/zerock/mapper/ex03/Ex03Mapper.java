package org.zerock.mapper.ex03;

import org.apache.ibatis.annotations.Select;

public interface Ex03Mapper {

	@Select("SELECT FirstName FROM Employees WHERE EmployeeID = #{id}")
	String selectfirstEmployeeNameById(int id);
}
