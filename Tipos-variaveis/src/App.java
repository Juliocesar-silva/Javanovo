public class App {
    public static void main(String[] args) throws Exception {
        double primeiranota = 10;
        double segundanota = 4;
        double terceiranota = 7;
        double media = Media(primeiranota, segundanota, terceiranota);
        if(media < 7)
        System.out.println("Reprovado com média: "+media);
        else
        System.out.println("Aprovado com média: "+media);
    }
    public static double Media(double nota1,double nota2,double nota3){
        return (nota1 + nota2 + nota3)/3;
    }
}
