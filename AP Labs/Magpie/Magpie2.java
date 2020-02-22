import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

/**
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	
	private BufferedReader in;
	private PrintStream out;
	private List<StringParser.MemoryToken> memList;
	private static double log2 = Math.log(2.0);
	
	public Magpie2() {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		out = System.out;
		memList = new ArrayList<StringParser.MemoryToken>();
		
	}
	
	public Magpie2(String inname) throws FileNotFoundException {
		
		in = new BufferedReader(new FileReader(inname));
		out = System.out;
		memList = new ArrayList<StringParser.MemoryToken>();
		
	}
	
	public Magpie2(File pin) throws FileNotFoundException {
		
		in = new BufferedReader(new FileReader(pin));
		out = System.out;
		memList = new ArrayList<StringParser.MemoryToken>();
		
	}
	
	public Magpie2(File pin, File pout) throws FileNotFoundException {
		
		in = new BufferedReader(new FileReader(pin));
		out = new PrintStream(pout);
		memList = new ArrayList<StringParser.MemoryToken>();
		
	}
	
	public String getGreeting() {
		
		return QnA.getRandomGreeting();
		
	}
	
	public String getResponse(String in) {
		
		return getResponse(new StringParser(in));
		
	}
	
	public String getResponse(StringParser in) {
		
		if (StringParser.REMEMBER.equals(in)) {
			
			addToMemory();
			return "Remembered. Type \"recall\" in order to return it.";
			
		}
		
		if (StringParser.RECALL.equals(in)) {
			
			return getFromMemory();
			
		}
		
		if (StringParser.DELETE.equals(in)) {
			
			return deleteFromMemory();
			
		}
		
		if (StringParser.GAME.equals(in)) {
			
			playGame();
			return "The game is done";
			
		}
		
		return "Idk man";
		
	}
	
	private void addToMemory() {
		
		println("What thing would you like to remember?");
		String name = readLine();
		println("What is the " + name + "?");
		String memory = readLine();
		memList.add(new StringParser.MemoryToken(new StringParser(name), memory));
		
	}
	
	private String getFromMemory() {
		
		out.println("What would you like to remember?");
		StringParser name = new StringParser(readLine());
		
		for (StringParser.MemoryToken memory: memList) {
			
			if (name.equals(memory.name)) {
				
				println("Found your memory.");
				return println(memory.memory);
				
			}
			
		}
		
		return println("I could not find your memory!");
		
	}
	
	private String deleteFromMemory() {
		
		println("What would you like to delete?");
		StringParser string = new StringParser(readLine());
		
		for (int i = memList.size() - 1; i >= 0; i--) {
			
			if (string.equals(memList.get(i).name)) {
				
				memList.remove(i).name.value();
				return println("Memory deleted.");
				
			}
			
		}
		
		println("Memory not found!");
		
		for (StringParser.MemoryToken token: memList) {
			
			println(token.name + ":" + token.memory);
			
		}
		
		return "Memory not found!";
		
	}
	
	private String print(String in) {
		
		out.print(in);
		return in;
		
	}
	
	private String println(String in) {
		
		out.println(in);
		return in;
		
	}
	
	private String readLine() {
		
		try {
			
			return in.readLine();
			
		} catch (IOException ex) {
			
			ex.printStackTrace();
			return "";
			
		}
		
	}
	
	private void playGame() {
		
		print("lower bound: ");
		int l = Integer.parseInt(readLine());
		print("higher bound: ");
		int h = Integer.parseInt(readLine());
		Integer rand = new Integer((int) Math.round((Math.random() * (double) (h - l + 1))) + l);
		
		for (int i = (int) Math.ceil(Math.log((double) (h - l)) / log2)  + 1; 0 < i; i--) {
			
			println("guess: ");
			int comparison = rand.compareTo(new Integer(Integer.parseInt(readLine())));
			
			if (comparison < 0) {
				
				println("too small! ");
				
			}
			
			if (comparison == 0) {
				
				println("you did it ");
				return;
				
			}
			
			if (0 < comparison) {
				
				println("too large! ");
				
			}
			
		}
		
	}
	
	private static class StringParser {
		
		private String string;
		private int length;
		
		public static final StringParser REMEMBER = new StringParser("remember");
		public static final StringParser RECALL = new StringParser("recall");
		public static final StringParser DELETE = new StringParser("delete");
		public static final StringParser GAME = new StringParser("game");
		
		public StringParser(String pstring) {
			
			this.string = pstring;
			this.process();
			
		}
		
		public String process() {
			
			this.setValue(this.value().trim().toLowerCase());
			return this.value();
			
		}
		
		public boolean isBlank() {
			
			return this.process().length() <= 0;
			
		}
		
		public int indexOf(StringParser in) {
			
			return this.value().indexOf(in.value());
			
		}
		
		public int indexOf(String in) {
			
			return this.indexOf(new StringParser(in));
			
		}
		
		public int indexIn(StringParser in) {
			
			return in.indexOf(this);
			
		}
		
		public int indexIn(String in) {
			
			return this.indexIn(new StringParser(in));
			
		}
		
		public boolean contains(StringParser in) {
			
			return this.indexOf(in) > -1;
			
		}
		
		public boolean contains(String in) {
			
			return this.contains(new StringParser(in));
			
		}
		
		public String value() {
			
			return this.string;
			
		}
		
		public String toString() {
			
			return this.string;
			
		}
		
		public boolean equals(Object object) {
			
			return (object instanceof String || object instanceof StringParser) 
					&& this.toString().equals(object.toString());
			
		}
		
		public String setValue(String pstring) {
			
			this.string = pstring;
			this.length = this.value().length();
			return this.value();
			
		}
		
		public int length() {
			
			return this.length;
			
		}
		
		public static class MemoryToken {
			
			public StringParser name;
			public String memory;
			
			public MemoryToken(StringParser pname, String pmemory) {
				
				name = pname;
				memory = pmemory;
				
			}
			
		}
		
	}
	
	private enum QnA {
		
		family(new String[] {
				
				"mother",
				"father",
				"sister",
				"brother",
				"family",
				
		}, "Tell me more about your family.", "or"),
		
		
		compsci(new String[] {
				
				"like",
				"Computer Science",
				
		}, "Yes, it is my favorite course.", "and"),
		
		yourself(new String[] {
				
				"about yourself",
				
		}, "I was created for the 2015 test.", "or"),
		
		likedorfeared(new String[] {
				
				"liked",
				"or",
				"feared",
				
		}, "FEARED.", "and"),
		
		question(new String[] {
				
				"questions",
				"me",
				
		}, "No, I am not interested in humans.", "and"),
		
		;
		
		public final StringParser[] checks;
		public final String[] responses;
		public final String checkType;
		public static final String[] DEFAULTS = new String[] {
				
				"Interesting, tell me more.",
				"Hmmm.",
				"Do you really think so?",
				"You don't say."
				
		};
		
		public static final String[] DEFAULTGREETINGS = new String[] {
			
			"Hello, let's talk."
			
		};
		
		public static final String[] DEFAULTEMPTY = new String[] {
			
			"Say something, please."
			
		};
		
		QnA(String[] pchecks, String[] presponses, String pcheckType) {
			
			checks = new StringParser[pchecks.length];
			
			for (int i = pchecks.length - 1; i >= 0; i--) {
				
				checks[i] = new StringParser(pchecks[i]);
				
			}
			
			responses = presponses;
			checkType = pcheckType;
			
		}
		
		QnA(String[] pchecks, String presponses, String pcheckType) {
			
			checks = new StringParser[pchecks.length];
			
			for (int i = pchecks.length - 1; i >= 0; i--) {
				
				checks[i] = new StringParser(pchecks[i]);
				
			}
			
			responses = new String[] {
					
					presponses
					
			};
			checkType = pcheckType;
			
		}
		
		QnA(String pchecks, String presponses, String pcheckType) {
			
			checks = new StringParser[] {
				
				new StringParser(pchecks)
				
			};
			responses = new String[] {
				
				presponses
				
			};
			checkType = pcheckType;
			
		}
		
		public boolean checkFor(String input) {
			
			return checkFor(new StringParser(input));
			
		}
		
		public boolean checkFor(StringParser input) {
			
			switch (checkType) {
				
				case "and":
					
					for (StringParser check: this.checks) {
						
						if (input.indexOf(check) <= -1) {
							
							return false;
							
						}
						
					}
					
					return true;
					
				
				case "or":
					
					for (StringParser check: this.checks) {
						
						if (input.indexOf(check) > -1) {
							
							return true;
							
						}
						
					}
					
					return false;
					
				
			}
			
			return false;
			
		}
		
		public static String getRandomGreeting() {
			
			return (String) getRandom(DEFAULTGREETINGS);
			
		}
		
		public static String getRandomMessage() {
			
			return (String) getRandom(DEFAULTS);
			
		}
		
		public static String getRandomEmpty() {
			
			return (String) getRandom(DEFAULTEMPTY);
			
		}
		
		public String getRandomResponse() {
			
			return (String) getRandom(this.responses);
			
		}
		
		public static Object getRandom(Object[] array) {
			
			return array[(int) ((array.length - 1) * Math.random())];
			
		}
		
	}
	
}
