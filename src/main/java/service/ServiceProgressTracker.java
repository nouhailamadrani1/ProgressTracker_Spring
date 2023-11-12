package service;

import model.Goal;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.GoalRepository;
import repository.UserRepository;

@Service
public class ServiceProgressTracker {
    private UserRepository userRepository;
    private GoalRepository goalRepository;

    @Autowired
    public ServiceProgressTracker(UserRepository userRepository, GoalRepository goalRepository) {
        this.userRepository = userRepository;
        this.goalRepository = goalRepository;
    }

    @Transactional
    public void createNewUserAndAssignGoal() {

        User user = new User();
        user.setName("New User");
        user.setAvatar("user_avatar.jpg");
        userRepository.save(user);


        Goal goal = new Goal();
        goal.setDescription("New Goal");
        goal.setCompleted(false);
        goal.setUser(user);
        goalRepository.save(goal);

        System.out.println("Created a new user and assigned a goal.");
    }



}
