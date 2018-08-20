package io.swagger;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
	private static final long serialVersionUID = 1L;

@Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("Swagger UI by Dee")
      .description("Just testing by Dee");

    Swagger swagger = new Swagger().info(info);
    swagger.securityDefinition("api_key", new ApiKeyAuthDefinition("api_key", In.HEADER));
    swagger.securityDefinition("petstore_auth", 
      new OAuth2Definition()
        .implicit("http://petstore.swagger.io/api/oauth/dialog")
        .scope("read:pets", "read your pets")
        .scope("write:pets", "modify pets in your account"));
    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
