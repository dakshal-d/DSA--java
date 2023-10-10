
class pattern{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            System.out.println();
            for(int j = 1; j<=5; j++){
                System.out.print(j);
                if(i==j){
                    break;
                }
            }
        }
        for(int i=1; i<=5; i++){
            System.out.println();
            for(int j = 5; j>0; j--){
                System.out.print(6 - j);
                if(i==j){
                    break;
                }
            }
        }
    }
}