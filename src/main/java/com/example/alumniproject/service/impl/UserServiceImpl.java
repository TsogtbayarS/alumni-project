package com.example.alumniproject.service.impl;

import com.example.alumniproject.entity.User;
import com.example.alumniproject.repository.UserRepo;
import com.example.alumniproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo repository;

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Optional<User> findByFirstName(String username){
        return repository.findByFirstName(username);
    }

    @Override
    public boolean isUserLockedOut(User user){
        LocalDateTime  lastFailedLogin = user.getLastFailedLoginTimestamp();
        if(lastFailedLogin != null)
        {
            LocalDateTime currentTime = LocalDateTime.now();
            long minDifference = Duration.between(lastFailedLogin, currentTime).toMinutes();

            if(minDifference < 15 && (user.getAccountLocked() != null &&  user.getAccountLocked())){
                return true;
            }
            else {
                user.setAccountLocked(false);
                user.setLastFailedLoginTimestamp(null);
                repository.save(user);
                return false;
            }
        }
        return false;
    }
    @Override
    public void lockUserAccount(User user){
        user.setAccountLocked(true);
        user.setLastFailedLoginTimestamp(LocalDateTime.now());
        repository.save(user);
    }
}
