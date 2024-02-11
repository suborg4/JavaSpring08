package com.example.sem3HomeTask.services;

import com.example.sem3HomeTask.domain.User;
import org.springframework.stereotype.Service;

/**
 * создание пользователей.
 */
@Service
public class UserService {

    /**
     * Создание нового пользователя.
     * @param name имя.
     * @param age возраст.
     * @param email email.
     * @return созданного пользователя.
     */
    public User createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        return user;
    }
}
