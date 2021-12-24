public class Arvore {

    public static void obterMensagem(){

        System.out.println ("                 *");
        System.out.println ("                ** F");
        System.out.println ("               **** E");
        System.out.println ("              ****** L");
        System.out.println ("             ******** I");
        System.out.println ("            ********** Z");
        System.out.println ("           ************ *");
        System.out.println ("          ************** N");
        System.out.println ("         **************** A");
        System.out.println ("        ****************** T");
        System.out.println ("       ******************** A");
        System.out.println ("      ********************** L");
        System.out.println ("     ************************ *");
        System.out.println ("    ************************** D");
        System.out.println ("   **************************** E");
        System.out.println ("  ****************************** V");
        System.out.println (" ******************************** S");
        System.out.println ("            ***********"           );
        System.out.println ("            ***********"           );
        System.out.println ("    ****    ***********       ****");
        System.out.println ("    ****    ***********       ****");
    }

    public static void obterMensagem2(){
        int asteristico = 1;
        int pos = 17;

        for (int i = 0; i < 17; i++) {
            for (int j = 1; j <= 32; j++) {
                if (j == pos) {
                    for (int m = 1; m <= asteristico; m++) {
                        System.out.print("*");
                    }
                    asteristico = asteristico + 2;
                    pos--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int x = 1; x <= 2; x++) {
            System.out.println("          ***********");
        }

        for (int y = 1; y <= 2; y++) {
            System.out.println("  ****    ***********       ****");
        }

        System.out.println("__________________________________");
        System.out.println("          FELIZ NATAL           ");
    }
}
