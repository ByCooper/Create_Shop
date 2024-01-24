package ru.skypro.homework.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.skypro.homework.config.UserDetailsServiceImpl;
import ru.skypro.homework.dto.RegisterDTO;
import ru.skypro.homework.maper.UserMapper;
import ru.skypro.homework.model.User;
import ru.skypro.homework.repository.UserRepository;
import ru.skypro.homework.service.AuthService;
@Slf4j
@Service
public class AuthServiceImpl implements AuthService {

    private final UserDetailsServiceImpl manager;
    private final PasswordEncoder encoder;
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public AuthServiceImpl(UserDetailsServiceImpl manager,
                           PasswordEncoder passwordEncoder, UserRepository userRepository, UserMapper userMapper) {
        this.manager = manager;
        this.encoder = passwordEncoder;
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public boolean login(String userName, String password) {
        if (!userRepository.existsByUserName(userName)) {
            return false;
        }
        UserDetails userDetails = manager.loadUserByUsername(userName);
        return encoder.matches(password, userDetails.getPassword());
    }

    @Override
    public boolean register(RegisterDTO registerDTO) {
        log.info("Запрос на регистрацию пользователя{}", registerDTO);
        if (userRepository.existsByUserName(registerDTO.getUsername())) {
            log.info("Пользователь уже существует");
            return false;
        }

        User user = User.builder()
                .userName(registerDTO.getUsername())
                .firstName(registerDTO.getFirstName())
                .lastName(registerDTO.getLastName())
                .password(registerDTO.getPassword())
                .email(registerDTO.getUsername())
                .build();
        userRepository.save(user);
        log.info("Пользователь создан и сохранен в БД");
        return true;
    }

}
