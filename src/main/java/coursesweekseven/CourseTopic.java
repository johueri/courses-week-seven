package coursesweekseven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity //That will wire us up to the relational database
public class CourseTopic {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	
	@ManyToOne
	private Instructor instructor; //many course topics to one instructor
	
	// no argument constructor for jpa
	protected CourseTopic () {

}
	public CourseTopic(String name, String description, Instructor instructor) {
		
		this.name = name;
		this.description = description;
		this.instructor = instructor;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	@Override
	public String toString() {
		return String.format("Courses[id=%d, description='%', name='%']", id, description, name);
	}
	


}