package es.uniovi.eii.ds.main;

public class Editor {
	StringBuilder text = new StringBuilder();

	public void insert(String[] args) {
		for (String word : args) {
			text.append(" ").append(word);
		}
	}

	public void delete() {
		int indexOfLastWord = text.toString().trim().lastIndexOf(" ");
		if (indexOfLastWord == -1)
			text = new StringBuilder("");
		else
			text.setLength(indexOfLastWord);
	}

	public void replace(String[] args) {
		String find = args[0];
		String replace = args[1];
		text = new StringBuilder(text.toString().replace(find, replace));
	}

	public void setText(String newText) {
		this.text = new StringBuilder(newText);
	}

	public String getText() {
		return text.toString();
	}

}
