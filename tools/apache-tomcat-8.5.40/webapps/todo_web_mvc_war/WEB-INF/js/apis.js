(function () {
  // Function-level strict mode syntax
  'use strict';
}());
function baseUrl(path) {
  const BASE_URL = 'http://localhost:8080';
  return `${BASE_URL}${path}`;
}

function deleteRequest(path) {
  return fetch(baseUrl(path), {
    method: 'DELETE', // *GET, POST, PUT, DELETE, etc.
    // mode: 'cors', // no-cors, cors, *same-origin
    cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
    // credentials: 'same-origin', // include, *same-origin, omit
    // redirect: 'follow', // manual, *follow, error
    // referrer: 'no-referrer' // no-referrer, *client
  }).then(response => response.json());
}

function getRequest(path) {
  return fetch(baseUrl(path), {
    method: 'GET', // *GET, POST, PUT, DELETE, etc.
    // mode: 'cors', // no-cors, cors, *same-origin
    cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
    // credentials: 'same-origin', // include, *same-origin, omit
    // redirect: 'follow', // manual, *follow, error
    // referrer: 'no-referrer' // no-referrer, *client
  }).then(response => response.json());
}

function patchRequest(path, body = {}) {
  let contentType, data;
  if (typeof body === 'FormData') {
    contentType = 'application/x-www-form-urlencoded; charset=UTF-8';
    data = body;
  } else {
    contentType = 'application/json; charset=UTF-8';
    data = JSON.stringify(body);
  }
  // Default options are marked with *
  return fetch(baseUrl(path), {
    method: 'PATCH', // *GET, POST, PUT, DELETE, etc.
    // mode: 'cors', // no-cors, cors, *same-origin
    cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
    // credentials: 'same-origin', // include, *same-origin, omit
    headers: {
      'Content-Type': contentType
    },
    // redirect: 'follow', // manual, *follow, error
    // referrer: 'no-referrer', // no-referrer, *client
    body: data // body data type must match "Content-Type" header
  }).then(response => response.json());
}

function postRequest(path, body = {}) {
  let contentType, data;
  if (typeof body === 'FormData') {
    contentType = 'application/x-www-form-urlencoded; charset=UTF-8';
    data = body;
  } else {
    contentType = 'application/json; charset=UTF-8';
    data = JSON.stringify(body);
    <!-- 자바스크립트 객체를 직렬화해서 JSON String으로 만들어준다 -->
  }
  // Default options are marked with *
  return fetch(baseUrl(path), {
    method: 'POST', // *GET, POST, PUT, DELETE, etc.
    // mode: 'cors', // no-cors, cors, *same-origin
    cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
    // credentials: 'same-origin', // include, *same-origin, omit
    headers: {
      'Content-Type': contentType
    },
    // redirect: 'follow', // manual, *follow, error
    // referrer: 'no-referrer', // no-referrer, *client
    body: data // body data type must match "Content-Type" header
  }).then(response => response.json());
}

function putRequest(path, body = {}) {
  let contentType, data;
  if (typeof body === 'FormData') {
    contentType = 'application/x-www-form-urlencoded; charset=UTF-8';
    data = body;
  } else {
    contentType = 'application/json; charset=UTF-8';
    data = JSON.stringify(body);
  }
  // Default options are marked with *
  return fetch(baseUrl(path), {
    method: 'PUT', // *GET, POST, PUT, DELETE, etc.
    // mode: 'cors', // no-cors, cors, *same-origin
    // cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
    // credentials: 'same-origin', // include, *same-origin, omit
    // mode: 'cors', // no-cors, cors, *same-origin
    cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
    // credentials: 'same-origin', // include, *same-origin, omit
    headers: {
      'Content-Type': contentType
    },
    // redirect: 'follow', // manual, *follow, error
    // referrer: 'no-referrer', // no-referrer, *client
    body: data // body data type must match "Content-Type" header
  }).then(response => response.json());
}

function createTodo(todo) {
  return postRequest('/todo', todo);
}

function deleteTodo(id) {
  return deleteRequest(`/todo/${id}`);
}

function listTodo(page = 1, size = 10) {
  return getRequest(`/todo?page=${page}&size=${size}`);
}

function updateTodo(id, todo) {
  return patchRequest(`/todo/${id}`, todo);
}

function toggleTodo(id) {
  return patchRequest(`/todo/${id}/toggle`);
}

const Apis = {
  deleteRequest,
  getRequest,
  patchRequest,
  postRequest,
  putRequest,

  createTodo,
  deleteTodo,
  listTodo,
  updateTodo,
  toggleTodo
};
