<%@page import="com.liferay.mobilephones.service.MBMobilePhoneLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.mobilephones.model.MBMobilePhone"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />

	<%
		MBMobilePhone mobilePhone = null;
		long mobilePhoneId = ParamUtil.getLong(request, "id");
	    if (mobilePhoneId > 0) {
	    	mobilePhone = MBMobilePhoneLocalServiceUtil.getMBMobilePhone(mobilePhoneId);
	    }
	    String currentUrl = ParamUtil.getString(request, "currentUrl");
	%>
	
	<aui:model-context bean="<%= mobilePhone %>" model="<%= MBMobilePhone.class %>" />
	<portlet:renderURL var="viewMobilePhoneURL" />
	
	<portlet:actionURL name='<%= mobilePhone == null ? "addMobilePhone" : "updateMobilePhone" %>' 
                   var="editMobilePhoneURL" windowState="normal" />

	<liferay-ui:header
	    backURL="<%= viewMobilePhoneURL %>"
	   title='<%= (mobilePhone != null) ? mobilePhone.getName() : "New Mobile" %>'
	/>
	<aui:form action="<%= editMobilePhoneURL %>" method="POST" name="fm">
    
    <aui:fieldset>
    
        <aui:input name="redirect" type="hidden" value="<%= currentUrl %>" />
        <aui:input name="id" type="hidden" value='<%= mobilePhone == null ? "" : mobilePhone.getId() %>'/>
        <aui:input name="name" />
        <aui:input name="description" />
        <aui:input name="brand" />
        <aui:input name="releaseDate" label="Release Date" />
        <aui:input name="price" />

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />
        <aui:button onClick="<%= viewMobilePhoneURL %>" type="cancel" />
    </aui:button-row>
    
</aui:form>