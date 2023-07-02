package com.amdi.server.service;

import com.amdi.server.model.UserExtra;

import java.util.Optional;

public interface UserExtraService {

    UserExtra validateAndGetUser(String username);

    Optional<UserExtra> getUserExtra(String username);

    UserExtra saveUserExtra(UserExtra userExtra);
}
