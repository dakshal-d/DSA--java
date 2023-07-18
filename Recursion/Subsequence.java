public class Subsequence {
    public static void main(String[] args) {
        String b="abc";
        String a="";
        Subseq(a,b);
        
    }
    public static void Subseq(String a,String b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        char ch=b.charAt(0);
        Subseq(a+ch,b.substring(1));
        Subseq(a,b.substring(1));
            
    }
    
}
