<%@page import="java.sql.*"%>

<%

String name = request.getParameter("name");



String password = request.getParameter("psw");



try{

	Class.forName("com.mysql.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grasstech","root","");

	Statement st = con.createStatement();

	st.executeUpdate("insert into user (name,psw) values('"+name+"','"+psw+"')");

	response.sendRedirect("save.html");

			

}

catch(Exception e){



	response.sendRedirect("error.html");

}

%>