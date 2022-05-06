package lecture.c4core;

public class Servlet {
	private Dao dao;
	
	public void doGet() {
		dao.select();
	}
}
