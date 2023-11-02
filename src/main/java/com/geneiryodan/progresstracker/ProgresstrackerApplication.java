package com.geneiryodan.progresstracker;

import com.geneiryodan.progresstracker.model.Utilisateur;
import com.geneiryodan.progresstracker.service.ServiceProgressTracker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class ProgresstrackerApplication {




		public static void main(String[] args) {
			SpringApplication.run(ProgresstrackerApplication.class, args);
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

			ServiceProgressTracker progressTracker = context.getBean(ServiceProgressTracker.class);

			progressTracker.attribuerObjectif("Nouvel objectif" ,new Utilisateur("laila","hyu"));
			boolean done = true;
			progressTracker.mettreAjourProgression(done);

		}


}
