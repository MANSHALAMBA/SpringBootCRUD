<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "springform"%>


  <!doctype html>
  <html lang="en">
    <head>
      <!-- Required meta tags -->
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

      <!-- Bootstrap CSS -->
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
         <script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js" ></script>
         <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>





<style>


html, body {
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%;
    display: table
}
.searchBar{
    display: table-cell;
    text-align: center;
    vertical-align: middle;
}



</style>
   </head>
   <body>
<div class="searchBar">


 <springform:form  action="/create" commandName="e" method="post" >
 <springform:input style="width:50%"  class="searchBar"  type="text" path="name"  autocomplete="off" placeholder="enter employee name" />

 <button type="button" class="btn btn-success"> <input style="background-color:inherit;border:none;color:white"  type="submit" value="CREATE" /></button>
 </springform:form>
  <br/>
 <springform:form  action="/read" commandName="e" method="post" >
  <springform:input style="width:50%"  class="searchBar"  type="number" path="id" placeholder="enter id"  autocomplete="off" />

  <button type="button" class="btn btn-success"> <input style="background-color:inherit;border:none;color:white" type="submit" value="READ" /></button>
  </springform:form>
  <br/>
  <springform:form  action="/update" commandName="e" method="post" >
  <springform:input style="width:50%"  class="searchBar"  type="number" path="id" placeholder="Enter employee id"  autocomplete="off" />

   <springform:input style="width:50%"  class="searchBar"  type="text" path="name" placeholder="Enter new Name"  autocomplete="off" />

   <button type="button" class="btn btn-success"> <input style="background-color:inherit;border:none;color:white" type="submit" value="UPDATE" /></button>
   </springform:form>
   <br/>
   <springform:form  action="/delete" commandName="e" method="post" >
    <springform:input style="width:50%"  class="searchBar"  type="number" path="id" placeholder="Enter employeee id"  autocomplete="off" />

    <button type="button" class="btn btn-success"> <input style="background-color:inherit;border:none;color:white" type="submit" value="Delete" /></button>
    </springform:form>

</div>




       <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
       <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>

  </html>

