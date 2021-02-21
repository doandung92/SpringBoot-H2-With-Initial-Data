package com.evolyb.thymeleaf.layout.repository;

import com.evolyb.thymeleaf.layout.entity.*;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, Integer> {
}
