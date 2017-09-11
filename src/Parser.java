
public class Parser {
    public static String setSpaces(String source) {
        String result = "";
        int size = source.length();
        String space = " ";

        StringBuffer stb = new StringBuffer(source);
        result = stb.reverse().toString();

        return result;
    }

    public static void main(String[] args) {
        String example = "123456789";

        System.out.println("original ------ " + example);


        System.out.println("changed -----" + setSpaces(example));
    }
}
