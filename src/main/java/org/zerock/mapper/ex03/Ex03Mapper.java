package org.zerock.mapper.ex03;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.ex02.BoardDto;


public interface Ex03Mapper {

	@Select("SELECT FirstName FROM Employees WHERE EmployeeID = #{id}")
	String selectfirstEmployeeNameById(int id);
	
	
	String selectCustomerNameById(int id);


	


	String firstEmployeefirstNameById(int id);


	List<BoardDto> selectBoard();


	BoardDto getBoard(int id);


	int updateBoard(BoardDto board);


	int deleteBoard(int id);


	int insertBoard(BoardDto board);
}


