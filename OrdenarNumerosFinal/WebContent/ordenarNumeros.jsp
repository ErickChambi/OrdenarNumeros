<!-- Indicar que se va a trabajar con las etiquetas de struts -->
<%@ taglib uri="/struts-tags" prefix="s"%>
<!-- Indicar que se va trabajar con jquery de struts -->
<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body>

<s:form action="ordenarNumeros">

	<h1 align="center">Ordenar Numeros</h1>
 
  <table border="2" align="center">
    <tr colspan="2" align="center">
      <td>Ingrese Nro1: </td>
      <td> <s:textfield name="nr1"/> </td>
    </tr>
    <tr colspan="2" align="center">
      <td>Ingrese Nro2: </td>
      <td> <s:textfield name="nr2"/> </td>
    </tr>
    <tr colspan="2" align="center">
      <td>Ingrese Nro3: </td>
      <td> <s:textfield name="nr3"/> </td>
    </tr>
    <tr colspan="2" align="center">
      <td>Ingrese Nro4: </td>
      <td> <s:textfield name="nr4"/> </td>
    </tr>
    <tr colspan="2" align="center">
      <td>Ingrese Nro5: </td>
      <td> <s:textfield name="nr5"/> </td>
    </tr>
    <tr colspan="2" align="center">
      <td>Ingrese Nro6: </td>
      <td> <s:textfield name="nr6"/> </td>
    </tr>
    <tr colspan="2" align="center">
      <td>Ingrese Nro7: </td>
      <td> <s:textfield name="nr7"/> </td>
    </tr>
    <tr colspan="2" align="center">
      <td>Ingrese Nro8: </td>
      <td> <s:textfield name="nr8"/> </td>
    </tr>
    <tr colspan="2" align="center">
      <td>Ingrese Nro9: </td>
      <td> <s:textfield name="nr9"/> </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <sj:submit value="Ordenar Numeros"/>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
      <s:property value="mensaje1"/>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
      <s:property value="mostrarNum"/>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
      <s:property value="mensaje2"/>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
      <s:property value="mostrarNumOrdenados"/>
      </td>
    </tr> 
  </table>
</s:form>

</body>
</html>