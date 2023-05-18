package model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private static int horariodeAbertura;
    private static int horariodeFechamento;
    private List<Sala> salas = new ArrayList<Sala>();

    public Cinema() {
        horariodeAbertura = 13;
        horariodeFechamento = 22;
        for (int i = 0; i < 12; i++) {
            if (i <= 2) {
                salas.add(new SalaGrande());
                continue;
            }
            if (i > 2 && i <= 6) {
                salas.add(new SalaMedia());
                continue;
            }
            if (i > 6) {
                salas.add(new SalaPequena());
                continue;
            }
        }
    }

    public static int getHorariodeAbertura() {
        return horariodeAbertura;
    }

    public static int getHorariodeFechamento() {
        return horariodeFechamento;
    }

    public List<Sala> getSalas() {
        return salas;
    }

}
