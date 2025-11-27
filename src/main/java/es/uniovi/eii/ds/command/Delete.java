package es.uniovi.eii.ds.command;

import es.uniovi.eii.ds.main.Editor;

public class Delete implements Command {
	public Editor edit;

	public Delete(Editor edit) {
		this.edit = edit;
	}

	@Override
	public void execute() {
		edit.delete();
	}

}
