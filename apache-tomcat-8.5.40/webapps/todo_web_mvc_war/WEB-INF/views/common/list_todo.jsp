<%--
  Created by IntelliJ IDEA.
  User: goodexpert
  Date: 2019-08-08
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
${response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate")}
<div class="ListTodo">
  <ul class="list-group">
  <c:if test="${items.size() > 0}">
    <c:forEach items="${items}" var="item" varStatus="i">
      <c:set var="className" value="list-group-item${item.completed ? ' active' : ''}" />
      <c:set var="itemId" value="list-group-item-${i.index}" />
      <c:set var="btnId" value="remove-btn-item-${i.index}" />
      <li class="<c:out value="${className}" />" id="<c:out value="${itemId}" />" onclick="toggleHandler('#<c:out value="${itemId}" />', '<c:out value="${item.id}" />');">
        <span class="todo-content"><c:out value="${item.content}" /></span>
        <button class="badge badge-danger" id="<c:out value="${btnId}" />" onclick="removeHandler('#<c:out value="${btnId}" />', '<c:out value="${item.id}" />')">remove</button>
      </li>
    </c:forEach>
  </c:if>
  </ul>
</div>
<script>
  function removeHandler(idSelector, id) {
    console.log(document.querySelector(idSelector));
    document.querySelector(idSelector).stopPropagation();
    Apis.deleteTodo(id);
  }

  function toggleHandler(idSelector, id) {
    console.log(document.querySelector(idSelector).preventDefault);
    // document.querySelector(idSelector).preventDefault();
    Apis.toggleTodo(id);
  }
</script>