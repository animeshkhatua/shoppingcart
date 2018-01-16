<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
   
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
  
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; 
      margin: auto;
      min-height:200px;
  }
 
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }
  }
  </style>
      
      <%@ include file="header.jsp" %>
      
<div class="container">
  <h2>Home</h2>  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="C:\Users\Animesh\Desktop\New folder\1.jpg" alt="appliances" style="width:100%;">
      </div>

      <div class="item">
        <img src="C:\Users\Animesh\Desktop\New folder\2.jpg" alt="televisions" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="C:\Users\Animesh\Desktop\New folder\3.jpg" alt="refregarator" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>



  
   <footer class="container-fluid text-center">
  <p>100% Purchase Protection</p>
</footer>
  
</head>
<body>


  

</body>
</html>