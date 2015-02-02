package sistematic.baseDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

public class HibernateDAO<T> implements InterfaceDAO<T> {

	protected Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(T object) {
		// TODO Auto-generated method stub
		try {
			this.session.save(object);
			this.session.getTransaction().commit();

		} catch (ConstraintViolationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void atualizar(T object) {
		// TODO Auto-generated method stub
		this.session.update(object);
	}

	@Override
	public void excluir(T object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T carregar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> listar() {
		// TODO Auto-generated method stub
		return null ; ///session.createCriteria( this.getClass() ).list();
	}

}
