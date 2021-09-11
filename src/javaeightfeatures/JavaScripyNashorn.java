/*
 * Nashorn is a JavaScript engine. It is used to execute JavaScript code dynamically at JVM (Java Virtual Machine). Java provides a command-line tool jjs which is used to execute JavaScript code.

You can execute JavaScript code by using jjs command-line tool and by embedding into Java source code.
 */
package javaeightfeatures;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScripyNashorn {

	public static void main(String[] args) {
		ScriptEngine e = new ScriptEngineManager().getEngineByName("Nashorn");
		try {
			e.eval(new FileReader("D:/Technology/java/java-fundamentals/Tutorial/src/javaeightfeatures/script.js"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ScriptException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			e.eval("print('Hello Shivam from Java Code ');");
		} catch (ScriptException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
