package br.com.fiap.api_rest.controller;

import br.com.fiap.api_rest.dto.ClienteRequest;
import br.com.fiap.api_rest.dto.ClienteResponse;
import br.com.fiap.api_rest.model.Cliente;
import br.com.fiap.api_rest.repository.ClienteRepository;
import br.com.fiap.api_rest.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    ClienteService clienteService;

    // Create, Read, Update, Delete - CRUD
    // Post, Get, Put, Delete - Verbos HTTP correspondentes

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@Valid @RequestBody ClienteRequest cliente) {
        Cliente clienteSalvo = clienteRepository.save(clienteService.requestToCliente(cliente));
        return new ResponseEntity<>(clienteSalvo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponse>> readClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        return new ResponseEntity<>(clienteService.clientesToResponse(clientes), HttpStatus.OK);
    }

    // PathVariable = parâmetro diretamente na URL, ex: /clientes/1
    // RequestParam = parâmetro como query, ex: /clientes/?id=1
    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> readCliente(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(clienteService.clienteToResponse(cliente.get()), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id,
                                                 @RequestBody Cliente cliente) {
        Optional<Cliente> clienteExistente = clienteRepository.findById(id);
        if (clienteExistente.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        cliente.setId(clienteExistente.get().getId());
        Cliente clienteAtualizado = clienteRepository.save(cliente);
        return new ResponseEntity<>(clienteAtualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        clienteRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
