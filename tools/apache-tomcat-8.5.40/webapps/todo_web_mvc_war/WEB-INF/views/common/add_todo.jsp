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
<div class="AddTodo">
  <form id="myForm" name="myForm">
    <div class="input-group mb-3">
      <input type="text" class="form-control" id="content" name="content" placeholder="To-Do를 입력하세요" />
      <div class="input-group-append">
        <button class="btn btn-outline-primary" type="submit">ADD</button>
      </div>
    </div>
  </form>
</div>

<script src="/js/apis.js"></script>
<script>
  const myForm = document.querySelector('#myForm');
  myForm.addEventListener('submit', onSubmit);

  function onSubmit(e) {
    e.preventDefault();
    const content = document.querySelector('#content').value;
    Apis.createTodo({ content: content, completed: false })
  }
</script>