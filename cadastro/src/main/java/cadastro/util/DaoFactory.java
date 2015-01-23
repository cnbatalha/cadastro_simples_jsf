package cadastro.util;

import cadastro.usuario.UsuarioDAO;
import cadastro.usuario.UsuarioDAOHibernate;

public class DaoFactory {

	public static UsuarioDAO criarUsuarioDAO()
	{
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession( HibernateUtil.getSessionFactory().getCurrentSession());
		
		return usuarioDAO;
	}
	
}
