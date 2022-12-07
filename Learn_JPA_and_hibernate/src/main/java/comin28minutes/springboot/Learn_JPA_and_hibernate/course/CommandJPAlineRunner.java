package comin28minutes.springboot.Learn_JPA_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import comin28minutes.springboot.Learn_JPA_and_hibernate.course.Course;
import comin28minutes.springboot.Learn_JPA_and_hibernate.jpa.SpringDataJp;
import comin28minutes.springboot.Learn_JPA_and_hibernate.jpaRepo.JpaRepo;
import jakarta.transaction.Transactional;

@Component
@Transactional
public class CommandJPAlineRunner implements CommandLineRunner {
//	@Autowired
//	private Jdbcrepository jdbcrepository;
//	@Autowired
//	JpaRepo jpsRepository;
	@Autowired
	SpringDataJp springDataJp;
	@Override
	public void run(String... args) throws Exception {
		
		springDataJp.save(new Course(2,"Rakesh","Learn JPA IN27 minutes"));
		springDataJp.save(new Course(3,"Ramesh","Learn JPA IN27 minutes"));
		springDataJp.save(new Course(4,"Rajesh","Learn JPA IN27 minutes"));
//		System.out.println(springDataJp.findAll());
//		Thread.sleep(100000);
//		springDataJp.deleteById(2);
		System.out.println(springDataJp.findByName("Rakesh"));
		System.out.println(springDataJp.findByName(""));
		System.out.println(springDataJp.findById(3));
	
	}

}
