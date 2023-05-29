package confif;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import matteovaccaspring.d1.FrontendStudent;
import matteovaccaspring.d1.IStudent;
import matteovaccaspring.d1.Interviewer;

@Configuration
public class BeanConfiguration {
	@Bean(name = "getName")
	String name() {
		return "giacomo";
	}

	@Bean
	int age() {
		return 23;
	}

	@Bean("aldo")
	IStudent fe() {
		return new FrontendStudent("Aldo");
	}

	@Bean("ajeje")
	Interviewer interviewer(IStudent s) {
		return new Interviewer("Ajeje", s);
	}
}
