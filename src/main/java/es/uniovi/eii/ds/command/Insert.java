package es.uniovi.eii.ds.command;

import es.uniovi.eii.ds.main.Editor;

public class Insert implements Command {
	private String[] args;
	public Editor edit;

	public Insert(Editor edit, String[] args) {
		this.args = args;
		this.edit = edit;
	}

	@Override
	public void execute() {
		edit.insert(args);
	}

}
