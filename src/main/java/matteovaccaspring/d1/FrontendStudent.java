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
public class FrontendStudent implements IStudent {
	private String name;

	@Override
	public void answersQuestion() {
		// TODO Auto-generated method stub
		log.info("wewe");
	}
}
