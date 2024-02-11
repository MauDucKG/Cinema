package cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cinema.model.User;
import cinema.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public void deleteById(int userId) {
        userRepository.deleteById(userId);
    }
}
