public class PascalTriangle{
    public static void main(String[] args){
        int value=Integer.parseInt(args[0]);
        int[][] list1=new int[value+1][value+1];
        for(int i=0;i<value+1;i++){
            list1[i][0]=1;
        }
        for(int i=0;i<value+1;i++){
            int j=1;
            while(j<i){
                if(j==i) {
                    list1[i][j]=1;
                }
                list1[i][j]=((list1[i-1][j-1])+(list1[i-1][j]));
                j++;
            }


        }
        for(int i=1;i<value+1;i++){
            for(int j=0;j<value;j++){

                if(list1[i][j]==0){
                    System.out.print(" ");
                }else{
                    System.out.print(list1[i][j]+" ");
                }
            }
            System.out.println();
        }

    }


}
