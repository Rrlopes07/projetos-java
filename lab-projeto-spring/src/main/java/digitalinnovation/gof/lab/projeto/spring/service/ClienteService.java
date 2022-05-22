package digitalinnovation.gof.lab.projeto.spring.service;

import digitalinnovation.gof.lab.projeto.spring.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> bucarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
