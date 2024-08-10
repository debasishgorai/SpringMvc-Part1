package SpringBootApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="courses")
public class Courses {
	public Integer getCoursesId() {
		return coursesId;
	}
	public void setCoursesId(Integer coursesId) {
		this.coursesId = coursesId;
	}
	public String getCoursesName() {
		return coursesName;
	}
	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}
	@Id
	@Column(name="cid")
private Integer coursesId;
	@Column(name="cname")
private String coursesName;

}
