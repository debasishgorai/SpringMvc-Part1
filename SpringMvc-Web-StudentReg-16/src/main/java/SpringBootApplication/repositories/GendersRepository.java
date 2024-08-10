package SpringBootApplication.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

//import SpringBootApplication.entity.Courses;
import SpringBootApplication.entity.Genders;

public interface GendersRepository extends JpaRepository<Genders, Serializable>{

}
