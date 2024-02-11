package com.example.sem3HomeTask.services;

import com.example.sem3HomeTask.aspect.TrackUserAction;
import com.example.sem3HomeTask.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * регистрация новых пользователей.
 */
@Service
@AllArgsConstructor
public class RegistrationService {

    /**
     * Поле работы с хранилищем .
     */
    private final DataProcessingService dataProcessingService;

    /**
     * Поле создания пользователей.
     */
    private final UserService userService;

    /**
     * Получение работы с хранилищем.
     * @return
     */
    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    /**
     * Сохранение в БД.
     * @param name имя.
     * @param age возраст.
     * @param email email.
     */
    @TrackUserAction
    public void processRegistration(String name, int age, String email){
        User createUser = userService.createUser(name, age, email);
        dataProcessingService.addUser(createUser);
    }
}
