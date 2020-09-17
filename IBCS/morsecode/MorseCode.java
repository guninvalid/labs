//This scored a 100

//package morsecode;

import java.util.TreeMap;

public class MorseCode {
	
	private static final char DOT = '.';
	private static final char DASH = '-';
	private static TreeMap<Character, String> map;
	private static TreeNode tree;
	
	public static void start() {
		
		map = new TreeMap<Character, String>();
		tree = new TreeNode(' ', null, null);
		addSymbol(' ', "");
		addSymbol('A', ".-");
		addSymbol('B', "-...");
		addSymbol('C', "-.-.");
		addSymbol('D', "-..");
		addSymbol('E', ".");
		addSymbol('F', "..-.");
		addSymbol('G', "--.");
		addSymbol('H', "....");
		addSymbol('I', "..");
		addSymbol('J', ".---");
		addSymbol('K', "-.-");
		addSymbol('L', ".-..");
		addSymbol('M', "--");
		addSymbol('N', "-.");
		addSymbol('O', "---");
		addSymbol('P', ".--.");
		addSymbol('Q', "--.-");
		addSymbol('R', ".-.");
		addSymbol('S', "...");
		addSymbol('T', "-");
		addSymbol('U', "..-");
		addSymbol('V', "...-");
		addSymbol('W', ".--");
		addSymbol('X', "-..-");
		addSymbol('Y', "-.--");
		addSymbol('Z', "--..");
		addSymbol('0', "-----");
		addSymbol('1', ".----");
		addSymbol('2', "..---");
		addSymbol('3', "...--");
		addSymbol('4', "....-");
		addSymbol('5', ".....");
		addSymbol('6', "-....");
		addSymbol('7', "--...");
		addSymbol('8', "---..");
		addSymbol('9', "----.");
		addSymbol('.', ".-.-.-");
		addSymbol(',', "--..--");
		addSymbol('?', "..--..");
		
	}
	
	
	private static void addSymbol(char letter, String code) {
		
		letter = Character.toUpperCase(letter);
		map.put(letter, code);
		treeInsert(letter, code);
		
	}
	
	private static void treeInsert(char letter, String code) {
		
		letter = Character.toUpperCase(letter);
		TreeNode node = tree;
		
		for (char elem: code.toCharArray()) {
			
			if (elem == DOT) {
				
				if (node.getLeft() == null) {
					
					node.setLeft(new TreeNode((char) 255));
					
				}
				
				node = node.getLeft();
				
			} else if (elem == DASH) {
				
				if (node.getRight() == null) {
					
					node.setRight(new TreeNode((char) 255));
					
				}
				
				node = node.getRight(); 
				
			}
			
		}
		
		node.setValue(letter);
		
	}
	
	public static String encode(String text) {
		
		if (text.length() == 0) {
			
			return "";
			
		}
		
		text = text.toUpperCase();
		String out = "";
		
		for (char c: text.toCharArray()) {
			
			out += " " + encode(c);
			
		}
		
		return out.substring(1) + " ";
		
	}
	
	private static String encode(char letter) {
		
		letter = Character.toUpperCase(letter);
		return map.get(letter);
		
	}
	
	public static String decode(String morse) {
		
		if (morse.length() == 0) {
			
			return "";
			
		}
		
		int index = morse.indexOf(" ");
		String out = "";
		
		switch (index) {
			
			case -1:
				TreeNode node = tree;
				
				for (char elem: morse.toCharArray()) {
					
					if (elem == DOT) {
						
						node = node.getLeft();
						
					} else if (elem == DASH) {
						
						node = node.getRight();
						
					} else {
						
						throw new RuntimeException("I don't know what a \'" + String.valueOf(elem) + "\' is!");
						
					}
					
				}
				
				out += node.getValue().toString();
				break;
				
			case 0:
				out += " " + decode(morse.substring(1));
				break;
				
			default:
				out += decode(morse.substring(0, index)) + decode(morse.substring(index + 1));
				break;
			
		}
		
		return out;
		
	}
	
	static {
		
		start();
		
	}
	
}
