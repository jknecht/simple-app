<%@page import="com.slalom.simpleapp.MessageProvider"%>
<%
	MessageProvider messageProvider = new MessageProvider();
%>
<%= messageProvider.getMessage() %>

