package repository;

import model.Goal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {
    // You can add custom query methods here if needed

    @Override
    <S extends Goal> S save(S entity);
}