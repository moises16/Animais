public class Lobo extends Mamiferos{
    public Lobo(String nome, int idade, int peso,String cor) {
        super(nome, idade, peso,cor);
        Animal lobo = new Animal("lobo",15,30);

        lobo.movimento();
        lobo.somLobo();
    }
}
