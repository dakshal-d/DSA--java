
public class apple {
    
    public static void main(String[] args)
{
    int M = 10;
    int K = 15;
    int N = 0;
    int S = 1;
    int W = 0;
    int E = 0;  
    System.out.println(minApp(M,K,N,S,W,E));
}
static int minApp(int M,int K,int N,int S,int W,int E)
{
    if(M <= S*K)
        return M;
    else if(M <= S*K+E+W)
        return S*K+(M-S*K)*K;
    else
        return -1;
}
}