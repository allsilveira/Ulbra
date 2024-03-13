package com.ulbra.ap2.services;

import com.ulbra.ap2.entities.Client;
import com.ulbra.ap2.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;

@Service
public class ClientService {
    private ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public void create(Client client) {
        client.setId(UUID.randomUUID());
        this.repository.save(client);
    }

    public Iterable<Client> list() {
        return this.repository.findAll();
    }

    public Optional<Client> listById(UUID id) {
        return this.repository.findById(id);
    }


    public ArrayList<Client> listByAge(Integer age) {
        ArrayList<Client> searchedClients = new ArrayList<>();
        Iterable<Client> clients = this.repository.findAll();
        for(Client client : clients) {
            if (client.getIdade() == age) {
                searchedClients.add(client);
            }
        }

        return searchedClients;
    }


    public String update(String id, Client updatedClient) {
        UUID uuid = UUID.fromString(id);
        Optional<Client> existingClientOptional = this.repository.findById(uuid);

        if (existingClientOptional.isPresent()) {
            // updatedClient.setId(uuid);
            String updatedName = updatedClient.getNome() == null ? existingClientOptional.get().getNome() : updatedClient.getNome();
            int updatedAge = updatedClient.getIdade() == 0 ? existingClientOptional.get().getIdade() : updatedClient.getIdade();
            String updatedProfession = updatedClient.getProfissao() == null ? existingClientOptional.get().getProfissao() : updatedClient.getProfissao();

            this.repository.save(new Client(uuid, updatedName, updatedAge, updatedProfession));
            return "Cliente atualizado com sucesso.";
        }

        return "Cliente " + id + " não encontrado.";
    }

    public void delete(String id) {
        UUID uuid = UUID.fromString(id);
        List<UUID> listUuid = Collections.singletonList(uuid);
        this.repository.deleteAllById(listUuid);
    }
}