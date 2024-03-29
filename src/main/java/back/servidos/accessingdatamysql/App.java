package back.servidos.accessingdatamysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"back.servidos"})
public class App {

	public static void main(String[] args) {
		//SpringApplication.run(App.class, args);
		SpringApplication application = new SpringApplication(App.class);
		application.setAdditionalProfiles("ssl");
		application.run(args);
	}

}
