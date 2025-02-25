package web.PP_3_3_1.service;

import web.PP_3_3_1.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAll();
    User getById(Long id);
    void update(User user);
    void delete(Long id);
}
