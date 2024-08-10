package SpringBootApplication.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootApplication.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Serializable>{

	

}
