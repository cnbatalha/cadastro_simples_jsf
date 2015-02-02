package sistematic.baseDAO;

import java.util.List;

public interface InterfaceDAO<T> {

	public void salvar(T object);

	public void atualizar(T object);

	public void excluir(T object);

	public T carregar(Integer id);

	public List<T> listar();

}
