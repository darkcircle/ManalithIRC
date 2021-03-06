package org.manalith.irc.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import swing2swt.layout.BorderLayout;

public class ServerMessageView extends Composite implements IrcTab {
	private List<ActionListener> actionListeners = new ArrayList<ActionListener>();
	private StyledText messageOutput;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ServerMessageView(Composite parent, int style) {
		super(parent, style);
		setLayout(new BorderLayout(0, 0));

		messageOutput = new StyledText(this, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL);
		messageOutput.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				messageOutput.setTopIndex(messageOutput.getLineCount() - 1);
			}
		});

		messageOutput.setLayoutData(BorderLayout.CENTER);
	}

	public StyledText getMessageOutput() {
		return messageOutput;
	}

	public void printMessage(String message) {
		messageOutput.append(message + "\n");
	}

	public void printAsyncMessage(final String message) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				messageOutput.append(message + "\n");
			}
		});
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public void addActionListener(ActionListener listener) {
		actionListeners.add(listener);
	}

	public void removeActionListener(ActionListener listener) {
		actionListeners.remove(listener);
	}

	private void onAction(Action action) {
		for (ActionListener listener : actionListeners) {
			listener.onAction(action);
		}
	}
}
