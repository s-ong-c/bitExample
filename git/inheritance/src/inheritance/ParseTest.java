package inheritance;

import javax.swing.text.html.HTMLEditorKit.Parser;

interface Parseable{
	public abstract void parse(String fileName);
}
class ParserManger{
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParse();
			return p;
		}
	}
}
class XMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		// TODO Auto-generated method stub
	System.out.println(fileName+"-XML Parsing completed");	
	}
}
class HTMLParse implements Parseable{
	@Override
	public void parse(String fileName) {
		// TODO Auto-generated method stub
		System.out.println(fileName+"-HTML Parsing completed");
	}
}

public class ParseTest {
	public static void main(String[] args) {
		Parseable parser = ParserManger.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManger.getParser("HTML");
		parser.parse("document2.html");
	}
}
