package cadastro.usuario;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "usuarioBean")
@SessionScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	private List<Usuario> lista;

	public String novo() {
		this.usuario = new Usuario();
		return "usuario";
	}

	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();

		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(usuario);

		this.lista = usuarioRN.listar();
		
		return "usuarioSucesso";
	}

	public String gerenciar() {
		return "gerenciarUsuario";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getLista() {
		if (this.lista == null) {
			UsuarioRN usuarioRN = new UsuarioRN();
			this.lista = usuarioRN.listar();
		}
		return lista;
	}

}
