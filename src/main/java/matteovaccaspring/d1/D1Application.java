package matteovaccaspring.d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class D1Application {

	public static void main(String[] args) {
		SpringApplication.run(D1Application.class, args);
//
//		FrontendStudent f = new FrontendStudent("aldo");
//		BackendStudent b = new BackendStudent("gigi");
//		Interviewer i = new Interviewer("Lino", f);
//		i.askQuestion();
		configWithConfigurationAnnotation();
	}

	public static void configWithConfigurationAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(D1Application.class);
		log.info((String) ctx.getBean("getName"));

		log.info((String) ctx.getBean("fe"));
		log.info(ctx.getBean("ajeje").toString());
		ctx.close();
		// comment
	}

}
