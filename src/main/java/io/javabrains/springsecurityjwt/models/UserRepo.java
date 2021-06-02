package io.javabrains.springsecurityjwt.models;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String>{
	Optional<User> findByUserName(String userName);
}
