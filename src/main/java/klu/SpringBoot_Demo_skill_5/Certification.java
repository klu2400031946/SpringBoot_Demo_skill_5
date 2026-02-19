package klu.SpringBoot_Demo_skill_5;

import org.springframework.stereotype.Component;

@Component
public class Certification {

	private int id = 1946;
	private String name = "courseera";
	private String dateOfCompletion = "24-01-2026";

	public void displayCertification() {
		System.out.println("Certification ID: " + id);
		System.out.println("Certification Name: " + name);
		System.out.println("Date Of Completion: " + dateOfCompletion);
	}
}
