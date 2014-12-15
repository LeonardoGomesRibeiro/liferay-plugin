<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@page import="com.liferay.mobilephones.service.MBMobilePhoneLocalServiceUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.mobilephones.model.MBMobilePhone"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
	String currentUrl = PortalUtil.getCurrentURL(renderRequest);
	String noDate = "no date set.";
%>

<%!
	com.liferay.portal.kernel.dao.search.SearchContainer<MBMobilePhone> searchContainer = null;
%>

<aui:button-row>
	<portlet:renderURL var="addMobilePhoneURL">
		<portlet:param name="jspPage" value="/edit.jsp" />
		<portlet:param name="redirect" value="<%=currentUrl%>" />
	</portlet:renderURL>
	
	<aui:button onClick="<%= addMobilePhoneURL.toString() %>"
		value="Add Mobile Phone" />
</aui:button-row>

<liferay-ui:search-container emptyResultsMessage="No mobile phones">
    <liferay-ui:search-container-results
        results="<%= MBMobilePhoneLocalServiceUtil.getMBMobilePhones(searchContainer.getStart(), searchContainer.getEnd()) %>"
        total="<%= MBMobilePhoneLocalServiceUtil.getMBMobilePhonesCount() %>"
    />
    
    <liferay-ui:search-container-row
        className="com.liferay.mobilephones.model.MBMobilePhone"
        keyProperty="id"
        modelVar="mobilePhone" escapedModel="<%= true %>"
    >
        <liferay-ui:search-container-column-text
            name="Name"
            value="<%= mobilePhone.getName() %>"
        />

        <liferay-ui:search-container-column-text
            name="Description"
            value="<%= mobilePhone.getDescription() %>"
        />

        <liferay-ui:search-container-column-text
            name="Brand"
            value="<%= mobilePhone.getBrand() %>"
        />

		<liferay-ui:search-container-column-text
            name="Release Date" 
            value="<%=mobilePhone.getReleaseDate() == null ? noDate :mobilePhone.getReleaseDate().toString() %>"
        />
        
        <liferay-ui:search-container-column-jsp
		    align="right" 
		    path="/mb_mobile_phone_buttons.jsp"
		/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
    
</liferay-ui:search-container>
