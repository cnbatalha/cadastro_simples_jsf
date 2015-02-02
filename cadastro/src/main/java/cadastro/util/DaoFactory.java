package cadastro.util;

import cadastro.cliente.ClienteDAO;
import cadastro.cliente.ClienteHibernateDAO;
import cadastro.usuario.UsuarioDAO;
import cadastro.usuario.UsuarioDAOHibernate;

public class DaoFactory {

	public static UsuarioDAO criarUsuarioDAO()
	{
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession( HibernateUtil.getSessionFactory().getCurrentSession());
		
		return usuarioDAO;
	}
	
	public static ClienteDAO criarClienteDAO()
	{
		ClienteHibernateDAO clienteDAO = new ClienteHibernateDAO();
		clienteDAO.setSession( HibernateUtil.getSessionFactory().getCurrentSession());
		
		return clienteDAO;
	}
	
}
