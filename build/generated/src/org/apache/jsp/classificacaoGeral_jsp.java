package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dao.TimeDao;
import java.util.LinkedList;
import model.dao.JogoDao;
import java.util.List;
import java.util.ArrayList;
import model.entidades.Jogo;
import model.entidades.Time;
import java.sql.*;
import java.util.*;

public final class classificacaoGeral_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_import_url_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--EMPORT PARA O MENU-->\r\n");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<div class=\"row justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("    <div align=\"center\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"text-center text-white\">\r\n");
      out.write("            <div class=\"display-4\" >-</div><hr class=\"border-white\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-2 float-right\">\r\n");
      out.write("            <table class=\"table text-primary text-center table-hover\">\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\"thead-light\">\r\n");
      out.write("                        <th scope=\"col\">|</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-primary\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-primary\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-primary\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-primary\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-info \">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-info \">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-success\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-success\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-success\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-success\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-success\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-success\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-secondary \">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-secondary  \">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-secondary  \">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-secondary  \">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-danger\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-danger\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead> \r\n");
      out.write("                    <tr class=\" badge-danger\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\" badge-danger\">\r\n");
      out.write("                        <th scope=\"col\">º</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--CLASSIFICAÇÃO GERAL--> \r\n");
      out.write("    <div class=\"col-sm-10\">\r\n");
      out.write("        <div class=\"text-center\">\r\n");
      out.write("            <div class=\"display-4\"><i class=\"fa fa-futbol-o text-primary\" aria-hidden=\"true\"> <strong>Classificação Geral</strong></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--TABELA COM A LISTA--> \r\n");
      out.write("        <div class=\"\">\r\n");
      out.write("            <table class=\"table text-primary text-center table-hover\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr class=\"thead-light badge-info\">\r\n");
      out.write("                        <th scope=\"col\">Ranking</th>\r\n");
      out.write("                        <th scope=\"col\">Descricão</th>\r\n");
      out.write("                        <th scope=\"col\">Pts</th>\r\n");
      out.write("                        <th scope=\"col\">Jogos</th>\r\n");
      out.write("                        <th scope=\"col\">Vitórias</th>                 \r\n");
      out.write("                        <th scope=\"col\">Empates</th>\r\n");
      out.write("                        <th scope=\"col\">Derrotas</th>                            \r\n");
      out.write("                        <th scope=\"col\">GP</th>\r\n");
      out.write("                        <th scope=\"col\">GC</th>\r\n");
      out.write("                        <th scope=\"col\">SG</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <table class=\"table text-primary text-center table-hover\">\r\n");
      out.write("            <tr class=\"thead-light badge-info\">\r\n");
      out.write("                <td colspan=\"8\" class=\"badge-light\"><strong>LEGENDA</strong></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"thead-light badge-info\">\r\n");
      out.write("                <td scope=\"row\" class=\"badge-primary\">º</td>\r\n");
      out.write("                <td scope=\"row\" class=\"badge-primary\">Libertadores da América</td>\r\n");
      out.write("\r\n");
      out.write("                <td scope=\"row\" class=\"badge-info\">º</td>\r\n");
      out.write("                <td scope=\"row\" class=\"badge-info\">Pré-Libertadores</td>\r\n");
      out.write("\r\n");
      out.write("                <td scope=\"row\" class=\"badge-success\">º</td>\r\n");
      out.write("                <td scope=\"row\" class=\"badge-success\">Sul-Americana</td>\r\n");
      out.write("\r\n");
      out.write("                <td scope=\"row\" class=\"badge-danger\">º</td>\r\n");
      out.write("                <td scope=\"row\" class=\"badge-danger\">2ª Divisão</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"thead-light badge-info\" >\r\n");
      out.write("                <td colspan=\"4\" class=\"badge-light\">\r\n");
      out.write("                    <form action=\"IndexControlador\" method=\"GET\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-danger\">Apenas Iniciar Nova Simulação</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td  colspan=\"4\" class=\"badge-light\">\r\n");
      out.write("                    <form class=\"float-left\" action=\"IndexControlador\" method=\"POST\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-danger\">Limpar e Iniciar Nova Simulação</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>    \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--CLASSIFICAÇÃO GERAL--> \r\n");
      out.write("\r\n");
      out.write("</div>    \r\n");
      out.write("\r\n");
      out.write("<!-- Optional JavaScript -->\r\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("<script src=\"bootstrap/node_modules/jquery/dist/jquery.js\"></script>\r\n");
      out.write("<script src=\"bootstrap/node_modules/popper.js/dist/umd/popper.js\"></script>\r\n");
      out.write("<script src=\"bootstrap/node_modules/bootstrap/dist/js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("menu.jsp");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("lista");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaTimes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("index");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <tbody>\r\n");
          out.write("                    <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("º</td>               \r\n");
          out.write("                    <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>                    \r\n");
          out.write("                    <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.pontos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.jogos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.vitorias}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.empates}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.derrotas}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.golpro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.golcontra}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \r\n");
          out.write("                    <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.saldodegols}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \r\n");
          out.write("                    </tbody>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
