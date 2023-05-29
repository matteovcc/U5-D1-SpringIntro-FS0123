package matteovaccaspring.d1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@AllArgsConstructor
@ToString
public class Interviewer {
	IStudent student; // DIPENDENZA
	String name;

	public Interviewer(String name, IStudent student) {
		this.name = name;
		this.student = student;
	}

	public void askQuestion() {
		log.warn("Ehi rispondi " + student.getName() + " RISOLVIMI QUESTA CHALLENGE");
	}
}
