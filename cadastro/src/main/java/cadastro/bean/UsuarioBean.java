package cadastro.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean( name = "usuarioBean")
@SessionScoped
public class UsuarioBean {

	private String name;
	private String email;
	private String pass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
		
	public String novo()
	{
		return "usuario";
	}
	
	
	public String salvar()
	{
		return "sucesso";
	}
}
