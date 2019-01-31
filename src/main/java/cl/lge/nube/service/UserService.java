package cl.lge.nube.service;

import cl.lge.nube.entity.User;
import cl.lge.nube.model.UserDTO;
import cl.lge.nube.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    Mapper mapper;

    public UserDTO addUser(UserDTO userDTO){

        User user = mapper.fromUserDTOToUser(userDTO);
        userRepository.save(user);

        return mapper.fromUserToUserDTO(user);
    }
}
