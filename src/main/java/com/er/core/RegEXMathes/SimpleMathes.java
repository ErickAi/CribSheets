package com.er.core.RegEXMathes;

public class SimpleMathes {

    public static void main(String[] args) throws Exception {
        SimpleMathes math = new SimpleMathes();
        System.out.println(math.FindIntInsideWords("f1rst sec0nd th1rd f0urth five s1x seven eight n1ne"));
        System.out.println(math.CountSpacesInString("f1rst sec0nd th1rd f0urth five s1x seven eight n1ne"));
    }

    public String FindIntInsideWords(String string) {
        String[] check = string.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : check) {
            if (s.matches(".*\\d.*"))
                sb.append(s);
        }
        return sb.toString();
    }
    public int CountSpacesInString(String string) {
        int countSpaces = string.replaceAll("[^ ]", "").length();
        return countSpaces;
    }

}
