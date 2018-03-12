/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liferay.portlet.forward2.reproduce;

import java.io.IOException;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author dante
 */
public class ReproducerPortlet extends GenericPortlet {

    @Override
    public void init(PortletConfig portletConfig) {
        _portletConfig = portletConfig;
    }

    @Override
    public void render(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException, IOException {

        String path = "/WEB-INF/html/reproducer_forward.html";

        PortletRequestDispatcher portletRequestDispatcher =
            _portletConfig.getPortletContext().getRequestDispatcher(path);

        portletRequestDispatcher.forward(renderRequest, renderResponse);
    }

    private PortletConfig _portletConfig;
   
}