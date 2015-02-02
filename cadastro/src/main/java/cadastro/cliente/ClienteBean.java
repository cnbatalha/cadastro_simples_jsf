package cadastro.cliente;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "clienteBean")
@SessionScoped
public class ClienteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	private List<Cliente> lista;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getLista() {
		if (lista == null) {
			ClienteRN clienteRN = new ClienteRN();
			lista = clienteRN.listar();

		}

		return lista;
	}

	public String novo() {
		this.cliente = new Cliente();
		return "/restrito/cliente";
	}
	
	public String salvar()
	{
		ClienteRN clienteRN = new ClienteRN();
		
		clienteRN.Salvar(this.cliente);
		
		return "clienteSucesso";
	}

}
