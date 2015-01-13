package cadastro.usuario;

import java.util.List;

import cadastro.util.DaoFactory;

public class UsuarioRN {
	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN()
	{
		this.usuarioDAO = DaoFactory.criarUsuarioDAO();
	}
	
	public List<Usuario> listar()
	{
		return this.usuarioDAO.listar();
	}

	public String salvar(Usuario usuario)
	{
		usuarioDAO.salvar(usuario);
		
		return "usuarioSucesso";
	}
}
