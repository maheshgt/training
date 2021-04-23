package com.student.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.student.entity.Student;

public class StudentDao {
	
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Student p){  
	    String sql="insert into student(firstName, lastName, email, city) values('"+p.getFirstName()+"',"+p.getLastName()+",'"+p.getEmail()+",'"+p.getCity()+"')";  
	    return template.update(sql);  
	}  
	public int update(Student p){  
	    String sql="update student set firstName='"+p.getFirstName()+"', lastName="+p.getLastName()+",email='"+p.getEmail()+",city="+p.getCity()+"' where id="+p.getId()+"";  
	    return template.update(sql);  
	}  
	public int delete(int id){  
	    String sql="delete from student where id="+id+"";  
	    return template.update(sql);  
	}  
	public Student getStudentById(int id){  
	    String sql="select * from student where id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));  
	}  
	public List<Student> getStudents(){  
	    return template.query("select * from student",new RowMapper<Student>(){  
	        public Student mapRow(ResultSet rs, int row) throws SQLException {  
	        	Student e=new Student();  
	            e.setId(rs.getInt(1));  
	            e.setFirstName(rs.getString(2));  
	            e.setLastName(rs.getString(3)); 
	            e.setEmail(rs.getString(4));  
	            e.setCity(rs.getString(5));  
	            return e;  
	        }  
	    });  
	}
}
