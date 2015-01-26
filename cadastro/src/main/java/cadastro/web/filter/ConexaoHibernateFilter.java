package cadastro.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.spi.ThrowableInformation;
import org.hibernate.SessionFactory;

import cadastro.util.HibernateUtil;

public class ConexaoHibernateFilter implements Filter {

	private SessionFactory sf;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.sf = HibernateUtil.getSessionFactory();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub

		try {
			this.sf.getCurrentSession().beginTransaction();
			chain.doFilter(request, response);
			this.sf.getCurrentSession().getTransaction();
			this.sf.getCurrentSession().close();
		} catch (Throwable ex) {
			try {
				if (this.sf.getCurrentSession().getTransaction().isActive()) {
					this.sf.getCurrentSession().getTransaction().rollback();
				}
			} catch (Throwable t) {
				t.printStackTrace();
			}
			throw new ServletException(ex);
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
