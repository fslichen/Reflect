package evolution.pojo;

import java.util.List;
import java.util.Map;

public class AnyDto {
	private String string;
	private List<String> stringList;
	private List<AnotherDto> anotherDtoList;
	private Map<String, String> stringMap;
	private Map<String, AnotherDto> anotherDtoMap;
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public List<String> getStringList() {
		return stringList;
	}
	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}
	public List<AnotherDto> getAnotherDtoList() {
		return anotherDtoList;
	}
	public void setAnotherDtoList(List<AnotherDto> anotherDtoList) {
		this.anotherDtoList = anotherDtoList;
	}
	public Map<String, String> getStringMap() {
		return stringMap;
	}
	public void setStringMap(Map<String, String> stringMap) {
		this.stringMap = stringMap;
	}
	public Map<String, AnotherDto> getAnotherDtoMap() {
		return anotherDtoMap;
	}
	public void setAnotherDtoMap(Map<String, AnotherDto> anotherDtoMap) {
		this.anotherDtoMap = anotherDtoMap;
	}
	public Map<AnotherDto, AnotherDto> getStrangeMap() {
		return strangeMap;
	}
	public void setStrangeMap(Map<AnotherDto, AnotherDto> strangeMap) {
		this.strangeMap = strangeMap;
	}
	private Map<AnotherDto, AnotherDto> strangeMap;
	@Override
	public String toString() {
		return "AnyDto [string=" + string + ", stringList=" + stringList + ", anotherDtoList=" + anotherDtoList
				+ ", stringMap=" + stringMap + ", anotherDtoMap=" + anotherDtoMap + ", strangeMap=" + strangeMap + "]";
	}
}
