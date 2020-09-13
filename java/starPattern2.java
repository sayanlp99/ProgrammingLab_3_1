class pattern2{
    public static void main(String[] args){
        int rows = 3;     
        for (int i= 0; i<= rows-1 ; i++){
            for (int j=0; j<=i; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        } 
        for (int i=rows-1; i>=0; i--){
            for(int j=0; j <= i-1;j++){
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
    }
}