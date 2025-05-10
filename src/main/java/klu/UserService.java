package klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;  // Assuming you're using JPA

    public boolean validateUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);  // Compare plain text passwords
    }

    public User saveUser(User user) {
        return userRepository.save(user);  // Save the user with the plain text password
    }
}
