package principal.jsf.principal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloBean")
@SessionScoped
public class HelloBean  {

	private static final long serialVersionUID = 1;

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloBean()
	{
		
	}
}
