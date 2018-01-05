package coursesweekseven;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;

public class CoursePopulator implements CommandLineRunner {
	
	@Resource
	private CourseRepository courseRepo;
	
	@Resource
	private InstructorRepository instructorRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Instructor brian = new Instructor("Brian","Forsythe");
		instructorRepo.save(brian);
		Instructor don = new Instructor("Don","Hamilton");
		instructorRepo.save(don);
		Instructor alan = new Instructor("Alan","Kostric");
		instructorRepo.save(alan);
		
		CourseTopic course1 = new CourseTopic("Spring","Spring Framework Description", brian);
		courseRepo.save(course1);
		CourseTopic course2 = new CourseTopic("Javascript","Javascript Description",don);
		courseRepo.save(course2);
		CourseTopic course3 = new CourseTopic("Java","Core Java Description", alan);
		courseRepo.save(course3);
		CourseTopic course4 = new CourseTopic("HTML", "HTML for Web Description", don);
		courseRepo.save(course4);
	}

}
