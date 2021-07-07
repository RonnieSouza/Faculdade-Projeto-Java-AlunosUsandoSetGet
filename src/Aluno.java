public class Aluno {
    String matricula, nome;
    double cr;

    // declaração dos metodos
    public void setMatricula(String m) {
        if(!m.isEmpty()) { // se o parametro m NÃO estiver vazio
            matricula = m; // será feito a atribuição
        }
    }

    public String getMatricula() {
        return matricula; // retorna a matricula
    }

    public void setNome(String n) {
        if(!n.isEmpty()) {
            nome = n;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setCr(double c) {
        if(c >= 0 && c<=10) {
            cr = c;
        }
    }

    public double getCr() {
        return cr;
    }

    public void imprimir() {
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("CR: " + getCr());
    }

}


