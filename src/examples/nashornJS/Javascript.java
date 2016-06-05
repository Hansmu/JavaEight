package examples.nashornJS;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Javascript {

    public static void main(String[] args) throws FileNotFoundException {
        ScriptEngineManager manager = new ScriptEngineManager();//Get an object which is a script engine.
        ScriptEngine engine = manager.getEngineByName("nashorn");

        /*String script =
                "var welcome = 'Hello'; " +
                "welcome +=', Bob'; " +
                "welcome;";*/
        File file = new File("scripts/readurl.js");
        Reader script = new FileReader(file);

        //Object result = null; //Object because it's not known what's coming back from the Javascript. If you do know, then
        //You can specify the type.
        String result;
        try {
            result = (String)engine.eval(script); //Cast here if you're not using just Object.
            System.out.println(result);
        } catch (ScriptException e) {
            System.out.println("There was a Javascript error");
            e.printStackTrace();
        }

    }
}
