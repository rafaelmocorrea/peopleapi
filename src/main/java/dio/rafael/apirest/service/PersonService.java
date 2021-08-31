package dio.rafael.apirest.service;

import dio.rafael.apirest.dto.response.MessageResponseDTO;
import dio.rafael.apirest.entity.Person;
import dio.rafael.apirest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Pessoa criada com ID "+savedPerson.getId())
                .build();
    }
}
