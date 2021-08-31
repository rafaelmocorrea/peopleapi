package dio.rafael.apirest.service;

import dio.rafael.apirest.dto.request.PersonDTO;
import dio.rafael.apirest.dto.response.MessageResponseDTO;
import dio.rafael.apirest.entity.Person;
import dio.rafael.apirest.mapper.PersonMapper;
import dio.rafael.apirest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Pessoa criada com ID "+savedPerson.getId())
                .build();
    }
}