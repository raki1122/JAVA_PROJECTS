package comin28minutes.springboot.Learn_JPA_and_hibernate.jpaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import comin28minutes.springboot.Learn_JPA_and_hibernate.course.Course;
import jakarta.persistence.EntityManager;

@Repository
public class JpaRepo{
	
	@Autowired
	private EntityManager entityManager;
	
	public void insert(Course course)
	{
		entityManager.merge(course);
	}
    
	public void deleteById(Integer id)
	{
		Course course= entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	public Course findById(Integer id)
	{
		  return entityManager.find(Course.class, id);
	}
}
