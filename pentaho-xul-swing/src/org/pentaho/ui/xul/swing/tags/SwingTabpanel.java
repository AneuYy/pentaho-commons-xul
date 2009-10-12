package org.pentaho.ui.xul.swing.tags;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import org.pentaho.ui.xul.XulComponent;
import org.pentaho.ui.xul.XulDomContainer;
import org.pentaho.ui.xul.XulDomException;
import org.pentaho.ui.xul.components.XulTabpanel;
import org.pentaho.ui.xul.swing.AbstractSwingContainer;
import org.pentaho.ui.xul.swing.SwingElement;
import org.pentaho.ui.xul.util.Orient;
import org.pentaho.ui.xul.dom.Element;

public class SwingTabpanel extends AbstractSwingContainer implements XulTabpanel{
	
	
	public SwingTabpanel(Element self, XulComponent parent, XulDomContainer domContainer, String tagName) {
		super("tabpanel");


    this.orientation = Orient.VERTICAL;
    
    container = new JPanel(new GridBagLayout());

    setManagedObject(container);
    
    resetContainer();
    
	}
	
  public void resetContainer(){
    
    container.removeAll();
    
    gc = new GridBagConstraints();
    gc.gridy = GridBagConstraints.RELATIVE;
    gc.gridx = 0;
    gc.gridheight = 1;
    gc.gridwidth = GridBagConstraints.REMAINDER;
    gc.insets = new Insets(2,2,2,2);
    gc.fill = GridBagConstraints.HORIZONTAL;
    gc.anchor = GridBagConstraints.NORTHWEST;
    gc.weightx = 1;
    
  }

  @Override
  public void replaceChild(XulComponent oldElement, XulComponent newElement) throws XulDomException{
    this.resetContainer();
    super.replaceChild(oldElement, newElement);
  }

}
