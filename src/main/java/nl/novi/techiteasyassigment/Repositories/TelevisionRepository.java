package nl.novi.techiteasyassigment.Repositories;


import nl.novi.techiteasyassigment.Models.Television;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelevisionRepository extends JpaRepository<Television, Long> {
}
