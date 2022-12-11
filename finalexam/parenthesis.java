package finalexam;

public class parenthesis {
    private static StringBuilder removeInvalid(CharSequence string, char open, char close){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0; i<string.length(); i++){
            char c=string.charAt(i);
            if(c==open){
                count++;
            }if(c==close){
                if(count==0)continue;
                count--;
            }
            sb.append(c);
        }
        return sb;
    }

    public static String parenthesis(String s) {
        StringBuilder result=removeInvalid(s,'(',')');
        result=removeInvalid(result.reverse(),')','(');
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String s=")((apple)))";
        System.out.printf(parenthesis(s));
    }
    //Time O(N); n is the length of String s
    //Space O(N); have used string builder

}
