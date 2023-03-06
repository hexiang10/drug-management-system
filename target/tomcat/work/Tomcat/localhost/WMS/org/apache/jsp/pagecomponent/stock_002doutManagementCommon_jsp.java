/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-05-10 04:19:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pagecomponent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stock_002doutManagementCommon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\n");
      out.write("\tvar stockout_customer = null;\n");
      out.write("\tvar stockout_goods = null;\n");
      out.write("\tvar stockout_number = null;\n");
      out.write("\n");
      out.write("\tvar customerCache = new Array();\n");
      out.write("\tvar goodsCache = new Array();\n");
      out.write("\n");
      out.write("\t$(function(){\n");
      out.write("\t\tdataValidateInit();\n");
      out.write("\t\t// repositorySelectorInit();\n");
      out.write("\t\tdetilInfoToggle();\n");
      out.write("\t\tstockoutOperation();\n");
      out.write("\n");
      out.write("\t\tfetchStorage();\n");
      out.write("\t\tgoodsAutocomplete();\n");
      out.write("\t\tcustomerAutocomplete();\n");
      out.write("\t})\n");
      out.write("\n");
      out.write("\tfunction dataValidateInit(){\n");
      out.write("\t\t$('#stockout_form').bootstrapValidator({\n");
      out.write("\t\t\tmessage : 'This is not valid',\n");
      out.write("\n");
      out.write("\t\t\tfields : {\n");
      out.write("\t\t\t\tstockout_input : {\n");
      out.write("\t\t\t\t\tvalidators : {\n");
      out.write("\t\t\t\t\t\tnotEmpty : {\n");
      out.write("\t\t\t\t\t\t\tmessage : '入库数量不能为空'\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tgreaterThan: {\n");
      out.write("\t                        value: 0,\n");
      out.write("\t                        message: '入库数量不能小于0'\n");
      out.write("\t                    }\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//货物信息自动匹配\n");
      out.write("\tfunction goodsAutocomplete(){\n");
      out.write("\t\t$('#goods_input').autocomplete({\n");
      out.write("\t\t\tminLength : 0,\n");
      out.write("\t\t\tdelay : 500,\n");
      out.write("\t\t\tsource : function(request, response){\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype : 'GET',\n");
      out.write("\t\t\t\t\turl : 'goodsManage/getGoodsList',\n");
      out.write("\t\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\t\tcontentType : 'application/json',\n");
      out.write("\t\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\toffset : -1,\n");
      out.write("\t\t\t\t\t\tlimit : -1,\n");
      out.write("\t\t\t\t\t\tkeyWord : request.term,\n");
      out.write("\t\t\t\t\t\tsearchType : 'searchByName'\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\t\tvar autoCompleteInfo = new Array();\n");
      out.write("\t\t\t\t\t\t$.each(data.rows, function(index,elem){\n");
      out.write("\t\t\t\t\t\t\tgoodsCache.push(elem);\n");
      out.write("\t\t\t\t\t\t\tautoCompleteInfo.push({label:elem.name,value:elem.id});\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\tresponse(autoCompleteInfo);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tfocus : function(event, ui){\n");
      out.write("\t\t\t\t$('#goods_input').val(ui.item.label);\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tselect : function(event, ui){\n");
      out.write("\t\t\t\t$('#goods_input').val(ui.item.label);\n");
      out.write("\t\t\t\tstockout_goods = ui.item.value;\n");
      out.write("\t\t\t\tgoodsInfoSet(stockout_goods);\n");
      out.write("\t\t\t\t// loadStorageInfo();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t})\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction customerAutocomplete(){\n");
      out.write("\t\t$('#customer_input').autocomplete({\n");
      out.write("\t\t\tminLength : 0,\n");
      out.write("\t\t\tdelay : 500,\n");
      out.write("\t\t\tsource : function(request, response){\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype : 'GET',\n");
      out.write("\t\t\t\t\turl : 'customerManage/getCustomerList',\n");
      out.write("\t\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\t\tcontentType : 'application/json',\n");
      out.write("\t\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\toffset : -1,\n");
      out.write("\t\t\t\t\t\tlimit : -1,\n");
      out.write("\t\t\t\t\t\tkeyWord : request.term,\n");
      out.write("\t\t\t\t\t\tsearchType : 'searchByName'\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\t\tvar autoCompleteInfo = Array();\n");
      out.write("\t\t\t\t\t\t$.each(data.rows,function(index,elem){\n");
      out.write("\t\t\t\t\t\t\tcustomerCache.push(elem);\n");
      out.write("\t\t\t\t\t\t\tautoCompleteInfo.push({label:elem.name,value:elem.id});\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\tresponse(autoCompleteInfo);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tfocus : function(event,ui){\n");
      out.write("\t\t\t\t$('#customer_input').val(ui.item.label);\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tselect : function(event,ui){\n");
      out.write("\t\t\t\t$('#customer_input').val(ui.item.label);\n");
      out.write("\t\t\t\tstockout_customer = ui.item.value;\n");
      out.write("\t\t\t\tcustomerInfoSet(stockout_customer);\n");
      out.write("\t\t\t\tloadStorageInfo();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t})\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction goodsInfoSet(goodsID){\n");
      out.write("\t\tvar detailInfo;\n");
      out.write("\t\t$.each(goodsCache,function(index,elem){\n");
      out.write("\t\t\tif(elem.id == goodsID){\n");
      out.write("\t\t\t\tdetailInfo = elem;\n");
      out.write("\t\t\t\tif(detailInfo.id==null)\n");
      out.write("\t\t\t\t\t$('#info_goods_ID').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_goods_ID').text(detailInfo.id);\n");
      out.write("\n");
      out.write("\t\t\t\tif(detailInfo.name==null)\n");
      out.write("\t\t\t\t\t$('#info_goods_name').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_goods_name').text(detailInfo.name);\n");
      out.write("\n");
      out.write("\t\t\t\tif(detailInfo.type==null)\n");
      out.write("\t\t\t\t\t$('#info_goods_type').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_goods_type').text(detailInfo.type);\n");
      out.write("\n");
      out.write("\t\t\t\tif(detailInfo.size==null)\n");
      out.write("\t\t\t\t\t$('#info_goods_size').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_goods_size').text(detailInfo.size);\n");
      out.write("\n");
      out.write("\t\t\t\tif(detailInfo.value==null)\n");
      out.write("\t\t\t\t\t$('#info_goods_value').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_goods_value').text(detailInfo.value);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t})\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction customerInfoSet(customerID){\n");
      out.write("\t\tvar detailInfo;\n");
      out.write("\t\t$.each(customerCache,function(index,elem){\n");
      out.write("\t\t\tif(elem.id == customerID){\n");
      out.write("\t\t\t\tdetailInfo = elem;\n");
      out.write("\n");
      out.write("\t\t\t\tif(detailInfo.id == null)\n");
      out.write("\t\t\t\t\t$('#info_customer_ID').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_customer_ID').text(detailInfo.id);\n");
      out.write("\n");
      out.write("\t\t\t\tif(detailInfo.name == null)\n");
      out.write("\t\t\t\t\t$('#info_customer_name').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_customer_name').text(detailInfo.name);\n");
      out.write("\n");
      out.write("\t\t\t\tif(detailInfo.tel == null)\n");
      out.write("\t\t\t\t\t$('#info_customer_tel').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_customer_tel').text(detailInfo.tel);\n");
      out.write("\n");
      out.write("\t\t\t\tif(detailInfo.address == null)\n");
      out.write("\t\t\t\t\t$('#info_customer_address').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_customer_address').text(detailInfo.address);\n");
      out.write("\n");
      out.write("\t\t\t\tif(detailInfo.email == null)\n");
      out.write("\t\t\t\t\t$('#info_customer_email').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_customer_email').text(detailInfo.email);\n");
      out.write("\n");
      out.write("\t\t\t\tif(detailInfo.personInCharge == null)\n");
      out.write("\t\t\t\t\t$('#info_customer_person').text('-');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('#info_customer_person').text(detailInfo.personInCharge);\n");
      out.write("\n");
      out.write("\t\t\t}\n");
      out.write("\t\t})\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction detilInfoToggle(){\n");
      out.write("\t\t$('#info-show').click(function(){\n");
      out.write("\t\t\t$('#detailInfo').removeClass('hide');\n");
      out.write("\t\t\t$(this).addClass('hide');\n");
      out.write("\t\t\t$('#info-hidden').removeClass('hide');\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('#info-hidden').click(function(){\n");
      out.write("\t\t\t$('#detailInfo').removeClass('hide').addClass('hide');\n");
      out.write("\t\t\t$(this).addClass('hide');\n");
      out.write("\t\t\t$('#info-show').removeClass('hide');\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//仓库下拉列表初始化\n");
      out.write("\tfunction repositorySelectorInit(){\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\ttype : 'GET',\n");
      out.write("\t\t\turl : 'repositoryManage/getRepositoryList',\n");
      out.write("\t\t\tdataType : 'json',\n");
      out.write("\t\t\tcontentType : 'application/json',\n");
      out.write("\t\t\tdata : {\n");
      out.write("\t\t\t\tsearchType : 'searchAll',\n");
      out.write("\t\t\t\tkeyWord : '',\n");
      out.write("\t\t\t\toffset : -1,\n");
      out.write("\t\t\t\tlimit : -1\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tsuccess : function(response){\n");
      out.write("\t\t\t\t$.each(response.rows,function(index,elem){\n");
      out.write("\t\t\t\t\t$('#repository_selector').append(\"<option value='\" + elem.id + \"'>\" + elem.id +\"号仓库</option>\");\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror : function(response){\n");
      out.write("\t\t\t\t$('#repository_selector').append(\"<option value='-1'>加载失败</option>\");\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t})\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\tvar delay = (function(){\n");
      out.write("\t\tvar timer = 0;\n");
      out.write("\t\treturn function(callback, ms){\n");
      out.write("\t\tclearTimeout (timer);\n");
      out.write("\t\ttimer = setTimeout(callback, ms);\n");
      out.write("\t\t};\n");
      out.write("\t})();\n");
      out.write("\n");
      out.write("\tfunction fetchStorage(){\n");
      out.write("\t\t$('#stockout_input,#goods_input').keyup(function() {\n");
      out.write("\t\t  delay(function(){\n");
      out.write("\t\t    loadStorageInfo();\n");
      out.write("\t\t  }, 1000 );\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction loadStorageInfo(){\n");
      out.write("\t\tif(stockout_goods != null){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : 'GET',\n");
      out.write("\t\t\t\turl : 'storageManage/getStorageList',\n");
      out.write("\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\tcontentType : 'application/json',\n");
      out.write("\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\toffset : -1,\n");
      out.write("\t\t\t\t\tlimit : -1,\n");
      out.write("\t\t\t\t\tsearchType : 'searchByGoodsID',\n");
      out.write("\t\t\t\t\t// repositoryBelong : stockout_repository,\n");
      out.write("\t\t\t\t\tkeyword : stockout_goods\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tsuccess : function(response){\n");
      out.write("\t\t\t\t\tif(response.total > 0){\n");
      out.write("\t\t\t\t\t\tdata = response.rows[0].number;\n");
      out.write("\t\t\t\t\t\t$('#info_storage').text(data);\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t$('#info_storage').text('0');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(response){\n");
      out.write("\t\t\t\t\t// do nothing\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t})\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//执行货物出库操作\n");
      out.write("\tfunction stockoutOperation(){\n");
      out.write("\t\t$('#submit').click(function(){\n");
      out.write("\t\t\t// data validate\n");
      out.write("\t\t\t$('#stockout_form').data('bootstrapValidator').validate();\n");
      out.write("\t\t\tif (!$('#stockout_form').data('bootstrapValidator').isValid()) {\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tdata = {\n");
      out.write("\t\t\t\tcustomerID : stockout_customer,\n");
      out.write("\t\t\t\tgoodsID : stockout_goods,\n");
      out.write("\t\t\t\t// repositoryID : stockout_repository,\n");
      out.write("\t\t\t\tnumber : $('#stockout_input').val(),\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : 'POST',\n");
      out.write("\t\t\t\turl : 'stockRecordManage/stockOut',\n");
      out.write("\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\tcontent : 'application/json',\n");
      out.write("\t\t\t\tdata : data,\n");
      out.write("\t\t\t\tsuccess : function(response){\n");
      out.write("\t\t\t\t\tvar msg;\n");
      out.write("\t\t\t\t\tvar type;\n");
      out.write("\t\t\t\t\tvar append = '';\n");
      out.write("\t\t\t\t\tif(response.result == \"success\"){\n");
      out.write("\t\t\t\t\t\ttype = 'success';\n");
      out.write("\t\t\t\t\t\tmsg = '货物出库成功';\n");
      out.write("\t\t\t\t\t\tinputReset();\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\ttype = 'error';\n");
      out.write("\t\t\t\t\t\tif (response.msg == 'You are not authorized') {\n");
      out.write("\t\t\t\t\t\t\tmsg = '货物入库失败'\n");
      out.write("\t                        append = \"你未授权操作此仓库，请联系系统管理员\"\n");
      out.write("\t                    }else{\n");
      out.write("\t                        msg = '货物入库失败'\n");
      out.write("\t                    }\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tshowMsg(type, msg, append);\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(xhr, textStatus, errorThrown){\n");
      out.write("\t\t\t\t\t// handle error\n");
      out.write("\t\t\t\t\thandleAjaxError(xhr.status);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t})\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction inputReset(){\n");
      out.write("\t\t$('#customer_input').val('');\n");
      out.write("\t\t$('#goods_input').val('');\n");
      out.write("\t\t$('#stockout_input').val('');\n");
      out.write("\t\t$('#info_customer_ID').text('-');\n");
      out.write("\t\t$('#info_customer_name').text('-');\n");
      out.write("\t\t$('#info_customer_tel').text('-');\n");
      out.write("\t\t$('#info_customer_address').text('-');\n");
      out.write("\t\t$('#info_customer_email').text('-');\n");
      out.write("\t\t$('#info_customer_person').text('-');\n");
      out.write("\t\t$('#info_goods_ID').text('-');\n");
      out.write("\t\t$('#info_goods_name').text('-');\n");
      out.write("\t\t$('#info_goods_size').text('-');\n");
      out.write("\t\t$('#info_goods_type').text('-');\n");
      out.write("\t\t$('#info_goods_value').text('-');\n");
      out.write("\t\t$('#info_storage').text('-');\n");
      out.write("\t\t$('#stockout_form').bootstrapValidator(\"resetForm\",true);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div class=\"panel panel-default\">\n");
      out.write("<ol class=\"breadcrumb\">\n");
      out.write("\t<li>货物出库</li>\n");
      out.write("</ol>\n");
      out.write("<div class=\"panel-body\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-6 col-sm-6\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-1 col-sm-1\"></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-10 col-sm-11\">\n");
      out.write("\t\t\t\t\t<form action=\"\" class=\"form-inline\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\" class=\"form-label\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户：</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"customer_input\" placeholder=\"请输入客户名称\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-6 col-sm-6\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-1 col-sm-1\"></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-10 col-sm-11\">\n");
      out.write("\t\t\t\t\t<form action=\"\" class=\"form-inline\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\" class=\"form-label\">出库货物：</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"goods_input\" placeholder=\"请输入货物名称\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"row visible-md visible-lg\">\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t<div class='pull-right' style=\"cursor:pointer\" id=\"info-show\">\n");
      out.write("\t\t\t\t<span>显示详细信息</span>\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-chevron-down\"></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class='pull-right hide' style=\"cursor:pointer\" id=\"info-hidden\">\n");
      out.write("\t\t\t\t<span>隐藏详细信息</span>\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"row hide\" id=\"detailInfo\" style=\"margin-bottom:30px\">\n");
      out.write("\t\t<div class=\"col-md-6  visible-md visible-lg\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-1\"></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-10\">\n");
      out.write("\t\t\t\t\t<label for=\"\" class=\"text-info\">客户信息</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-1\"></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-11\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">客户ID：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_customer_ID\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">负责人：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_customer_person\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">电子邮件：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_customer_email\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">客户名：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_customer_name\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">联系电话：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_customer_tel\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">联系地址：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_customer_address\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-6 col-sm-6  visible-md visible-lg\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-1 col-sm-1\"></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-11 col-sm-11\">\n");
      out.write("\t\t\t\t\t<label for=\"\" class=\"text-info\">货物信息</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-1\"></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-11\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">货物ID：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_goods_ID\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">货物类型：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_goods_type\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">货物名：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_goods_name\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">货物规格：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_goods_size\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-top:5px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span for=\"\" class=\"pull-right\">货物价值：</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"info_goods_value\">-</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"row\" style=\"margin-top:20px\">\n");
      out.write("\t\t<div class=\"col-md-6 col-sm-6\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-1 col-sm-1\"></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-10 col-sm-11\">\n");
      out.write("\t\t\t\t\t<form action=\"\" class=\"form-inline\" id=\"stockout_form\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\" class=\"form-label\">出库数量：</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"请输入数量\" id=\"stockout_input\" name=\"stockout_input\">\n");
      out.write("\t\t\t\t\t\t\t<span>(当前库存量：</span>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"info_storage\">-</span>\n");
      out.write("\t\t\t\t\t\t\t<span>)</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"row\" style=\"margin-top:80px\"></div>\n");
      out.write("</div>\n");
      out.write("<div class=\"panel-footer\">\n");
      out.write("\t<div style=\"text-align:right\">\n");
      out.write("\t\t<button class=\"btn btn-success\" id=\"submit\">提交出库</button>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
