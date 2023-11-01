package com.tdeauladoze.app.external.api;

import com.tdeauladoze.app.rules.user.model.User;
import com.tdeauladoze.app.rules.user.service.Find;
import com.tdeauladoze.app.rules.user.service.IUserRepository;
import com.tdeauladoze.app.rules.user.service.Save;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("user")
public class UserController {
    private final IUserRepository repository;
    private final Find find;
    private final Save save;

    @Autowired
    public UserController(IUserRepository UserMemoryRepository) {
        this.repository = UserMemoryRepository;
        this.save = new Save(this.repository);
        this.find = new Find(this.repository);
    }

    @GetMapping("/read")
    public ArrayList<User> read(@RequestParam @Nullable String id) {
        if (id != null) {
            return this.find.execute(id);
        }
        return this.find.execute();
    }

    @PostMapping("/create")
    public void create(@RequestBody User user) {
        this.save.execute(user);
    }

}
