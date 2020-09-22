public class Animal {
   private int idade;
   private String nome;
   private int peso;


   public Animal(String nome, int idade, int peso){
      this.idade = idade;
      this.nome = nome;
      this.peso = peso;
   }

   public void movimento(){
      System.out.println("correr");
   }

   public void somCachorro(){
      System.out.println("latir");
   }
   public  void  somLobo(){
      System.out.println("uivar");
   }
   public void somGato(){
      System.out.println("miar");
   }




}
