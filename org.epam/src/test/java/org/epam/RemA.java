package org.epam;

public class RemA {
	public String remov(String string) {
		int stringLength = string.length();
		return (stringLength < 2) ? string.replaceAll("A", "") : string.substring(0, 2)
				.replaceAll("A", "") + string.substring(2, stringLength);
	
		
}

}
