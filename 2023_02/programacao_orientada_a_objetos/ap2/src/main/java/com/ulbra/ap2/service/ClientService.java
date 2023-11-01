package com.ulbra.ap2.service;

import com.ulbra.ap2.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ClientService {
    private ArrayList<ClientModel> clients = new ArrayList<>();

    public void create(ClientModel client) {
        this.clients.add(client);
    }

    public ArrayList<ClientModel> list() {
        return this.clients;
    }

    public ClientModel listById(String id) {
        UUID uuid = UUID.fromString(id);

        for(ClientModel client : this.clients) {
            if (client.id().equals(uuid)) {
                return client;
            }
        }

        return null;
    }

    public ArrayList<ClientModel> listByAge(Integer age) {
        ArrayList<ClientModel> searchedClients = new ArrayList<>();
        for(ClientModel client : this.clients) {
            if (client.age() == age) {
                searchedClients.add(client);
            }
        }

        return searchedClients;
    }

    public void update(String id, ClientModel updatedClient) {
        UUID uuid = UUID.fromString(id);

        for (int i = 0; i < this.clients.size(); i++) {
            ClientModel client = this.clients.get(i);
            if (client.id().equals(uuid)) {
                UUID updatedId = client.id();

                String updatedNome = updatedClient.name() != null ? updatedClient.name() : client.name();
                int updatedIdade = updatedClient.age() != 0 ? updatedClient.age() : client.age();
                String updatedProfissao = updatedClient.profession() != null ? updatedClient.profession() : client.profession();
                ClientModel updatedClientWithId = new ClientModel(updatedId, updatedNome, updatedIdade, updatedProfissao);

                this.clients.set(i, updatedClientWithId);

                return;
            }
        }
    }

    public void delete(String id) {
        ClientModel client = this.listById(id);

        if (client == null) {
            return;
        }
        this.clients.remove(client);
    }
}