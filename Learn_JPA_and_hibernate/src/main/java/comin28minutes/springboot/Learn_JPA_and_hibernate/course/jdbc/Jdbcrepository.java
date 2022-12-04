package comin28minutes.springboot.Learn_JPA_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;

import comin28minutes.springboot.Learn_JPA_and_hibernate.course.Course;

@Repository
public class Jdbcrepository {
   @Autowired
	private JdbcTemplate jdbctemplate;
   
	private static String query=
			                    """
			                    insert into course values(?,?,?)	
			                    """;
	private static String query1="""
			  delete from Course where id=?
			""";
	private static String query2="""
			  select * from Course where id=?
			""";
	
	public void insert(Course course)
	{
		jdbctemplate.update(query,course.getId(),course.getName(),course.getAuthor());
	}
	public void delete(Integer id)
	{
		jdbctemplate.update(query1,id);
	}
	public Course findById(Integer id)
	{
		  return jdbctemplate.queryForObject(query2,new BeanPropertyRowMapper<>(Course.class),id);
	}
}
