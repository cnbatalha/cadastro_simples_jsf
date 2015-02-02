package cadastro.cliente;

import java.util.List;

import cadastro.util.DaoFactory;

public class ClienteRN {

	private ClienteDAO clienteDAO;

	public ClienteRN() {
		clienteDAO = DaoFactory.criarClienteDAO();
	}

	public void Salvar(Cliente cliente) {
		clienteDAO.salvar(cliente);
	}
	
	public List<Cliente> listar()
	{
		return clienteDAO.listar();
	}

}
