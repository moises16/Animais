public class Cachorro extends Mamiferos{
    public Cachorro(String nome, int idade, int peso) {
        super(nome, idade, peso,"marron");
    }

    public static void main(String[] args) {
        Animal cachorro = new Animal("cachorro", 10,20);
        cachorro.movimento();
        cachorro.somCachorro();
    }

}