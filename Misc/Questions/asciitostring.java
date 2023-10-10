public class asciitostring {
    public static void main(String[] args) {
        String str="71101101156";
        System.out.println(Ascii(str));

    }
    public static String Ascii(String str){
        String result="";
        int num=0;
        char ch;
        for(int i=str.length()-1;i>=0;i--){
            num=num*10+(str.charAt(i)-'0');
            if(num>=32 && num<=122){
                ch=(char)num;
                result+=ch;
                num=0;
            }
        }
        return result;
    }
    
}
