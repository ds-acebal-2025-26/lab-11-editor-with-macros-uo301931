package es.uniovi.eii.ds.command;

import es.uniovi.eii.ds.main.Editor;

public class Replace implements Command {
	private String[] args;
	public Editor edit;

	public Replace(Editor edit, String[] args) {
		this.args = args;
		this.edit = edit;
	}

	@Override
	public void execute() {
		edit.replace(args);
	}

}
