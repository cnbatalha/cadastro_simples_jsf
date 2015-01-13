package cadastro.usuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean( name = "usuarioBean")
@SessionScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	
	public String novo()
	{
		this.usuario = new Usuario();
		return "usuario";
	}
		
	public String salvar()
	{
		FacesContext context = FacesContext.getCurrentInstance();
		
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(usuario);
		
		return "usuarioSucesso";
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
