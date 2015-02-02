package cadastro.cliente;

import java.util.List;

import sistematic.baseDAO.HibernateDAO;

public class ClienteHibernateDAO extends HibernateDAO<Cliente> implements ClienteDAO{

	@Override
	public void atualizar(Cliente object) {
		// TODO Auto-generated method stub
		super.atualizar(object);
	}
	
	
	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return session.createCriteria(Cliente.class).list();
	}
	
}
