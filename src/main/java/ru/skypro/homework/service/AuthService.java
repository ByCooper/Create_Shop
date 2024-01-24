package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.RegisterDTO;
@Service
public interface AuthService {
    boolean login(String userName, String password);

    boolean register(RegisterDTO registerDTO);
}
