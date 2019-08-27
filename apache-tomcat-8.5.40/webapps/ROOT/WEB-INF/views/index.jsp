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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
${response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate")}
<!DOCTYPE html>
<html>
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="stylesheet" href="/css/index.css">

  <!-- Optional JavaScript -->
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

  <title>$Title$</title>
</head>
<body>
<div id="root">
  <div class="container">
    <nav class="navbar navbar-dark bg-dark">
      <button class="navbar-toggler" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="/">Home</a>
        <a class="dropdown-item" href="/about">About</a>
        <a class="dropdown-item" href="/login">Log In</a>
        <a class="dropdown-item" href="/signup">Sign Up</a>
      </div>
      <a class="navbar-brand" href="/">Todo Service</a>
      <button type="button" class="btn btn-danger" onclick="window.location.href = '/logout'">Logout</button>
    </nav>
    <%--
            <%@ include file="common/add_todo.jsp" %>
            <%@ include file="common/list_todo.jsp" %>
    --%>
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

    <div class="ListTodo">
      <ul class="list-group" id="list-group">
        <!-- 1) 클릭 이벤트에 대해서 어떻게 bind를 할것인가 -> 현재 해결
             2) addtodo를 어떻게 dynamic 하게 할 것인가 -> 현재 구현 X, 핸들러를 불러올 수 없음 -->
        <c:if test="${items.size() > 0}">
          <c:forEach items="${items}" var="item" varStatus="i">
            <c:set var="className" value="list-group-item${item.completed ? ' active' : ''}" />
            <c:set var="itemId" value="list-group-item-${i.index}" />
            <li class="<c:out value="${className}" />" id="<c:out value="${itemId}" />" data-id="<c:out value="${item.id}" />">
              <span class="todo-content"><c:out value="${item.content}" /></span>
              <button class="badge badge-danger" data-id="<c:out value="${item.id}" />">remove</button>
            </li>
          </c:forEach>
        </c:if>
      </ul>
    </div>

    <div class="Pagination">
      <nav aria-label="Page navigation">
        <ul class="pagination" id="pagination">
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Previous">
              <span aria-hidden="true">&laquo;</span>
              <span aria-hidden="true">&lt;</span>
            </a>
          </li>
          <li class="page-item"><a class="page-link" href="#">Previous</a></li>
          <li class="page-item"><a class="page-link" href="#">Next</a></li>
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
              <span aria-hidden="true">&gt;</span>
              <span aria-hidden="true">&raquo;</span>
            </a>
          </li>
        </ul>
      </nav>
    </div>
  </div>
</div>
</body>

<script src="/js/apis.js"></script>
<script type="text/javascript" charset="UTF-8">
  // cosnt pagination 선언해서 갯수가 들어났을 때 pagination이 잘 되는지 확인해보기

  const pageCount =  document.getElementsByTagName("li");
  const myForm = document.querySelector('#myForm');
  // 이벤트와 함수를 바인딩 시킴
  myForm.addEventListener('submit', onSubmit);

  function onSubmit(e) {
    // submit 기본 동작을 실행을 막음, 즉 form을 controller에 get으로 전달하고 자동으로 reloading 하는 것을 막음
    e.preventDefault();
    const content = document.querySelector('#content').value;
    // createTodo : promise()
    Apis.createTodo({ content: content, completed: false })
            .then(response => addTodoItem(response));
  }


  // resetHandler()로 감싸기

  function resetHandler(){
    const groupItems = document.getElementsByClassName('list-group-item');
    Array.from(groupItems).forEach((element) => {
      const dataId = element.getAttribute('data-id');
      const itemId = element.getAttribute('id');

      element.addEventListener('click', (e) => {
        e.preventDefault();
        Apis.toggleTodo(dataId)
                .then(response => {
                  const item = document.getElementById(itemId);
                  const todo = response;
                  todo.completed ? item.classList.add('active') : item.classList.remove('active');
                });
      });

      const parent = element;
      const buttons = parent.getElementsByClassName('badge');
      Array.from(buttons).forEach((element) => {
        const dataId = element.getAttribute('data-id');

        element.addEventListener('click', (e) => {
          e.stopPropagation();
          Apis.deleteTodo(dataId)
                  .then(response => parent.remove());
        });
      });
    });
  }


  function addTodoItem(todo) {
    const todoItem = document.createElement('li');
    todoItem.classList.add('list-group-item');
    if (todo.completed) {
      todoItem.classList.add('active');
    }
    todoItem.setAttribute('id', 'list-group-item-' + todo.id);
    todoItem.setAttribute('data-id', todo.id);

    const spanItem = document.createElement('span');
    spanItem.classList.add('todo-content');
    spanItem.appendChild(document.createTextNode(todo.content));
    todoItem.appendChild(spanItem);

    const btnItem = document.createElement('button');
    btnItem.classList.add('badge');
    btnItem.classList.add('badge-danger');
    btnItem.setAttribute('data-id', todo.id);
    btnItem.appendChild(document.createTextNode('remove'));
    todoItem.appendChild(btnItem);

    const listGroup = document.getElementById('list-group');
    listGroup.insertBefore(todoItem, listGroup.firstChild);

    resetHandler();
  }

  function addPageItem(page, size, active, first = false, last = false, prev = false, next =  false) {
    const pageItem = document.createElement('li')
    pageItem.classList.add('page-item');
    if (active) {
      pageItem.classList.add('active');
    }
    // pageItem.classList.add(active ? 'page-item active ' : 'page-item');
    pageItem.appendChild(addPageLink(page, size, first, last, prev, next));
    return pageItem;
  }

  function addPageLink(page, size, first, last, prev, next) {
    const pageLink = document.createElement('a')
    pageLink.classList.add('page-link');
    // Ajax 방식으로 동작할 때는 경로가 아닌 함수로 대체 한다 !!
    pageLink.setAttribute('href', '?page=' + page + '&size=' + size);

    if (first || last) {
      const spanItem = document.createElement('span');
      spanItem.setAttribute('aria-hidden', 'true');
      spanItem.appendChild(document.createTextNode(first ? '<<' : '>>'));
      pageLink.appendChild(spanItem);
    } else if(prev || next){
      const spanItem = document.createElement('span');
      spanItem.setAttribute('aria-hidden', 'true');
      spanItem.appendChild(document.createTextNode(prev ? '<' : '>'));
      pageLink.appendChild(spanItem);
    } else {
      pageLink.appendChild(document.createTextNode(page));
    }
    return pageLink;
  }

  function resetPagination(page, size, totalCount) {
    const pagination = document.getElementById('pagination');
    while (pagination.hasChildNodes()) {
      pagination.removeChild(pagination.firstChild);
    }

    const totalPage = Math.floor((totalCount + size - 1) / size);
    const beginPage = Math.floor(page / 10) * 10 + 1;
    const endPage = (beginPage + 10 > totalPage ? totalPage : beginPage + 10);
    console.log('page = ', page);
    console.log('beginPage = ', beginPage);
    console.log('endPage = ', endPage);


    pagination.appendChild(addPageItem(1, size, false, true));

    pagination.appendChild(addPageItem(page > 1 ? page -1 : 1, size, false, false, false, true, false));

    for (let i = beginPage; i <= endPage; i++) {
      pagination.appendChild(addPageItem(i, size, (i == page)));
    }
    pagination.appendChild(addPageItem(page < totalPage ? page +1 : totalPage, size, false, false, false, false, true));

    pagination.appendChild(addPageItem(totalPage, size, false, false, true));
  }
  resetPagination(<c:out value="${page}" />, <c:out value="${size}" />, <c:out value="${totalCount}" />)
</script>
</html>
