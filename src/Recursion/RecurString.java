package Recursion;

public class RecurString {
    static String remove(String st,int indx){
        if (indx == st.length())return " ";

        String smallCase = remove(st, indx+1);

        char currChar = st.charAt(indx);

        if (currChar != 'a'){
            return currChar+smallCase;
        }else {
            return smallCase;
        }
    }


    static String reverseSt(String st,int indx){
        if (indx == st.length()){
            return " ";
        }
        String smallCase = reverseSt(st, indx+1);
        return smallCase+st.charAt(indx);
    }


    static String reverseSt2(String st){
        if (st.length()==0){
            return " ";
        }
        String smallCase = reverseSt2(st.substring(1));
        return smallCase+st.charAt(0);
    }


    static boolean palindrome(String st, int l, int r){
        if (l>=r)return true;
        return (st.charAt(l)==st.charAt(r) &&  palindrome(st, l+1, r-1));
    }
    public static void main(String[] args) {
        String name = "abcd";
        String palindrome = "a";
//       String ans =  remove(name,0);
//        System.out.println(ans);

//        System.out.println(reverseSt(name,0));
        System.out.println(palindrome(palindrome,0,palindrome.length()-1));
    }
}
