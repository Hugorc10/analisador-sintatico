package parser;

import java_cup.runtime.Symbol;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Driver {

    /**
     * ver os passos do parsing
     */
    static boolean do_debug_parse = false;

    String[] my_args;

    public static void main(String[] args) {
        Driver d = new Driver(args);
        d.run();
    }

    public Driver(String[] args) {
        //my_args = args;
        my_args = new String[2];
        my_args[0] = "testes/t1.u";
    }

    int func(int i) {
        return 1;
    }

    public void run() {
        System.out.println("Compilando [" + my_args[0] + "]");

        try {
            //Faz a leitura do arquivo de entrada
            FileReader reader = new FileReader(new File(my_args[0]));
            //Cria uma instância do Lexer passando o arquivo como atributo
            Lexer mylexer = new Lexer(reader);
            //Cria uma instância do Parser passando o Lexer juntamente com o nome do arquivo de entrada
            parser my_parser = new parser(mylexer, my_args[0]);
            //
            Symbol top;

            try {
                if (do_debug_parse) {
                    top = my_parser.debug_parse();
                } else {
                    top = my_parser.parse();
                }

                //Para se houver alguma falha no parsing
                if (my_parser.hasFailed()) {
                    return;
                }

                System.out.println("Parsing Concluido. Símbolo do topo = "
                        + top.sym);

            } catch (Error e) {
                System.out.println(e.toString());
            } catch (Exception e) {
                /* do cleanup here -- possibly rethrow e */
                //System.out.println("error(2) was:" + e.toString());
            } finally {
                /* do close out here */
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
        }
    }
}
