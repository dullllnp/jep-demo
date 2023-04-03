import jep.SharedInterpreter;

public class JepTest {
    public static void main(String[] args) {
        try(SharedInterpreter interpreter = new SharedInterpreter()){
            interpreter.exec("import sys");
            interpreter.exec("sys.path.append(\".\")");
	    System.out.println("import jep_test");
            interpreter.exec("import jep_test");
            interpreter.exec("s = jep_test.func()");
            String s = interpreter.getValue("s", String.class);
            System.out.println(s);
        }
    }
}
