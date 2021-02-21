package br.com.infox.treinamento.filters;

import java.io.IOException;
import java.util.Collections;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omnifaces.filter.HttpFilter;


@WebFilter(filterName = "Redirect Filter", 
	urlPatterns = "/",
	initParams = @WebInitParam(name = "landingPage", value = "index.jsf")
) 
public class RedirectLandingPageFilter extends HttpFilter {
	
	private static final Logger LOG = Logger.getLogger("br.com.infox.treinamento.filters");
	
	private String initParameter;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		LOG.info("INICIANDO FILTRO RedirectLandingPageFilter COM OS PARAMETROS");
		for (String nomeParametro : Collections.list(filterConfig.getInitParameterNames())) {
			LOG.info(String.format("    '&S' => %S", nomeParametro, filterConfig.getInitParameter(nomeParametro)));
		};
		
		this.initParameter = filterConfig.getInitParameter("landingPage");
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		LOG.info("Iniciando método doFIlter do RedirectLandingPageFilter");
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.sendRedirect(initParameter);
		// TODO Auto-generated method stub
		LOG.info("Finalizando método doFIlter do RedirectLandingPageFilter");
	}

	@Override
	public void destroy() {
		LOG.info("ENCERRANDO FILTRO RedirectLandingPageFilter");
		// TODO Auto-generated method stub
		super.destroy();
	}
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, 
				HttpSession session, FilterChain chain) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
