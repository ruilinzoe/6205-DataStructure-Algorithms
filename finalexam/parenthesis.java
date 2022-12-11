package finalexam;

public class parenthesis {
    private StringBuilder removeInvalid(CharSequence string, char open, char close){
        StringBuilder sb=new StringBuilder();
        int balance=0;
        for(int i=0; i<string.length(); i++){
            char c=string.charAt(i);
            if(c==open){
                balance++;
            }if(c==close){
                if(balance==0)continue;
                balance--;
            }
            sb.append(c);
        }
        return sb;
    }

    public String minRemoveToMakeValid(String s) {
        StringBuilder result=removeInvalid(s,'(',')');
        result=removeInvalid(result.reverse(),')','(');
        return result.reverse().toString();
    }

}
