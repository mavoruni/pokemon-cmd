package main;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class pokemon {

    static void espera(int seg) {
        try {
            TimeUnit.MILLISECONDS.sleep(seg);
        } catch (InterruptedException e) {
            System.err.println("houve um erro: " + e.getMessage());
        }
    }
    
    static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
    
    static void limpatela() throws IOException, InterruptedException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }

    static void ascii(int a) {
        if (a == 1) { //bulbassauro
            System.out.println("""
                                                                          /
                                                       _,.------....___,.' ',.-.
                                                    ,-'          _,.--"        |
                                                  ,'         _.-'              .
                                                 /   ,     ,'                   `
                                                .   /     /                     ``.
                                                |  |     .                       \\.\\
                                      ____      |___._.  |       __               \\ `.
                                    .'    `---""       ``"-.--"'`  \\               .  \\
                                   .  ,            __               `              |   .
                                   `,'         ,-"'  .               \\             |    L
                                  ,'          '    _.'                -._          /    |
                                 ,`-.    ,".   `--'                      >.      ,'     |
                                . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'
                                ||:, .           ,'  ;  /  / \\ `        `.    .      .'/
                                j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /
                               / L:_  |                 .  "' :_;                `.'.'
                               .    ""'                  \"\"\"""'                    V
                                `.                                 .    `.   _,..  `
                                  `,_   .    .                _,-'/    .. `,'   __  `
                                   ) \\`._        ___....----"'  ,'   .'  \\ |   '  \\  .
                                  /   `. "`-.--"'         _,' ,'     `---' |    `./  |
                                 .   _  `""'--.._____..--"   ,             '         |
                                 | ." `. `-.                /-.           /          ,
                                 | `._.'    `,_            ;  /         ,'          .
                                .'          /| `-.        . ,'         ,           ,
                                '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'
                                `"^--'..'   '-`-^-'"--    `-^-'`.''\"\"\"""`.,^.`.--'""");
        } else if (a==2) { //charmander
            System.out.println("""
                                             _.--""`-..
                                           ,'          `.
                                         ,'          __  `.
                                        /|          " __   \\
                                       , |           / |.   .
                                       |,'          !_.'|   |
                                     ,'             '   |   |
                                    /              |`--'|   |
                                   |                `---'   |
                                    .   ,                   |                       ,".
                                     ._     '           _'  |                    , ' \\ `
                                 `.. `.`-...___,...---""    |       __,.        ,`"   L,|
                                 |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\
                               -:..     `. `-..--_.,.<       `"      / `.        `-/ |   .
                                 `,         \"\"""'     `.              ,'         |   |  ',,
                                   `.      '            '            /          '    |'. |/
                                     `.   |              \\       _,-'           |       ''
                                       `._'               \\   '"\\                .      |
                                          |                '     \\                `._  ,'
                                          |                 '     \\                 .'|
                                          |                 .      \\                | |
                                          |                 |       L              ,' |
                                          `                 |       |             /   '
                                           \\                |       |           ,'   /
                                         ,' \\               |  _.._ ,-..___,..-'    ,'
                                        /     .             .      `!             ,j'
                                       /       `.          /        .           .'/
                                      .          `.       /         |        _.'.'
                                       `.          7`'---'          |------"'_.'
                                      _,.`,_     _'                ,''-----"'
                                  _,-_    '       `.     .'      ,\\
                                  -" /`.         _,'     | _  _  _.|
                                   ""--'---\"\"\"""'        `' '! |! /
                                                           `" " -'""");
        } else if (a==3) { //squirtle
            System.out.println("""
                                              _,........__
                                           ,-'            "`-.
                                         ,'                   `-.
                                       ,'                        \\
                                     ,'                           .
                                     .'\\               ,"".       `
                                    ._.'|             / |  `       \\
                                    |   |            `-.'  ||       `.
                                    |   |            '-._,'||       | \\
                                    .`.,'             `..,'.'       , |`-.
                                    l                       .'`.  _/  |   `.
                                    `-.._'-   ,          _ _'   -" \\  .     `
                               `.\"\"\"""'-.`-...,---------','         `. `....__.
                               .'        `"-..___      __,'\\          \\  \\     \\
                               \\_ .          |   `\"\"""'    `.           . \\     \\
                                 `.          |              `.          |  .     L
                                   `.        |`--...________.'.        j   |     |
                                     `._    .'      |          `.     .|   ,     |
                                        `--,\\       .            `7""' |  ,      |
                                           ` `      `            /     |  |      |    _,-'\"""`-.
                                            \\ `.     .          /      |  '      |  ,'          `.
                                             \\  v.__  .        '       .   \\    /| /              \\
                                              \\/    `""\\\"\"\"\"\"""`.       \\   \\  /.''                |
                                               `        .        `._ ___,j.  `/ .-       ,---.     |
                                               ,`-.      \\         ."     `.  |/        j     `    |
                                              /    `.     \\       /         \\ /         |     /    j
                                             |       `-.   7-.._ .          |"          '         /
                                             |          `./_    `|          |            .     _,'
                                             `.           / `----|          |-............`---'
                                               \\          \\      |          |
                                              ,'           )     `.         |
                                               7____,,..--'      /          |
                                                                 `---.__,--.'""");
        }
    }
    
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scan = new Scanner(System.in);
        
        // variaveis
        int menu = 0, pokemon = 0, oponente = 0;
        String enter = "a";
        String TYPE1 = "";
        int HP1 = 0, ATK1 = 0, DEF1 = 0, SPD1 = 0;
        String TYPE2 = "";
        int HP2 = 0, ATK2 = 0, DEF2 = 0, SPD2 = 0;
        int Player = 0, Enemy = 0;
        
        
        while (menu>=0 && menu<4) {
            while (menu == 0) {
                limpatela();
                espera(500);
                System.out.println("                    um remake não-oficial de");
                espera(1000);
                System.out.println("""
                                                                     ,'\\
                                       _.----.        ____         ,'  _\\   ___    ___     ____
                                   _,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.
                                   \\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |
                                    \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |
                                      \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |
                                       \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |
                                        \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |
                                         \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |
                                          \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |
                                           \\_.-'       |__|    `-._ |              '-.|     '-.| |   |
                                                                   `'                            '-._|""");
                espera(1000);
                System.out.println("");
                System.out.println("\n                  1 - Jogar\n                  2 - Como jogar\n                  3 - Sobre\n                  4 - Sair");
                System.out.println();
                System.out.println();
                menu = scan.nextInt();
                while (menu>4 || menu<1) {
                    menu = scan.nextInt();
                }
            }


            while (menu == 1) {
                // jogando
                limpatela();
                System.out.println(" > ESCOLHA SEU POKEMON!");
                espera(1000);
                System.out.println();
                System.out.println();
                System.out.println("""
                                     _               _   _                                                        
                                    | |__    _   _  | | | |__     __ _   ___   ___    __ _   _   _   _ __    ___  
                                    | '_ \\  | | | | | | | '_ \\   / _` | / __| / __|  / _` | | | | | | '__|  / _ \\ 
                                    | |_) | | |_| | | | | |_) | | (_| | \\__ \\ \\__ \\ | (_| | | |_| | | |    | (_) |
                                    |_.__/   \\__,_| |_| |_.__/   \\__,_| |___/ |___/  \\__,_|  \\__,_| |_|     \\___/ 
                                                                                                                  """);
                System.out.println("Tipo: Planta e veneno   HP: 45    ATK: 49    DEF: 49    SPD: 45");
                ascii(1);
                espera(12*00);
                System.out.println();
                System.out.println();
                System.out.println("""
                                            _                                                      _               
                                      ___  | |__     __ _   _ __   _ __ ___     __ _   _ __     __| |   ___   _ __ 
                                     / __| | '_ \\   / _` | | '__| | '_ ` _ \\   / _` | | '_ \\   / _` |  / _ \\ | '__|
                                    | (__  | | | | | (_| | | |    | | | | | | | (_| | | | | | | (_| | |  __/ | |   
                                     \\___| |_| |_|  \\__,_| |_|    |_| |_| |_|  \\__,_| |_| |_|  \\__,_|  \\___| |_|   
                                                                                                                   """);
                System.out.println("Tipo: Fogo   HP: 39    ATK: 52    DEF: 43    SPD: 65");
                ascii(2);
                espera(12*00);
                System.out.println();
                System.out.println();
                System.out.println("""
                                                           _          _     _        
                                     ___    __ _   _   _  (_)  _ __  | |_  | |   ___ 
                                    / __|  / _` | | | | | | | | '__| | __| | |  / _ \\
                                    \\__ \\ | (_| | | |_| | | | | |    | |_  | | |  __/
                                    |___/  \\__, |  \\__,_| |_| |_|     \\__| |_|  \\___|
                                              |_|                                    """);
                System.out.println("Tipo: Água   HP: 44    ATK: 48    DEF: 65    SPD: 43");
                ascii(3);
                espera(1000);
                System.out.print("\n\n\n\n\n\n\n\n\n > Pokemon escolhido: ");
                pokemon = scan.nextInt();
                while (pokemon<1 || pokemon>3) {
                    System.out.println("Invalido - digite outro numero:");
                    pokemon = scan.nextInt();
                }
                switch (pokemon) {
                        case 1:
                            System.out.println(" > Seu pokemon é Bulbassauro!");
                            Player = 1;
                            break;
                        case 2:
                            System.out.println(" > Seu pokemon é Charmander!");
                            Player = 2;
                            break;
                        case 3:
                            System.out.println(" > Seu pokemon é Squirtle!");
                            Player = 3;
                            break;
                    }

                espera(800);
                System.out.println();
                System.out.println(" > Escolha o oponente: \n   1 - Bulbassauro\n   2 - Charmander\n   3 - Squirtle\n   4 - Aleatório");
                System.out.println();
                oponente = scan.nextInt();
                while (oponente<1 || oponente>4) {
                    System.out.println("Invalido - digite outro numero:");
                    oponente = scan.nextInt();
                }
                System.out.println();            
                if (oponente == 4) {
                    System.out.println(" > Selecionando oponente...");
                    espera(2000);
                    oponente = random(1,3);
                    switch (oponente) {
                        case 1:
                            System.out.println(" > Seu oponente é Bulbassauro!");
                            Enemy = 1;
                            break;
                        case 2:
                            System.out.println(" > Seu oponente é Charmander!");
                            Enemy = 2;
                            break;
                        case 3:
                            System.out.println(" > Seu oponente é Squirtle!");
                            Enemy = 3;
                            break;
                    }
                } else {
                    switch (oponente) {
                        case 1:
                            System.out.println(" > Seu oponente é Bulbassauro!");
                            Enemy = 1;
                            break;
                        case 2:
                            System.out.println(" > Seu oponente é Charmander!");
                            Enemy = 2;
                            break;
                        case 3:
                            System.out.println(" > Seu oponente é Squirtle!");
                            Enemy = 3;
                            break;
                    }
                }

                System.out.println();
                System.out.println(" > Pressione enter para começar...");
                enter = scan.nextLine();
                enter = scan.nextLine();
                System.out.print("   Começando!");
                espera(1000);
                limpatela();

                String NOME1 = "", NOME2 = "";

                switch (Player) {
                    case 1:
                        NOME1 = "Bulbassauro";
                        TYPE1 = "Planta";
                        HP1 = 45;
                        ATK1 = 49;
                        DEF1 = 49;
                        SPD1 = 45;
                        break;
                    case 2:
                        NOME1 = "Charmander";
                        TYPE1 = "Fogo";
                        HP1 = 39;
                        ATK1 = 52;
                        DEF1 = 43;
                        SPD1 = 65;
                        break;
                    case 3:
                        NOME1 = "Squirtle";
                        TYPE1 = "Agua";
                        HP1 = 44;
                        ATK1 = 48;
                        DEF1 = 65;
                        SPD1 = 43;
                        break;
                }

                switch (Enemy) {
                    case 1:
                        NOME2 = "Bulbassauro";
                        TYPE2 = "Planta";
                        HP2 = 45;
                        ATK2 = 49;
                        DEF2 = 49;
                        SPD2 = 45;
                        break;
                    case 2:
                        NOME2 = "Charmander";
                        TYPE2 = "Fogo";
                        HP2 = 39;
                        ATK2 = 52;
                        DEF2 = 43;
                        SPD2 = 65;
                        break;
                    case 3:
                        NOME2 = "Squirtle";
                        TYPE2 = "Agua";
                        HP2 = 44;
                        ATK2 = 48;
                        DEF2 = 65;
                        SPD2 = 43;
                        break;
                }

                espera(1000);
                ascii(Enemy);
                System.out.println("\n         !! UM "+NOME2.toUpperCase()+" SELVAGEM APARECE !!");
                for (int i=0 ; i<10 ; i++) {
                    limpatela();
                    espera(80);
                    ascii(Enemy);
                    System.out.println("\n         !! UM "+NOME2.toUpperCase()+" SELVAGEM APARECE !!");
                    espera(80);
                }
                espera(12*00);
                limpatela();

                System.out.println("  > "+NOME1+", eu escolho você!\n");
                espera(1000);
                ascii(Player);
                for (int i=0 ; i<4 ; i++) {
                    espera(200);
                    limpatela();
                    System.out.println("  > "+NOME1+", eu escolho você!\n");
                    System.out.println("");
                    ascii(Player);
                    espera(200);
                    limpatela();
                    System.out.println("  > "+NOME1+", eu escolho você!\n");
                    ascii(Player);
                }
                limpatela();

                espera(500);
                ascii(Player);
                System.out.println(" > Stats do seu pokemon:");
                System.out.println("   Tipo: "+TYPE1+"   HP: "+HP1+"   ATK: "+ATK1+"   DEF: "+DEF1+"   SPD: "+SPD1);
                System.out.println();
                System.out.println();
                espera(2000);
                ascii(Enemy);
                System.out.println("\n\n\n > Stats do seu oponente:");
                System.out.println("   Tipo: "+TYPE2+"   HP: "+HP2+"   ATK: "+ATK2+"   DEF: "+DEF2+"   SPD: "+SPD2);
                System.out.println();
                System.out.println();
                espera(1000);
                System.out.println("\n > Pressione enter para continuar...");
                enter = scan.nextLine();
                limpatela();
                espera(500);

                
                boolean veneno1 = false, veneno2 = false, queima1 = false, queima2 = false, flinch1 = false, flinch2 = false;
                int ataque = 0;
                double DMG = 0;
                
                //CALCULO BASICO DO DANO: (DANO DO ATAQUE * (ATK*0.03))-DEF/26      PARA MESMO TIPO E ATAQUES NORMAIS
                //CALCULO EFICIENTE: ((DANO DO ATAQUE * (ATK*0.03))*1.2)-DEF/26      PLAYER COUNTER
                //CALCULO INEFICIENTE: (DANO DO ATAQUE * (ATK*0.03))*0.6)-DEF/26       ENEMY COUNTER
                //usar Math.round()
                
                
                    if (SPD1>SPD2) {
                    while (HP2>0 && HP1>0) {
                        limpatela();
                        System.out.println(" > Sua vez!");
                        espera(800);
                        System.out.println("\n");
                        ascii(Player);
                        System.out.println("  HP: "+HP1+"   ATK: "+ATK1+"   DEF: "+DEF1+"   SPD: "+SPD1);
                        espera(800);
                        if (flinch1 == false) {
                            if (veneno1 == true) {
                                System.out.println(NOME1+" está envenenado! Perdeu 1HP");
                                HP1-=1;
                            } else if (queima1 == true) {
                                System.out.println(NOME1+" está queimando! Perdeu 1HP");
                                HP1-=1;
                            }
                            System.out.println("\n > Escolha seu ataque: ");
                            switch(Player) {
                                case 1:
                                    //bulbassauro
                                    //ataques: investida    chicote de vinha    folha navalha    nevoa de veneno
                                    //movimento: crescimento
                                    System.out.println("\n 1 - Investida (normal)\n 2 - Chicote de vinha (planta)\n 3 - Folha navalha (planta)\n 4 - Crescimento (normal)");
                                    ataque = scan.nextInt();
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nBulbassauro usou Investida!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK1*0.03)-(DEF2*0.2));
                                            HP2 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        case 2:
                                            System.out.println("\nBulbassauro usou Chicote de vinha!");
                                            //planta sem efeito
                                            espera(800);
                                            if ("Planta".equals(TYPE2)){
                                                DMG = Math.abs(20*(ATK1*0.03)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("\nBulbassauro usou Folha navalha!");
                                            //planta chance de critico
                                            espera(800);
                                            if (random(1,3)==1) {
                                                if ("Planta".equals(TYPE2)){
                                                    DMG = Math.abs(25*(ATK1*0.03)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico!");
                                                    DMG = 0;
                                                } else if ("Fogo".equals(TYPE2)) {
                                                    DMG = Math.abs(((25*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico! Foi um ataque fraco...");
                                                    DMG = 0;
                                                } else if ("Agua".equals(TYPE2)) {
                                                    DMG = Math.abs(((25*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico! Foi um ataque forte!");
                                                    DMG = 0;
                                                }
                                            } else {
                                                if ("Planta".equals(TYPE2)){
                                                    DMG = Math.abs(22*(ATK1*0.03)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano!");
                                                    DMG = 0;
                                                } else if ("Fogo".equals(TYPE2)) {
                                                    DMG = Math.abs(((22*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                    DMG = 0;
                                                } else if ("Agua".equals(TYPE2)) {
                                                    DMG = Math.abs(((22*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                    DMG = 0;
                                                }
                                            }
                                            break;
                                        case 4:
                                        //     System.out.println("\nBulbassauro usou Névoa de veneno!");
                                        //     //envenena, perde hp por turno
                                        //     espera(800);
                                        //     if ("Planta".equals(TYPE2)){
                                        //         DMG = Math.abs(((20*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                        //         HP2 -= DMG;
                                        //         System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                        //         DMG = 0;
                                        //     } else {
                                        //         DMG = Math.abs(20*(ATK1*0.03)-(DEF2*0.2));
                                        //         HP2 -= DMG;
                                        //         System.out.println("\nCausou "+DMG+" de dano!");
                                        //         DMG = 0;
                                        //     }
                                        //     System.out.println(NOME2+" está envenenado! Causa 1 dano por turno.");
                                        //     veneno2=true;
                                        //     break;
                                        // case 5:
                                            System.out.println("\nBulbassauro usou Crescimento!");
                                            //aumenta o dano
                                            espera(800);
                                            System.out.println("Seu ATK aumentou!");
                                            ATK1 += 5;
                                            break;

                                    }
                                    break;
                                case 2:
                                    //CHARMANDER
                                    //ataques: arranhar    chama    cauda de chamas    rugir
                                    System.out.println("\n 1 - Arranhão (normal)\n 2 - Chamas (fogo)\n 3 - Presas de fogo (fogo)\n 4 - Rugido (normal)");
                                    ataque = scan.nextInt();
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nCharmander usou Arranhão!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK1*0.03)-(DEF2*0.2));
                                            HP2 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        case 2:
                                            System.out.println("\nCharmander usou Chamas!");
                                            //chance de queimar
                                            espera(800);
                                            if ("Fogo".equals(TYPE2)){
                                                DMG = Math.abs(20*(ATK1*0.03)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            if (random(1,3)==1) {
                                                System.out.println(NOME2+" está queimando! Causa 1 dano por turno.");
                                                queima2=true;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("\nCharmander usou Presas de fogo!");
                                            //chance de queimar, chance de intimidar
                                            espera(800);
                                            if ("Fogo".equals(TYPE2)){
                                                DMG = Math.abs(22*(ATK1*0.03)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE2)) {
                                                DMG = Math.abs(((22*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE2)) {
                                                DMG = Math.abs(((22*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            if (random(1,3)==1) {
                                                System.out.println(NOME2+" está queimando! Causa 1 dano por turno.");
                                                queima2=true;
                                            }
                                            if (random(1,3)==1) {
                                                System.out.println(NOME2+" está intimidado! Não fará movimentos no próximo turno.");
                                                flinch2=true;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("\nCharmander usou Rugido!");
                                            //diminui o ataque
                                            espera(800);
                                            DMG = Math.abs(12*(ATK1*0.03)-(DEF2*0.2));
                                            HP2 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano! ATK de "+NOME2+" caiu!");
                                            ATK2 -=6;
                                            DMG = 0;
                                            break;
                                    }
                                    break;
                                case 3:
                                    //squirtle
                                    //ataques: investida    chicote de cauda    bolhas    revolver dagua
                                    //movimento: recolher
                                    System.out.println("\n 1 - Investida (normal)\n 2 - Bolhas (água)\n 3 - Revólver d'agua (água)\n 4 - Recolher (água)");
                                    ataque = scan.nextInt();
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nSquirtle usou Investida!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK1*0.03)-(DEF2*0.2));
                                            HP2 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        // case 2:
                                        //     System.out.println("\nSquirtle usou Chicote de cauda!");
                                        //     //diminui defesa
                                        //     espera(800);
                                        //     espera(800);
                                        //     DMG = Math.abs(12*(ATK1*0.03)-(DEF2*0.2));
                                        //     HP2 -= DMG;
                                        //     System.out.println("\nCausou "+DMG+" de dano! DEF de "+NOME2+" caiu!");
                                        //     DEF2 -=8;
                                        //     DMG = 0;
                                        //     break;
                                        case 2:
                                            System.out.println("\nSquirtle usou Bolhas!");
                                            //diminui velocidade por um turno
                                            espera(800);
                                            if ("Agua".equals(TYPE2)){
                                                DMG = Math.abs(20*(ATK1*0.03)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            System.out.println("SPD de "+NOME2+" caiu!");
                                            SPD2 -=8;
                                            break;
                                        case 3:
                                            System.out.println("\nSquirtle usou Revólver d'agua!");
                                            espera(800);
                                            if ("Agua".equals(TYPE2)){
                                                DMG = Math.abs(22*(ATK1*0.03)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE2)) {
                                                DMG = Math.abs(((22*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE2)) {
                                                DMG = Math.abs(((22*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("\nSquirtle usou Recolher!");
                                            //aumenta defesa no prox turno
                                            espera(800);
                                            System.out.println("Sua DEF aumentou!");
                                            DEF1 += 8;
                                            break;
                                    }
                                    break;                            
                            }
                        } else {
                            System.out.println(" > "+NOME1+" está intimidado! Não fará movimentos neste turno.");
                            flinch1 = false;
                        }
                        
                        espera(1000);
                        System.out.println("\n > Pressione enter para continuar...");
                        enter = scan.nextLine();
                        enter = scan.nextLine();
                        limpatela();
                        
                        
                        //OPONENTE
                        limpatela();
                        System.out.println(" > Vez do oponente!");
                        espera(800);
                        System.out.println("\n");
                        ascii(Enemy);
                        System.out.println("  HP: "+HP2+"   ATK: "+ATK2+"   DEF: "+DEF2+"   SPD: "+SPD2);
                        espera(800);
                        if (flinch2 == false) {
                            if (veneno2 == true) {
                                System.out.println(NOME2+" está envenenado! Perdeu 1HP");
                                HP2-=1;
                            } else if (queima2 == true) {
                                System.out.println(NOME2+" está queimando! Perdeu 1HP");
                                HP2-=1;
                            }
                            //System.out.println("\n > Escolha seu ataque: ");
                            switch(Enemy) {
                                case 1:
                                    //bulbassauro
                                    //ataques: investida    chicote de vinha    folha navalha    nevoa de veneno
                                    //movimento: crescimento
                                    //System.out.println("\n 1 - Investida (normal)\n 1 - Chicote de vinha (planta)\n 3 - Folha navalha (planta)\n 4 - Névoa de veneno (veneno)\n 5 - Crescimento (normal)");
                                    ataque = random(1,5);
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nBulbassauro usou Investida!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK2*0.03)-(DEF1*0.2));
                                            HP1 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        case 2:
                                            System.out.println("\nBulbassauro usou Chicote de vinha!");
                                            //planta sem efeito
                                            espera(800);
                                            if ("Planta".equals(TYPE1)){
                                                DMG = Math.abs(20*(ATK2*0.03)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("\nBulbassauro usou Folha navalha!");
                                            //planta chance de critico
                                            espera(800);
                                            if (random(1,5)==1) {
                                                if ("Planta".equals(TYPE1)){
                                                    DMG = Math.abs(25*(ATK2*0.03)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico!");
                                                    DMG = 0;
                                                } else if ("Fogo".equals(TYPE1)) {
                                                    DMG = Math.abs(((25*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico! Foi um ataque fraco...");
                                                    DMG = 0;
                                                } else if ("Agua".equals(TYPE1)) {
                                                    DMG = Math.abs(((25*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico! Foi um ataque forte!");
                                                    DMG = 0;
                                                }
                                            } else {
                                                if ("Planta".equals(TYPE1)){
                                                    DMG = Math.abs(22*(ATK2*0.03)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano!");
                                                    DMG = 0;
                                                } else if ("Fogo".equals(TYPE1)) {
                                                    DMG = Math.abs(((22*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                    DMG = 0;
                                                } else if ("Agua".equals(TYPE1)) {
                                                    DMG = Math.abs(((22*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                    DMG = 0;
                                                }
                                            }
                                            break;
                                        case 4:
                                        //     System.out.println("\nBulbassauro usou Névoa de veneno!");
                                        //     //envenena, perde hp por turno
                                        //     espera(800);
                                        //     if ("Planta".equals(TYPE1)){
                                        //         DMG = Math.abs(((20*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                        //         HP1 -= DMG;
                                        //         System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                        //         DMG = 0;
                                        //     } else {
                                        //         DMG = Math.abs(20*(ATK2*0.03)-(DEF1*0.2));
                                        //         HP1 -= DMG;
                                        //         System.out.println("\nCausou "+DMG+" de dano!");
                                        //         DMG = 0;
                                        //     }
                                        //     System.out.println(NOME1+" está envenenado! Causa 1 dano por turno.");
                                        //     veneno1=true;
                                        //     break;
                                        // case 5:
                                            System.out.println("\nBulbassauro usou Crescimento!");
                                            //aumenta o dano
                                            espera(800);
                                            System.out.println("Seu ATK aumentou!");
                                            ATK1 += 5;
                                            break;

                                    }
                                    break;
                                case 2:
                                    //CHARMANDER
                                    //ataques: arranhar    chama    cauda de chamas    rugir
                                    //System.out.println("\n 1 - Arranhão (normal)\n 1 - Chamas (fogo)\n 3 - Presas de fogo (fogo)\n 4 - Rugido (normal)");
                                    ataque = random(1,4);
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nCharmander usou Arranhão!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK2*0.03)-(DEF1*0.2));
                                            HP1 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        case 2:
                                            System.out.println("\nCharmander usou Chamas!");
                                            //chance de queimar
                                            espera(800);
                                            if ("Fogo".equals(TYPE1)){
                                                DMG = Math.abs(20*(ATK2*0.03)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            if (random(1,5)==1) {
                                                System.out.println(NOME1+" está queimando! Causa 1 dano por turno.");
                                                queima1=true;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("\nCharmander usou Presas de fogo!");
                                            //chance de queimar, chance de intimidar
                                            espera(800);
                                            if ("Fogo".equals(TYPE1)){
                                                DMG = Math.abs(22*(ATK2*0.03)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE1)) {
                                                DMG = Math.abs(((22*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE1)) {
                                                DMG = Math.abs(((22*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            if (random(1,5)==1) {
                                                System.out.println(NOME1+" está queimando! Causa 1 dano por turno.");
                                                queima1=true;
                                            }
                                            if (random(1,5)==1) {
                                                System.out.println(NOME1+" está intimidado! Não fará movimentos no próximo turno.");
                                                flinch1=true;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("\nCharmander usou Rugido!");
                                            //diminui o ataque
                                            espera(800);
                                            DMG = Math.abs(12*(ATK2*0.03)-(DEF1*0.2));
                                            HP1 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano! ATK de "+NOME1+" caiu!");
                                            ATK1 -=6;
                                            DMG = 0;
                                            break;
                                    }
                                    break;
                                case 3:
                                    //squirtle
                                    //ataques: investida    chicote de cauda    bolhas    revolver dagua  recolher
                                    //System.out.println("\n 1 - Investida (normal)\n 1 - Chicote de cauda (normal)\n 3 - Bolhas (água)\n 4 - Revólver d'agua (água)\n 5 - Recolher (água)");
                                    ataque = random(1,5);
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nSquirtle usou Investida!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK2*0.03)-(DEF1*0.2));
                                            HP1 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        // case 2:
                                        //     System.out.println("\nSquirtle usou Chicote de cauda!");
                                        //     //diminui defesa
                                        //     espera(800);
                                        //     espera(800);
                                        //     DMG = Math.abs(12*(ATK2*0.03)-(DEF1*0.2));
                                        //     HP1 -= DMG;
                                        //     System.out.println("\nCausou "+DMG+" de dano! DEF de "+NOME1+" caiu!");
                                        //     DEF1 -=8;
                                        //     DMG = 0;
                                        //     break;
                                        case 2:
                                            System.out.println("\nSquirtle usou Bolhas!");
                                            //diminui velocidade por um turno
                                            espera(800);
                                            if ("Agua".equals(TYPE1)){
                                                DMG = Math.abs(20*(ATK2*0.03)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            System.out.println("SPD de "+NOME1+" caiu!");
                                            SPD1 -=8;
                                            break;
                                        case 3:
                                            System.out.println("\nSquirtle usou Revólver d'agua!");
                                            espera(800);
                                            if ("Agua".equals(TYPE1)){
                                                DMG = Math.abs(22*(ATK2*0.03)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE1)) {
                                                DMG = Math.abs(((22*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE1)) {
                                                DMG = Math.abs(((22*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("\nSquirtle usou Recolher!");
                                            //aumenta defesa no prox turno
                                            espera(800);
                                            System.out.println("Sua DEF aumentou!");
                                            DEF2 += 8;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            System.out.println(" > "+NOME2+" está intimidado! Não fará movimentos neste turno.");
                            flinch2 = false;
                        }
                    
                        
                    espera(1000);
                    System.out.println("\n > Pressione enter para continuar...");
                    enter = scan.nextLine();
                    limpatela();
                        
                    }   
                        
                        //OPONENTE
                    } else {
                        while (HP1>0 && HP2>0) {
                        //OPONENTE
                        limpatela();
                        System.out.println(" > Vez do oponente!");
                        espera(800);
                        System.out.println("\n");
                        ascii(Enemy);
                        System.out.println("  HP: "+HP2+"   ATK: "+ATK2+"   DEF: "+DEF2+"   SPD: "+SPD2);
                        espera(800);
                        if (flinch2 == false) {
                            if (veneno2 == true) {
                                System.out.println(NOME2+" está envenenado! Perdeu 1HP");
                                HP2-=1;
                            } else if (queima2 == true) {
                                System.out.println(NOME2+" está queimando! Perdeu 1HP");
                                HP2-=1;
                            }
                            //System.out.println("\n > Escolha seu ataque: ");
                            switch(Enemy) {
                                case 1:
                                    //bulbassauro
                                    //ataques: investida    chicote de vinha    folha navalha    nevoa de veneno
                                    //movimento: crescimento
                                    //System.out.println("\n 1 - Investida (normal)\n 1 - Chicote de vinha (planta)\n 3 - Folha navalha (planta)\n 4 - Névoa de veneno (veneno)\n 5 - Crescimento (normal)");
                                    ataque = random(1,5);
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nBulbassauro usou Investida!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK2*0.03)-(DEF1*0.2));
                                            HP1 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        case 2:
                                            System.out.println("\nBulbassauro usou Chicote de vinha!");
                                            //planta sem efeito
                                            espera(800);
                                            if ("Planta".equals(TYPE1)){
                                                DMG = Math.abs(20*(ATK2*0.03)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("\nBulbassauro usou Folha navalha!");
                                            //planta chance de critico
                                            espera(800);
                                            if (random(1,5)==1) {
                                                if ("Planta".equals(TYPE1)){
                                                    DMG = Math.abs(25*(ATK2*0.03)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico!");
                                                    DMG = 0;
                                                } else if ("Fogo".equals(TYPE1)) {
                                                    DMG = Math.abs(((25*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico! Foi um ataque fraco...");
                                                    DMG = 0;
                                                } else if ("Agua".equals(TYPE1)) {
                                                    DMG = Math.abs(((25*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico! Foi um ataque forte!");
                                                    DMG = 0;
                                                }
                                            } else {
                                                if ("Planta".equals(TYPE1)){
                                                    DMG = Math.abs(22*(ATK2*0.03)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano!");
                                                    DMG = 0;
                                                } else if ("Fogo".equals(TYPE1)) {
                                                    DMG = Math.abs(((22*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                    DMG = 0;
                                                } else if ("Agua".equals(TYPE1)) {
                                                    DMG = Math.abs(((22*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                    HP1 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                    DMG = 0;
                                                }
                                            }
                                            break;
                                        case 4:
                                        //     System.out.println("\nBulbassauro usou Névoa de veneno!");
                                        //     //envenena, perde hp por turno
                                        //     espera(800);
                                        //     if ("Planta".equals(TYPE1)){
                                        //         DMG = Math.abs(((20*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                        //         HP1 -= DMG;
                                        //         System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                        //         DMG = 0;
                                        //     } else {
                                        //         DMG = Math.abs(20*(ATK2*0.03)-(DEF1*0.2));
                                        //         HP1 -= DMG;
                                        //         System.out.println("\nCausou "+DMG+" de dano!");
                                        //         DMG = 0;
                                        //     }
                                        //     System.out.println(NOME1+" está envenenado! Causa 1 dano por turno.");
                                        //     veneno1=true;
                                        //     break;
                                        // case 5:
                                            System.out.println("\nBulbassauro usou Crescimento!");
                                            //aumenta o dano
                                            espera(800);
                                            System.out.println("Seu ATK aumentou!");
                                            ATK2 += 5;
                                            break;

                                    }
                                    break;
                                case 2:
                                    //CHARMANDER
                                    //ataques: arranhar    chama    cauda de chamas    rugir
                                    //System.out.println("\n 1 - Arranhão (normal)\n 1 - Chamas (fogo)\n 3 - Presas de fogo (fogo)\n 4 - Rugido (normal)");
                                    ataque = random(1,4);
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nCharmander usou Arranhão!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK2*0.03)-(DEF1*0.2));
                                            HP1 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        case 2:
                                            System.out.println("\nCharmander usou Chamas!");
                                            //chance de queimar
                                            espera(800);
                                            if ("Fogo".equals(TYPE1)){
                                                DMG = Math.abs(20*(ATK2*0.03)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            if (random(1,5)==1) {
                                                System.out.println(NOME1+" está queimando! Causa 1 dano por turno.");
                                                queima1=true;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("\nCharmander usou Presas de fogo!");
                                            //chance de queimar, chance de intimidar
                                            espera(800);
                                            if ("Fogo".equals(TYPE1)){
                                                DMG = Math.abs(22*(ATK2*0.03)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE1)) {
                                                DMG = Math.abs(((22*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE1)) {
                                                DMG = Math.abs(((22*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            if (random(1,5)==1) {
                                                System.out.println(NOME1+" está queimando! Causa 1 dano por turno.");
                                                queima1=true;
                                            }
                                            if (random(1,5)==1) {
                                                System.out.println(NOME1+" está intimidado! Não fará movimentos no próximo turno.");
                                                flinch1=true;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("\nCharmander usou Rugido!");
                                            //diminui o ataque
                                            espera(800);
                                            DMG = Math.abs(12*(ATK2*0.03)-(DEF1*0.2));
                                            HP1 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano! ATK de "+NOME1+" caiu!");
                                            ATK1 -=6;
                                            DMG = 0;
                                            break;
                                    }
                                    break;
                                case 3:
                                    //squirtle
                                    //ataques: investida    chicote de cauda    bolhas    revolver dagua
                                    //movimento: recolher
                                    //System.out.println("\n 1 - Investida (normal)\n 1 - Chicote de cauda (normal)\n 3 - Bolhas (água)\n 4 - Revólver d'agua (água)\n 5 - Recolher (água)");
                                    ataque = random(1,5);
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nSquirtle usou Investida!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK2*0.03)-(DEF1*0.2));
                                            HP1 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        case 2:
                                            System.out.println("\nSquirtle usou Chicote de cauda!");
                                            //diminui defesa
                                            espera(800);
                                            espera(800);
                                            DMG = Math.abs(12*(ATK2*0.03)-(DEF1*0.2));
                                            HP1 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano! DEF de "+NOME1+" caiu!");
                                            DEF1 -=8;
                                            DMG = 0;
                                            break;
                                        case 3:
                                            System.out.println("\nSquirtle usou Bolhas!");
                                            //diminui velocidade por um turno
                                            espera(800);
                                            if ("Agua".equals(TYPE1)){
                                                DMG = Math.abs(20*(ATK2*0.03)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE1)) {
                                                DMG = Math.abs(((20*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            System.out.println("SPD de "+NOME1+" caiu!");
                                            SPD1 -=8;
                                            break;
                                        case 4:
                                            System.out.println("\nSquirtle usou Revólver d'agua!");
                                            espera(800);
                                            if ("Agua".equals(TYPE1)){
                                                DMG = Math.abs(22*(ATK2*0.03)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE1)) {
                                                DMG = Math.abs(((22*(ATK2*0.03))*0.6)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE1)) {
                                                DMG = Math.abs(((22*(ATK2*0.03))*1.2)-(DEF1*0.2));
                                                HP1 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            break;
                                        case 5:
                                            System.out.println("\nSquirtle usou Recolher!");
                                            //aumenta defesa no prox turno
                                            espera(800);
                                            System.out.println("Sua DEF aumentou!");
                                            DEF2 += 8;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            System.out.println(" > "+NOME2+" está intimidado! Não fará movimentos neste turno.");
                            flinch2 = false;
                        }
                    
                        
                    espera(1000);
                    System.out.println("\n > Pressione enter para continuar...");
                    enter = scan.nextLine();
                    limpatela();
                    
                    
                        System.out.println(" > Sua vez!");
                        espera(800);
                        System.out.println("\n");
                        ascii(Player);
                        System.out.println("  HP: "+HP1+"   ATK: "+ATK1+"   DEF: "+DEF1+"   SPD: "+SPD1);
                        espera(800);
                        if (flinch1 == false) {
                            if (veneno1 == true) {
                                System.out.println(NOME1+" está envenenado! Perdeu 1HP");
                                HP1-=1;
                            } else if (queima1 == true) {
                                System.out.println(NOME1+" está queimando! Perdeu 1HP");
                                HP1-=1;
                            }
                            System.out.println("\n > Escolha seu ataque: ");
                            switch(Player) {
                                case 1:
                                    //bulbassauro
                                    //ataques: investida    chicote de vinha    folha navalha    nevoa de veneno
                                    //movimento: crescimento
                                    System.out.println("\n 1 - Investida (normal)\n 2 - Chicote de vinha (planta)\n 3 - Folha navalha (planta)\n 4 - Névoa de veneno (veneno)\n 5 - Crescimento (normal)");
                                    ataque = scan.nextInt();
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nBulbassauro usou Investida!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK1*0.03)-(DEF2*0.2));
                                            HP2 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        case 2:
                                            System.out.println("\nBulbassauro usou Chicote de vinha!");
                                            //planta sem efeito
                                            espera(800);
                                            if ("Planta".equals(TYPE2)){
                                                DMG = Math.abs(20*(ATK1*0.03)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("\nBulbassauro usou Folha navalha!");
                                            //planta chance de critico
                                            espera(800);
                                            if (random(1,5)==1) {
                                                if ("Planta".equals(TYPE2)){
                                                    DMG = Math.abs(25*(ATK1*0.03)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico!");
                                                    DMG = 0;
                                                } else if ("Fogo".equals(TYPE2)) {
                                                    DMG = Math.abs(((25*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico! Foi um ataque fraco...");
                                                    DMG = 0;
                                                } else if ("Agua".equals(TYPE2)) {
                                                    DMG = Math.abs(((25*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um acerto crítico! Foi um ataque forte!");
                                                    DMG = 0;
                                                }
                                            } else {
                                                if ("Planta".equals(TYPE2)){
                                                    DMG = Math.abs(22*(ATK1*0.03)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano!");
                                                    DMG = 0;
                                                } else if ("Fogo".equals(TYPE2)) {
                                                    DMG = Math.abs(((22*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                    DMG = 0;
                                                } else if ("Agua".equals(TYPE2)) {
                                                    DMG = Math.abs(((22*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                    HP2 -= DMG;
                                                    System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                    DMG = 0;
                                                }
                                            }
                                            break;
                                        case 4:
                                            System.out.println("\nBulbassauro usou Névoa de veneno!");
                                            //envenena, perde hp por turno
                                            espera(800);
                                            if ("Planta".equals(TYPE2)){
                                                DMG = Math.abs(((20*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            } else {
                                                DMG = Math.abs(20*(ATK1*0.03)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            }
                                            System.out.println(NOME2+" está envenenado! Causa 1 dano por turno.");
                                            veneno2=true;
                                            break;
                                        case 5:
                                            System.out.println("\nBulbassauro usou Crescimento!");
                                            //aumenta o dano
                                            espera(800);
                                            System.out.println("Seu ATK aumentou!");
                                            ATK1 += 5;
                                            break;

                                    }
                                    break;
                                case 2:
                                    //CHARMANDER
                                    //ataques: arranhar    chama    cauda de chamas    rugir
                                    System.out.println("\n 1 - Arranhão (normal)\n 2 - Chamas (fogo)\n 3 - Presas de fogo (fogo)\n 4 - Rugido (normal)");
                                    ataque = scan.nextInt();
                                    switch (ataque) {
                                        case 1:
                                            System.out.println("\nCharmander usou Arranhão!");
                                            //normal
                                            espera(800);
                                            DMG = Math.abs(15*(ATK1*0.03)-(DEF2*0.2));
                                            HP2 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        case 2:
                                            System.out.println("\nCharmander usou Chamas!");
                                            //chance de queimar
                                            espera(800);
                                            if ("Fogo".equals(TYPE2)){
                                                DMG = Math.abs(20*(ATK1*0.03)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            if (random(1,5)==1) {
                                                System.out.println(NOME2+" está queimando! Causa 1 dano por turno.");
                                                queima2=true;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("\nCharmander usou Presas de fogo!");
                                            //chance de queimar, chance de intimidar
                                            espera(800);
                                            if ("Fogo".equals(TYPE2)){
                                                DMG = Math.abs(22*(ATK1*0.03)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Agua".equals(TYPE2)) {
                                                DMG = Math.abs(((22*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE2)) {
                                                DMG = Math.abs(((22*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            if (random(1,5)==1) {
                                                System.out.println(NOME2+" está queimando! Causa 1 dano por turno.");
                                                queima2=true;
                                            }
                                            if (random(1,5)==1) {
                                                System.out.println(NOME2+" está intimidado! Não fará movimentos no próximo turno.");
                                                flinch2=true;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("\nCharmander usou Rugido!");
                                            //diminui o ataque
                                            espera(800);
                                            DMG = Math.abs(12*(ATK1*0.03)-(DEF2*0.2));
                                            HP2 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano! ATK de "+NOME2+" caiu!");
                                            ATK2 -=6;
                                            DMG = 0;
                                            break;
                                    }
                                    break;
                                case 3:
                                    //squirtle
                                    //ataques: investida    chicote de cauda    bolhas    revolver dagua
                                    //movimento: recolher
                                    System.out.println("\n 1 - Investida (normal)\n 2 - Chicote de cauda (normal)\n 3 - Bolhas (água)\n 4 - Revólver d'agua (água)\n 5 - Recolher (água)");
                                    ataque = scan.nextInt();
                                    DMG=0;
                                    switch (ataque) {
                                        case 1:

                                            System.out.println("\nSquirtle usou Investida!");
                                            //normal
                                            espera(800);
                                            DMG = (15*(ATK1*0.03)-(DEF2*0.2));
                                            //DMG = Math.abs(15*(ATK1*0.03)-(DEF2*0.2));
                                            HP2 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano!");
                                            DMG = 0;
                                            break;
                                        case 2:
                                            System.out.println("\nSquirtle usou Chicote de cauda!");
                                            //diminui defesa
                                            espera(800);
                                            espera(800);
                                            DMG = Math.abs(12*(ATK1*0.03)-(DEF2*0.2));
                                            HP2 -= DMG;
                                            System.out.println("\nCausou "+DMG+" de dano! DEF de "+NOME2+" caiu!");
                                            DEF2 -=8;
                                            DMG = 0;
                                            break;
                                        case 3:
                                            System.out.println("\nSquirtle usou Bolhas!");
                                            //diminui velocidade por um turno
                                            espera(800);
                                            if ("Agua".equals(TYPE2)){
                                                DMG = Math.abs(20*(ATK1*0.03)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*0.6)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE2)) {
                                                DMG = Math.abs(((20*(ATK1*0.03))*1.2)-(DEF2*0.2));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            System.out.println("SPD de "+NOME2+" caiu!");
                                            SPD2 -=8;
                                            break;
                                        case 4:
                                            System.out.println("\nSquirtle usou Revólver d'agua!");
                                            espera(800);
                                            if ("Agua".equals(TYPE2)){
                                                DMG = Math.abs(22*(ATK1*0.03)-((DEF2*0.2)));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano!");
                                                DMG = 0;
                                            } else if ("Planta".equals(TYPE2)) {
                                                DMG = Math.abs(((22*(ATK1*0.03))*0.6)-((DEF2*0.2)));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque fraco...");
                                                DMG = 0;
                                            } else if ("Fogo".equals(TYPE2)) {
                                                DMG = Math.abs(((22*(ATK1*0.03))*1.2)-((DEF2*0.2)));
                                                HP2 -= DMG;
                                                System.out.println("\nCausou "+DMG+" de dano! Foi um ataque forte!");
                                                DMG = 0;
                                            }
                                            break;
                                        case 5:
                                            System.out.println("\nSquirtle usou Recolher!");
                                            //aumenta defesa no prox turno
                                            espera(800);
                                            System.out.println("Sua DEF aumentou!");
                                            DEF1 += 8;
                                            break;
                                    }
                                    break;                            
                            }
                        } else {
                            System.out.println(" > "+NOME1+" está intimidado! Não fará movimentos neste turno.");
                            flinch1 = false;
                        }
                        
                        espera(1000);
                        System.out.println("\n > Pressione enter para continuar...");
                        enter = scan.nextLine();
                        enter = scan.nextLine();
                        limpatela();
                        }  
                }
                
                if (HP2<=0) {
                    System.out.println("\n > VOCÊ GANHOU!\n  Muito bem, "+NOME1+"!\n");
                } else if (HP1<=0) {
                    System.out.println("\n > Você perdeu...\n  Você lutou bem, "+NOME1+"!\n  Mais sorte na próxima!\n");
                }
                
                System.out.println();
                    System.out.println(" > Pressione enter para voltar ao menu...");
                    enter = scan.nextLine();
                    menu = 0;
                    
                }
            

            while (menu == 2) {
                //como jogar
                limpatela();
                System.out.println(" > Como Jogar?");
                espera(500);
                System.out.println("\n- Utilize as teclas numéricas para selecionar.\n- Escolha seu pokemon, em seguida o pokemon oponente, e pressione enter para começar.\n- Na sua vez, selecione seus ataques com o teclado. Os ataques do oponente serão aleatórios.\n- Tente ganhar e boa sorte!\n\n > Siglas: \n\n- HP: vida \n- ATK: ataque \n- DEF: defesa \n- SPD: velocidade");
                System.out.println();
                System.out.println(" > Pressione enter para voltar ao menu...");
                enter = scan.nextLine();
                enter = scan.nextLine();
                menu = 0;
            }

            while (menu == 3) {
                //sobre
                limpatela();
                System.out.println("Um remake de pokemon feito apenas em java\n\nTrabalho de programação\nPor: Maria Luiza Ivo Robaina\nTurma: INF 232\n\nCréditos:\nASCII: https://www.asciiart.eu \nIdeia original: Satoshi Tajiri/Game Freak/Nintendo");
                System.out.println();
                System.out.println(" > Pressione enter para voltar ao menu...");
                enter = scan.nextLine();
                enter = scan.nextLine();
                menu = 0;
            }
        }
        
        if (menu == 4) {
                //sair
                limpatela();
                System.out.println("Obrigado por jogar!\nSaindo...");
        }            
    }
}
