package datastorage.controller;

import datastorage.model.ServerUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.Optional;

public class ServerUsersService {
    @Autowired
    private ServerUsersRepository userRepository;

    public ServerUsers findPersoonById(Long id) {
        Optional<ServerUsers> userOptional = userRepository.findById(id);
        if (!userOptional.isPresent()) {
            throw new ResourceNotFoundException("Persoon met id " + id + " niet gevonden");
        }
        ServerUsers persoon = userOptional.get();
        return persoon;
    }
}
