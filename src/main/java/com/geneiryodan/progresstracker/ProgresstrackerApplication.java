package com.geneiryodan.progresstracker;

import com.geneiryodan.progresstracker.Repository.ObjectifRepository;
import com.geneiryodan.progresstracker.Repository.UtilisateurRepository;
import com.geneiryodan.progresstracker.model.Objectif;
import com.geneiryodan.progresstracker.model.Utilisateur;
import com.geneiryodan.progresstracker.service.ServiceProgressTracker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class ProgresstrackerApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		UtilisateurRepository utilisateurRepository = context.getBean(UtilisateurRepository.class);
		ObjectifRepository objectifRepository = context.getBean(ObjectifRepository.class);
		ServiceProgressTracker progressTrackerService = context.getBean(ServiceProgressTracker.class);


		Utilisateur user = progressTrackerService.addUser("John", "john_avatar");
		System.out.println("User added: " + user.getId() + ", " + user.getName());


		Objectif objectif = progressTrackerService.addObjectif("Complete a project", false, user.getId());
		System.out.println("objectif added: " + objectif.getId() + ", " + objectif.getDescription());
	}


}
