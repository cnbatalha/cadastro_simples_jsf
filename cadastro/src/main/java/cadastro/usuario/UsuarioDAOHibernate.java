package cadastro.usuario;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

public class UsuarioDAOHibernate implements UsuarioDAO {

	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Usuario usuario) {
		// TODO Auto-generated method stub

		try {
			this.session.save(usuario);
			this.session.getTransaction().commit();

		} catch (ConstraintViolationException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void atualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		if (usuario.getPermissao() == null
				|| usuario.getPermissao().size() == 0) {
			Usuario usuarioPermissao = this.carregar(usuario.getId());
			usuario.setPermissao(usuarioPermissao.getPermissao());
			this.session.evict(usuarioPermissao);
		}
		this.session.update(usuario);
	}

	@Override
	public void excluir(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario carregar(Integer id) {
		// TODO Auto-generated method stub		
		return (Usuario) this.session.get( Usuario.class, id);
	}

	@Override
	public Usuario buscarPorLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return this.session.createCriteria(Usuario.class).list();
	}

}
