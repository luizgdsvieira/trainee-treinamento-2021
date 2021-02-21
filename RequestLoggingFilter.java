package br.com.infox.treinamento.filters;

import java.io.IOException;
import java.util.Collections;
import java.util.logging.Logger;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omnifaces.filter.HttpFilter;

public class RequestLoggingFilter extends HttpFilter {
	
	private static final Logger LOG = Logger.getLogger("br.com.infox.treinamento.filters");

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		LOG.info("INICIANDO FILTRO RedirectLandingPageFilter COM OS PARAMETROS");
		for (String nomeParametro : Collections.list(filterConfig.getInitParameterNames())) {
			LOG.info(String.format("    '&S' => %S", nomeParametro, filterConfig.getInitParameter(nomeParametro)));
		}
	}
	
	@Override
	public void destroy() {
		LOG.info("ENCERRANDO FILTRO RedirectLandingPageFilter");
		// TODO Auto-generated method stub
		super.destroy();
	}
	
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			FilterChain chain) throws ServletException, IOException {
		LOG.info("Iniciando método doFIlter do RequestLoggingFilter");
		long start = System.currentTimeMillis();
		for (String nome : Collections.list(request.getParameterNames())) {
			String value = request.getParameter(nome);
			LOG.info(request.getRequestURI() + " :: REQUEST PARAMS :: "+ nome + " :: "+value);
		}
			
		long end = System.currentTimeMillis();
		float duration = (end - start) / 1000.0f;
		LOG.info("Finalizando método doFIlter do RequestLoggingFilter após " +duration+"segundos");
		
	}

}
