package project.healthy_food.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.healthy_food.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}