<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/12/2022
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <form action="/CalcalatorServlet" method="post">
  <h1>Simple Calculator</h1>
  <div>
    <h5>Calculator</h5>
    <div>
      <p>First operand:</p>
      <input type="number" name="first">
    </div>
    <p>Operator:</p>
    <select name="select" id="">
      <option value="Chon">ChonPhepTinh</option>
      <option value="+">Cong</option>
      <option value="-">Tru</option>
      <option value="*">Nhan</option>
      <option value="/">Chia</option>
    </select>
    <div>
      <p>Second operand:</p>
      <input type="number" name="second">
    </div>
    <br>
    <input type="submit" value="Result">
  </div>
  </div>
  </form>
  </body>
</html>
