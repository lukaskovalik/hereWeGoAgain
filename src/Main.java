import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String m = "    #####              #   #              #$  #            ###  $##           #  $ $ #         ### # ## #   #######   # ## #####  ..## $  $          ..###### ### #@##  ..#    #     #########    #######        ";
        int col = 11;
        int row = 19;

        int playerIndex = m.indexOf('@');
        int x = playerIndex % row;
        int y = playerIndex / row;

        char[] mapArray = m.toCharArray();
        Scanner scanner = new Scanner(System.in);

        while(true){
            //nacitanie mapy
            for(int i=0; i<m.length(); i++) {
                System.out.print(mapArray[i]);
                if ((i + 1) % row == 0) {
                    System.out.println();
                }
            }
            //nacitanie vstupu
            System.out.print("pohyb hraca (WSAD): ");
            char input = scanner.next().charAt(0);
            int nextIndex = playerIndex;
            int afterNextIndex = nextIndex;

            if(input == 'w') {
                nextIndex = playerIndex - row;
                afterNextIndex = nextIndex - row;
            } else if (input == 's') {
                nextIndex = playerIndex + row;
                afterNextIndex = nextIndex + row;
            } else if (input == 'a') {
                nextIndex = playerIndex - 1;
                afterNextIndex = nextIndex -1;
            } else if (input == 'd') {
                nextIndex = playerIndex + 1;
                afterNextIndex = nextIndex + 1;
            } else {
                continue;
            }
            //samotny pohyb hraca
            if (mapArray[nextIndex] == '$') {
                if(mapArray[afterNextIndex] == ' ' || mapArray[afterNextIndex] == '.'){
                    mapArray[playerIndex] = ' ';
                    mapArray[nextIndex] = '@';
                    mapArray[afterNextIndex] = '$';
                    playerIndex = nextIndex;
                }
            }

            else if (mapArray[nextIndex] != '#'){
                mapArray[playerIndex] = ' ';
                mapArray[nextIndex] = '@';
                playerIndex = nextIndex;
            }
        }
    }
}