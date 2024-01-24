package ru.skypro.homework.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.NewPasswordDTO;
import ru.skypro.homework.dto.UpdateUserDTO;
import ru.skypro.homework.maper.UserMapper;
import ru.skypro.homework.model.User;
import ru.skypro.homework.repository.UserRepository;
import ru.skypro.homework.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UpdateUserDTO updateUser(UpdateUserDTO updateUserDTO) {
        User user = userRepository.findByPhone(updateUserDTO.getPhone()).get();
        User userUpdate = userMapper.updateUserDTOToUser(updateUserDTO);
        user.setFirstName(userUpdate.getFirstName());
        user.setLastName(userUpdate.getLastName());
        user.setPhone(userUpdate.getPhone());
        userRepository.save(user);
        return userMapper.userToupdateUserDTO(user);
    }

    @Override
    public NewPasswordDTO updatePassword(NewPasswordDTO newPasswordDTO, String name) {
        User user = userRepository.findByUserName(name).orElseThrow();
        User updatePassword = userMapper.newPasswordDTOToUser(newPasswordDTO);
        user.setPassword(updatePassword.getPassword());
        userRepository.save(user);
        return userMapper.userTonewPasswordDTO(user);

    }

    @Override
    public User getUserMe(String name) {
        return userRepository.findByUserName(name).orElseThrow();
    }
}
