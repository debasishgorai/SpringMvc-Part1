package SpringBootApplication.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootApplication.entity.Courses;
import SpringBootApplication.entity.Timings;

public interface TimingsRepository extends JpaRepository<Timings, Serializable>{

} 
