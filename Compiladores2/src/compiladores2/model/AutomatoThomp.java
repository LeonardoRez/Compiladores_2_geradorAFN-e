package compiladores2.model;

import java.util.ArrayList;

public class AutomatoThomp {

    public Estado q0, qf; //só um estado final, já que os autômatos serão resultados do 
    //algoritmo de thompson
    public ArrayList<Estado> Q;
    public Alfabeto E;

    public AutomatoThomp(Estado q0, Estado qf, ArrayList<Estado> Q, Alfabeto E) {
        this.q0 = q0;
        this.qf = qf;
        this.Q = Q;
        this.E = E;
    }

    public void renomear() {
        for (int i = 0; i < Q.size(); i++) {
            Q.get(i).ID = i;
        }
    }

}
