<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Welcome to Fun Web</title>
<link href="../css/default.css" rel="stylesheet" type="text/css" media="all">
<link href="../css/subpage.css" rel="stylesheet" type="text/css"  media="all">
<link href="../css/print.css" rel="stylesheet" type="text/css"  media="print">
<link href="../css/iphone.css" rel="stylesheet" type="text/css" media="screen">
<!--[if lt IE 9]>
<script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/IE9.js" type="text/javascript"></script>
<script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/ie7-squish.js" type="text/javascript"></script>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script>
<![endif]-->


<!--[if IE 6]>
 <script src="../script/DD_belatedPNG.js"></script>
 <script>
   /* EXAMPLE */
   DD_belatedPNG.fix('#wrap');
   DD_belatedPNG.fix('#sub_img');   
   DD_belatedPNG.fix('#sub_img_center'); 
   DD_belatedPNG.fix('#sub_img_member'); 

 </script>
 <![endif]--> 

</head>

<body>
<div id="wrap">
	<!-- 헤더 영역 -->
	<jsp:include page="../include/header.jsp" />

  <div class="clear"></div>
  <div id="sub_img_member"></div>
  <div class="clear"></div>

	<!-- nav 영역 -->
	<jsp:include page="../include/nav_member.jsp" />

<article>
    
<h1>Join Us</h1>
<form id="join">    
<fieldset>
<legend>Basic Info</legend>
<label>User ID</label> <input name="" type="text" class="id"> <input name="" type="button" value="dup. check" class="dup"><br>
<label>Password</label> <input name="" type="password" class="pass"><br>
<label>Retype Password</label> <input name="" type="password" class="pass"><br>
<label>Name</label> <input name="" type="text" class="nick"><br>
<label>E-Mail</label> <input name="" type="email" class="email" ><br>
<label>Retype E-mail</label> <input name="" type="email" class="email"><br>
</fieldset>


<fieldset>
<legend>Optional</legend>
<label>Address</label> <input name="" type="text" class="address"><br>
<label>Phone Number</label> <input name="" type="tel" class="phone"><br>
<label>Mobile Phone Number</label> <input name="" type="tel" class="mobile"><br>
</fieldset>

<div class="clear"></div>
<div id="buttons">
<input name="" type="button" value="Submit" class="submit"> <input name="" type="button" value="Cancel" class="cancel">
</div>

</form> 
    
</article>    
    <div class="clear"></div>
    
    <!-- 푸터 영역 -->
	<jsp:include page="../include/footer.jsp" />
</div>

</body>
</html>   

    