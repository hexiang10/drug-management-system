/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-04-19 03:48:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pagecomponent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accessRecordManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    // 查询参数\n");
      out.write("    search_access_type = 'all'\n");
      out.write("    search_user_id = null\n");
      out.write("    search_start_date = null\n");
      out.write("    search_end_date = null\n");
      out.write("\n");
      out.write("    $(function(){\n");
      out.write("        datePickerInit();\n");
      out.write("        accessRecordTableInit();\n");
      out.write("        searchActionInit();\n");
      out.write("    })\n");
      out.write("\n");
      out.write("    // 日期选择器初始化\n");
      out.write("\tfunction datePickerInit(){\n");
      out.write("\t\t$('.form_date').datetimepicker({\n");
      out.write("\t\t\tformat:'yyyy-mm-dd',\n");
      out.write("\t\t\tlanguage : 'zh-CN',\n");
      out.write("\t\t\tendDate : new Date(),\n");
      out.write("\t\t\tweekStart : 1,\n");
      out.write("\t\t\ttodayBtn : 1,\n");
      out.write("\t\t\tautoClose : 1,\n");
      out.write("\t\t\ttodayHighlight : 1,\n");
      out.write("\t\t\tstartView : 2,\n");
      out.write("\t\t\tforceParse : 0,\n");
      out.write("\t\t\tminView:2\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t// 表格初始化\n");
      out.write("\tfunction accessRecordTableInit(){\n");
      out.write("\t    $('#accessRecordDOS').bootstrapTable({\n");
      out.write("\t        columns:[{\n");
      out.write("\t            field : 'id',\n");
      out.write("\t            title : '记录ID'\n");
      out.write("\t        },{\n");
      out.write("\t            field : 'userID',\n");
      out.write("\t            title : '用户ID'\n");
      out.write("\t        },{\n");
      out.write("\t            field : 'userName',\n");
      out.write("\t            title : '用户名'\n");
      out.write("\t        },{\n");
      out.write("\t            field : 'accessTime',\n");
      out.write("\t            title : '时间'\n");
      out.write("\t        },{\n");
      out.write("\t            field : 'accessIP',\n");
      out.write("\t            title : 'IP'\n");
      out.write("\t        },{\n");
      out.write("\t            field : 'accessType',\n");
      out.write("\t            title : '类型'\n");
      out.write("\t        }],\n");
      out.write("\t        url : 'systemLog/getAccessRecords',\n");
      out.write("            onLoadError:function(status){\n");
      out.write("                handleAjaxError(status);\n");
      out.write("            },\n");
      out.write("\t        method : 'GET',\n");
      out.write("\t        queryParams : queryParams,\n");
      out.write("            sidePagination : \"server\",\n");
      out.write("            dataType : 'json',\n");
      out.write("            pagination : true,\n");
      out.write("            pageNumber : 1,\n");
      out.write("            pageSize : 5,\n");
      out.write("            pageList : [ 5, 10, 25, 50, 100 ],\n");
      out.write("            clickToSelect : true\n");
      out.write("\t    });\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t// 表格刷新\n");
      out.write("\tfunction tableRefresh() {\n");
      out.write("\t\t$('#accessRecordDOS').bootstrapTable('refresh', {\n");
      out.write("\t\t\tquery : {}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t// 分页查询参数\n");
      out.write("\tfunction queryParams(params) {\n");
      out.write("\t\tvar temp = {\n");
      out.write("\t\t\tlimit : params.limit,\n");
      out.write("\t\t\toffset : params.offset,\n");
      out.write("\t\t\tuserID : search_user_id,\n");
      out.write("\t\t\taccessType : search_access_type,\n");
      out.write("\t\t\tstartDate : search_start_date,\n");
      out.write("\t\t\tendDate : search_end_date\n");
      out.write("\t\t}\n");
      out.write("\t\treturn temp;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("    // 查询操作\n");
      out.write("    function searchActionInit(){\n");
      out.write("        $('#search_button').click(function(){\n");
      out.write("            search_user_id = $('#user_id').val();\n");
      out.write("            search_access_type = $('#access_type').val();\n");
      out.write("            search_start_date = $('#start_date').val();\n");
      out.write("            search_end_date = $('#end_date').val();\n");
      out.write("            tableRefresh();\n");
      out.write("        })\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div class=\"panel panel-default\">\n");
      out.write("    <ol class=\"breadcrumb\">\n");
      out.write("        <li>系统登陆日志</li>\n");
      out.write("    </ol>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <form action=\"\" class=\"form-inline\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"form-label\">用户ID：</label>\n");
      out.write("                        <input type=\"text\" id=\"user_id\" class=\"form-control\" placeholder=\"指定用户ID\" style=\"width:50%\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <form action=\"\" class=\"form-inline\">\n");
      out.write("                    <label class=\"form-label\">记录过滤：</label>\n");
      out.write("                    <select name=\"\" id=\"access_type\" class=\"form-control\">\n");
      out.write("                        <option value=\"all\">显示所有</option>\n");
      out.write("                        <option value=\"loginOnly\">仅显示登入记录</option>\n");
      out.write("                        <option value=\"logoutOnly\">仅显示登出记录</option>\n");
      out.write("                    </select>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-2\">\n");
      out.write("                <button class=\"btn btn-success\" id=\"search_button\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-search\"></span> <span>查询</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"margin-top:20px\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <form action=\"\" class=\"form-inline\">\n");
      out.write("                    <label class=\"form-label\">日期范围：</label>\n");
      out.write("                    <input class=\"form_date form-control\" id=\"start_date\" placeholder=\"起始日期\">\n");
      out.write("                    <label class=\"form-label\">&nbsp;&nbsp;-&nbsp;&nbsp;</label>\n");
      out.write("                    <input class=\"form_date form-control\" id=\"end_date\" placeholder=\"结束日期\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"margin-top:25px\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <table class=\"table table-striped\" id=\"accessRecordDOS\"></table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
