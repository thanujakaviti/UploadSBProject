package in.jt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {
	public static void main(String[] args) throws SQLException, JsonProcessingException {
		Student std = new Student();
		std.setSid(101);
		std.setSname("Vikram");
		std.setSfee(5000.00);
		
		System.out.println(std.getSid());
		System.out.println(std.getSname());
		System.out.println(std.getSfee());
		
		Student std1 = new Student(102,"Janu",6000.00);
		System.out.println(std1);
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sai");
		
		System.out.println(con);
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(std);
		System.out.println(json);
		
	}
}
