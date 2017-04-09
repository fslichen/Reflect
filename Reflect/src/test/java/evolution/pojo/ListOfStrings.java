package evolution.pojo;

import java.util.List;

public class ListOfStrings {
	private List<String> strings;

	public List<String> getStrings() {
		return strings;
	}

	@Override
	public String toString() {
		return "ListOfStrings [strings=" + strings + "]";
	}

	public void setStrings(List<String> strings) {
		this.strings = strings;
	}
}
