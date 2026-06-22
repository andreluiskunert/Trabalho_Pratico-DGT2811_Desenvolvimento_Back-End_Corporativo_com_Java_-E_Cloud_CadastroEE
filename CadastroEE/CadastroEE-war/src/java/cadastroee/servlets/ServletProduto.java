package cadastroee.servlets;

import cadastroee.controler.ProductFacadeLocal; // Importa a Interface que criamos (com um 'l')
import cadastroee.model.Product; // Se sua classe no model se chamar 'Produto', mude aqui
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletProduto extends HttpServlet {

    // A anotação @EJB faz a mágica de conectar o Servlet com o banco através do controle
    @EJB
    private ProductFacadeLocal facade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Lista de Produtos - Teste</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Produtos Cadastrados (Teste de Persistência)</h1>");
            out.println("<ul style='font-size: 18px;'>");
            
            // Busca todos os produtos do banco de dados utilizando o EJB
            List<Product> lista = facade.findAll();
            
            // Varre a lista imprimindo cada produto na tela em formato de lista (HTML)
            for (Product p : lista) {
                // ATENÇÃO: Verifique se na sua classe os métodos são p.getIdProduct() ou p.getIdProduto()
                // E se é p.getNome() ou p.getName(). Ajuste conforme suas variáveis.
                out.println("<li>ID: " + p.getIdProduct() + " | Nome: " + p.getNome() + " | Qtd: " + p.getQuantidade() + "</li>");
            }
            
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}