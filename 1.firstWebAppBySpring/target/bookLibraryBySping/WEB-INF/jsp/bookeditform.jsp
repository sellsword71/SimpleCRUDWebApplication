<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28.05.2019
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit book</h1>
<form:form method="POST" action="/editsave">
    <table >
        <tr>
            <td></td>
            <td><form:hidden  path="id" /></td>
        </tr>
        <tr>
            <td>Name of writer : </td>
            <td><form:input path="writer"  /></td>
        </tr>
        <tr>
            <td>Title of the book :</td>
            <td><form:input path="title" /></td>
        </tr>

        <tr>
            <td> </td>
            <td><input type="submit" value="Edit Save" /></td>
        </tr>
    </table>
</form:form>
