package SpringBootApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="timings")
public class Timings {
	public Integer getTimingsId() {
		return timingsId;
	}
	public void setTimingsId(Integer timingsId) {
		this.timingsId = timingsId;
	}
	public String getTimingsName() {
		return timingsName;
	}
	public void setTimingsName(String timingsName) {
		this.timingsName = timingsName;
	}
	@Id
	@Column(name="tid")
private Integer timingsId;
	@Column(name="tname")
private String timingsName;
}
