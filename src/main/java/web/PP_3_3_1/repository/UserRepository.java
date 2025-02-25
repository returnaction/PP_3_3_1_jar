package web.PP_3_3_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.PP_3_3_1.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
