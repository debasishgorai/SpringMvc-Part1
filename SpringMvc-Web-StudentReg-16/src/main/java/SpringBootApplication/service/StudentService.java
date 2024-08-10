package SpringBootApplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SpringBootApplication.entity.Courses;
import SpringBootApplication.entity.Genders;
import SpringBootApplication.entity.Timings;
import SpringBootApplication.repositories.CoursesRepository;
import SpringBootApplication.repositories.GendersRepository;
import SpringBootApplication.repositories.TimingsRepository;

public class StudentService {
@Autowired
	private GendersRepository gendersRepo;
@Autowired
	private CoursesRepository coursesRepo;
@Autowired
	private TimingsRepository timingsRepo;
	
public List<String>getGenders(){
	List<Genders> findAll=gendersRepo.findAll();
	List<String> genders= new ArrayList();
	findAll.forEach(gender->{
		genders.add(gender.getGenderName());
		
	});
	
	
	return genders;


	
}
public List<String>getCourses(){
	List<Courses>findAll=coursesRepo.findAll();
	List<String> courses= new ArrayList();
	findAll.forEach(course->{
		courses.add(course.getCoursesName());
		
	});
	
	
	return courses;


	
}
public List<String>getTimings(){
	List<Timings> findAll=timingsRepo.findAll();
	List<String> timings= new ArrayList();
	findAll.forEach(timing->{
		timings.add(timing.getTimingsName());
		
	});
	
	
	return timings;


	
}








}
