/****************************************************************************
 * Copyright (c) 2008, 2009 Jeremy Dowdall
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jeremy Dowdall <jeremyd@aspencloud.com> - initial API and implementation
 *****************************************************************************/

package org.eclipse.nebula.widgets.cdatetime.snippets;

import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;



public class CDTSnippet01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setText("CDateTime");
		shell.setLayout(new GridLayout(2, false));

		CDateTime cdt = new CDateTime(shell, CDT.BORDER | CDT.SPINNER);
		cdt.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        
		shell.pack();
		Point size = shell.getSize();
		Rectangle screen = display.getMonitors()[0].getBounds();
		shell.setBounds(
				(screen.width-size.x)/2,
				(screen.height-size.y)/2,
				size.x,
				size.y
		);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
