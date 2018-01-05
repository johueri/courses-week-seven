package coursesweekseven;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //That will wire us up to the relational database. It creates a table. The columns of the tables are the instance vairables 
//and the rows are made up by the objects. 
@Table(name = "courseTopics")
public class Instructor {

	
	@Id // This annotation is saying this will be the identifier of this entry. This is what's generating the identifier. 
    @GeneratedValue(strategy=GenerationType.AUTO) //This will auto generate an ID. These annotations will only impact the id.
    private Long instructorId;
	private String firstName;
	private String lastName;
	
	@OneToMany (mappedBy="instructor")
	private Set<CourseTopic> courseTopics = new HashSet<CourseTopic>();
	
	

    protected Instructor () {
    	
    }

	
	public Instructor(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}


	  public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}
	


	public void setCourseTopics(Set<CourseTopic> courseTopics) {
		this.courseTopics = courseTopics;
	}
	


	@Override
	    public String toString() {
	        return String.format(
	                "Customer[id=%d, firstName='%s', lastName='%s']",
	                instructorId, firstName, lastName);
	    }
}
