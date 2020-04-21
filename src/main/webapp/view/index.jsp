<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>

  <title>Basic Location API  using Spring Boot</title>

  <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/cover/">

  <!-- Bootstrap core CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">



  <style>
      .main_container{
          margin: auto;
          width: 75%;
          border: 1px dotted white;
          padding: 20px;
      }


  </style>
  <!-- Custom styles for this template -->
  <link href="https://getbootstrap.com/docs/4.4/examples/cover/cover.css" rel="stylesheet">
</head>

<body>




<div class="main_container"><h1 class="header">Location API application using Spring Boot</h1>
    <br>

    <p>
        <b>GET </b>location/<B><I>zipcode</B></I> - Returns specific U.S. location <br>

    <br>
    <b>SAMPLE JSON RESPONSE</b>
    <br>
    <br>
    { <br>
    zipcode: 60102,<br>
    city: "Algonquin",<br>
    state: "Illinois", <br>
    abbrevation: "IL", <br>
    county: "McHenry", <br>
    lat: 42.1641,<br>
    longitude: -88.3064 <br>
    }

        <br>


    <div class="form-inline">
        <script type="text/javascript">
          function goToLocation() {
            var zipcode = document.getElementById('zipcode').value;
            window.location = "/location/" + zipcode;
          }
        </script>
        <div class="form-group mx-sm-3 mb-2">
            <label for="zipcode" class="sr-only">enter zipcode</label>
            <input type="text" maxlength="5"  class="form-control" id="zipcode" placeholder="enter Zip Code">
        </div>
        <button type="submit"  onclick="goToLocation();" class="btn btn-primary mb-2" >GET Location</button>
</div>
        <br>
        <br>
        &copy; <a href="http://www.jamesvalles.com"> James Valles </a> All rights reserved.
</p>

</div>



</body>
</html>










