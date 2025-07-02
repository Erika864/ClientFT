package com.test.demo.Api;

import com.test.demo.Entity.Client;
import com.test.demo.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientApi {

    @Autowired
    private ClientService clientService;

    // ✅ Créer un client
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    // ✅ Obtenir tous les clients
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    // ✅ Obtenir un client par ID
    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }

    // ✅ Supprimer un client
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable int id) {
        clientService.deleteClient(id);
    }

    // ✅ Mettre à jour un client
    @PutMapping("/{id}")
    public Client updateClient(@PathVariable int id, @RequestBody Client clientDetails) {
        return clientService.updateClient(id, clientDetails);
    }
}
