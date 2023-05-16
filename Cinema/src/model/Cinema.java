package model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private final int horariodeAbertura;
    private final int horariodeFechamento;
    private List<Sala> salas = new ArrayList<Sala>();

    Cinema() {
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

}
