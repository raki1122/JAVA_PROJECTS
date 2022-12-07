package comin28minutes.springboot.Learn_JPA_and_hibernate.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import comin28minutes.springboot.Learn_JPA_and_hibernate.course.Course;

public interface SpringDataJp extends JpaRepository<Course, Integer> {
  public List<Course> findByName(String name);
}
