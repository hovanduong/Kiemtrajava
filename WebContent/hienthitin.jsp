<%@page import="duongbean.tintucbean"%>

<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tin Tức </title>
<meta name="viewport" content="width=device-width, maximum-scale=1.0, initial-scale=1.0, user-scalable=no">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.1/css/all.css" integrity="sha384-vp86vTRFVJgpjF9jiIGPEEqYqlDwgyBgEF109VFjmqGmIY/Y4HV4d3Gp2irVfcrp" crossorigin="anonymous">


</head>
 
 
<body  >

<a alt="Doc bao" href="/" class="logo"><img alt="Logo docbao.vn" width="250px" src="https://docbao.vn/images/logo-bk.jpg"></a>
 
<br>
<br>
  <nav class="navbar navbar-inverse navbar-expand-lg bg-dark navbar-blue">
  
  	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    		<span class="navbar-toggler-icon"></span>
  		</button>
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	  	<ul class="navbar-nav">
		    <li class="nav-item">
		      <a class="nav-link" href="hienthitincontroller">Trang chủ</a>
		    </li>
		   
		    <li class="nav-item">
		    </li>
		  </ul>
		   <form class="form-inline" method="post" action="hienthitincontroller" style="margin-left: auto">
		    <input class="form-control mr-sm-2" type="text" placeholder="Search" name="txttk">
		    <button class="btn btn-success" type="submit">Search</button>
		  </form>
	  </div>
  
</nav>
<br>
<% 
		ArrayList<tintucbean> ds=(ArrayList<tintucbean>)request.getAttribute("dstintuc");
		int n=ds.size();
	
		%>
		
<div >
  
    <div >
    
    <div >
			
			<%for(int i = 0; i < n ; i++) { %>	
		       <div >
					<div class="container">         
			  <table class="table table-striped">
			    <thead>
			      <tr>
			      <div class="left_ct ">
                     	<td>
                     	<h4 class="title"><a href="#"><%=ds.get(i).getMatin() %>. <%=ds.get(i).getTieude()%> (Ngày Đăng: <%=ds.get(i).getNgauduatin() %>)</a></h4>      
         					 	                                                             
                                <img width="340" height="255" src="a1.jpg" alt=""></a>
                       
                               <li>                                                                                                                               
                               <a href="#"> Tóm tắt: <%=ds.get(i).getTomtat()%></a>
                                </li>  
                                  <li>                                                                                                                               
                                <a href="#">Nội dung: <%=ds.get(i).getNoidungtin()%></a>	
                                </li>
                                                                                                  
                                                                              
                     	
                     	</td>
         					 	                 
         			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
                       
                       
                        </div>
			   		
			  	</tr>
			 
			  </table>
			</div>
		       </div>
			<%}%>
			
		</div>
	</div>	
</div>
	
		
		
		
	

	
     
      
				
</body>
</html>