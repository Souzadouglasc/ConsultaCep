public class Main {
    public static void main(String[] args) {

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco endereco = new Endereco(busca);
        consultaCep.buscaEndereco("88162039");
    }
}