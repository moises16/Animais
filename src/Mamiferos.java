public class Mamiferos extends  Animal{
    private String cor;
    public Mamiferos(String nome, int idade, int peso, String cor) {
        super(nome,idade, peso);
        this.cor = cor;

        Mamiferos gato = new Mamiferos("Gato",10,10,"cinza");
        gato.somGato();
    }



}
