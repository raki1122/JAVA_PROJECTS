package comin28minutes.springboot.Learn_JPA_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import comin28minutes.springboot.Learn_JPA_and_hibernate.course.Course;

@Component
public class CommandlineRunner implements CommandLineRunner {
	@Autowired
	private Jdbcrepository jdbcrepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		jdbcrepository.insert(new Course(2,"Rakesh","IN27 minutes"));
		jdbcrepository.insert(new Course(3,"Ramesh","IN28 minutes"));
		jdbcrepository.insert(new Course(4,"Rajesh","IN29 minutes"));
		Thread.sleep(100000);
		jdbcrepository.delete(2);
		System.out.println(jdbcrepository.findById(3));
	}

}
