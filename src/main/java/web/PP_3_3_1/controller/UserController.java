package web.PP_3_3_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.PP_3_3_1.model.User;
import web.PP_3_3_1.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.getAll());
        return "users";
    }

    @PostMapping("/add")
    public String addUser(@RequestParam String firstName,
                          @RequestParam String lastName,
                          @RequestParam int age){
        User user = new User(firstName, lastName, age);
        userService.add(user);
        return "redirect:/users";
    }

    @PostMapping("/update")
    public String updateUser(@RequestParam Long id,
                             @RequestParam String firstName,
                             @RequestParam String lastName,
                             @RequestParam int age){
        User user = new User(firstName, lastName, age);
        user.setId(id);
        userService.update(user);
        return "redirect:/users";
    }

    @GetMapping("/edit")
    public String editUser(@RequestParam Long id, Model model){
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "editUser";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam Long id){
        userService.delete(id);
        return "redirect:/users";
    }
}
