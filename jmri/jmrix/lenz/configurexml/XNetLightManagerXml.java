// XNetLightManagerXml.java

package jmri.jmrix.lenz.configurexml;

import org.jdom.Element;

/**
 * Provides load and store functionality for
 * configuring XNetLightManagers.
 * <P>
 * Uses the store method from the abstract base class, but
 * provides a load method here.
 * <P>
 * @author Dave Duchamp Copyright (c) 2006
 * @version $Revision: 1.6 $
 */
public class XNetLightManagerXml extends jmri.managers.configurexml.AbstractLightManagerConfigXML {

    public XNetLightManagerXml() {
        super();
    }

    public void setStoreElementClass(Element lights) {
        lights.setAttribute("class","jmri.jmrix.lenz.configurexml.XNetLightManagerXml");
    }

    public void load(Element element, Object o) {
        log.error("Invalid method called");
    }

    public boolean load(Element lights) {
        // load individual lights
        return loadLights(lights);
    }

    static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(XNetLightManagerXml.class.getName());
}
