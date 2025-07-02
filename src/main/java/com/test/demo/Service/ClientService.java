package com.test.demo.Service;

import com.test.demo.Entity.Client;
import com.test.demo.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // ✅ Créer un client
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    // ✅ Obtenir tous les clients
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // ✅ Obtenir un client par ID
    public Optional<Client> getClientById(int id) {
        return clientRepository.findById(id);
    }

    // ✅ Supprimer un client
    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }

    // ✅ Mettre à jour un client
    public Client updateClient(int id, Client clientDetails) {
        Client client = clientRepository.findById(id).orElseThrow();
        client.setNom(clientDetails.getNom());
        client.setAdresse(clientDetails.getAdresse());
        client.setTelephone(clientDetails.getTelephone());
        return clientRepository.save(client);
    }
}
