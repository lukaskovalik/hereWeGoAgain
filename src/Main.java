public class Main {
    public static void main(String[] args){
        mapaPrint();
    }
    static void mapaPrint () {
        String mapa = "    #####              #   #              #$  #            ###  $##           #  $ $ #         ### # ## #   #######   # ## #####  ..## $  $          ..###### ### #@##  ..#    #     #########    #######        ";
        int col = 11;
        int row = 19;

        for(int i=0; i<mapa.length(); i++) {
            System.out.print(mapa.charAt(i));
            if ((i + 1) % row == 0) {
                System.out.println();
            }
        }
    }
}
