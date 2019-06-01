package ma.projet.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.projet.entity.Client;
import ma.projet.repository.ClientRepository;
import ma.projet.service.ClientService;

@RestController
@RequestMapping("/api/client")
@CrossOrigin("*")

public class ClientController {
	@Autowired
	private ClientService clientService;
	@Autowired
	ClientRepository cr;

	@PostMapping("/add")
	public Client addClient(@RequestBody Client c) {
		return clientService.create(c);
	}

	@PutMapping("/update")
	public void updateClient(@RequestBody Client client) {
		clientService.update(client);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteClient(@PathVariable Long id) {
		clientService.delete(clientService.findById(id));
	}

	@GetMapping
	public List<Client> getClients() {
		return clientService.findAll();

	}

	@GetMapping("/{id}")
	public Client getClientById(@PathVariable Long id) {
		return clientService.findById(id);
	}
}
