package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        /* não é possivel fazer assim pq as propriedades estão privadas
        felipe.nome="Felipe";
        felipe.idade= 8;

        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos de idade."); */

        // usa se então getter e setters
         felipe.setNome("Felipe");
         felipe.setIdade(12);

         System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos de idade.");
    }
}
