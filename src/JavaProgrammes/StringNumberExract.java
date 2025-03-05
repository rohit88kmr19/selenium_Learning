package JavaProgrammes;

public class StringNumberExract {

    public static void main(String[] args) {

        String str = "R1o2hi3t K4u5ma6r";
        //int len = str.length();

        String[] words = str.split(" ");
        String result = "";
        for (String w : words)
            {
                for (int i = 0; i < w.length(); i++) {
                    if (Character.isDigit(w.charAt(i))) {
                        result += w.charAt(i);
                    }
                }
            }
        System.out.println(result);
    }
}