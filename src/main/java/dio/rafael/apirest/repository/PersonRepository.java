package dio.rafael.apirest.repository;

import dio.rafael.apirest.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person,Long> {
}
