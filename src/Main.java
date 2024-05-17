import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .forEach(p -> System.out.println(p.getNome() + ", " + p.getSexo()));
    }
}