package test;

public class TextBlockDemo {
	public static void main(String[] args) {
		String name = "Test";
		int age = 25;
		// print name variable value in text block
		
		String str = """
            <html>
                <body>
                    <span>%s</span>
                    <span>%d</span>
                </body>
            </html>""".formatted(name, age);

		System.out.println(str);
		
	}
}
