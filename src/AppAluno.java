public class AppAluno {
    public static void main (String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        //definir valores para os alunos !!
        aluno1.setMatricula("1001");
        aluno1.setNome("Andre");
        aluno1.setCr(6.7);

        aluno2.setMatricula("1002");
        aluno2.setNome("Lucas");
        aluno2.setCr(7.5);

        aluno3.setMatricula("");
        aluno3.setNome("");
        aluno3.setCr(12);

        //imprimindo na tela usando o metodo de impressão
        aluno1.imprimir();
        aluno2.imprimir();
        aluno3.imprimir();

    }
}
