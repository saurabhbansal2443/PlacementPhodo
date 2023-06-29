public class PrintMaze {
    public static void main(String[] args) {
        int sr =0;
        int sc =0;
        int dr = 2;
        int dc  = 2;


        printMazePath(sr, sc, dr, dc , "");

    }

    public static void printMazePath(int sr , int sc , int dr , int dc , String path){
    
        if( sr>dr  ||  sc>dc){
            return ;
        }else if (sr==dr && sc == dc){
            System.out.println(path);
            return;
        }

        printMazePath(sr, sc+1, dr, dc, path+"H");
        printMazePath(sr+1, sc, dr, dc, path+"V");


    }
}
