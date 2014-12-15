<%@page import="com.liferay.mobilephones.model.MBMobilePhone"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>

<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	MBMobilePhone mobilePhone = (MBMobilePhone) row.getObject();
    String name = MBMobilePhone.class.getName();
    long mobilePhoneId = mobilePhone.getId();
    String currentUrl = PortalUtil.getCurrentURL(renderRequest);
%>
<liferay-ui:icon-menu>
    
    <portlet:renderURL var="editMobilePhoneURL">
        <portlet:param name="jspPage" value="/edit.jsp" />
        <portlet:param name="id" value="<%= String.valueOf(mobilePhoneId) %>" />
        <portlet:param name="redirect" value="<%= currentUrl %>" />
    </portlet:renderURL>

    <liferay-ui:icon image="edit" url="<%= editMobilePhoneURL.toString() %>" />

    <portlet:actionURL name="deleteMobilePhone" var="deleteMobilePhoneURL">
        <portlet:param name="id" value="<%= String.valueOf(mobilePhoneId) %>" />
        <portlet:param name="redirect" value="<%= currentUrl %>" />
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%= deleteMobilePhoneURL.toString() %>" />
    
</liferay-ui:icon-menu>