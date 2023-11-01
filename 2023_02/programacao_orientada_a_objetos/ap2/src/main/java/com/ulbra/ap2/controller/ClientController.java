package com.ulbra.ap2.controller;

import com.ulbra.ap2.model.ClientModel;
import com.ulbra.ap2.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

@RestController
@RequestMapping ("client")
public class ClientController {
    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("create")
    public void create(@RequestBody ClientModel client) {
        UUID id = UUID.randomUUID();
        this.clientService.create(new ClientModel(id, client.name(), client.age(), client.profession()));
    }

    @GetMapping("list")
    public ArrayList<ClientModel> list() {
        return this.clientService.list();
    }

    @GetMapping("list/{id}")
    public ClientModel listById(@PathVariable String id) {
        return this.clientService.listById(id);
    }

    @GetMapping("list/filter")
    public ArrayList<ClientModel> listByAge(@RequestParam Integer age) {
        return this.clientService.listByAge(age);
    }

    @PutMapping("update/{id}")
    public void update(@PathVariable String id, @RequestBody ClientModel client) {
        this.clientService.update(id, client);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable String id) {
        this.clientService.delete(id);
    }
}
