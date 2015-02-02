package cadastro.usuario;

import java.util.List;

import cadastro.util.DaoFactory;

public class UsuarioRN {
	private UsuarioDAO usuarioDAO;

	public UsuarioRN() {
		this.usuarioDAO = DaoFactory.criarUsuarioDAO();
	}

	public List<Usuario> listar() {
		return this.usuarioDAO.listar();
	}

	public Usuario buscaPorLogin(String login) {
		return this.usuarioDAO.buscarPorLogin(login);
	}

	public void salvar(Usuario usuario) {
		Integer codigo = usuario.getId();
		if (codigo == null || codigo == 0) {
			usuario.getPermissao().add("ROLE_USUARIO");
			this.usuarioDAO.salvar(usuario);
		} else {
			this.usuarioDAO.atualizar(usuario);
		}

	}
}
