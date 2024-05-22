public class BoletimEstudantil {
    public static void main(String[] args) {
        double n1 = 7, n2 = 5, n3 = 10;

        double mediaAluno = media(n1, n2, n3);
        
        if(mediaAluno < 7)
            System.out.println("Aluno reprovado!");
        else
            System.out.println("Aluno aprovado!");
        
        System.out.println("Nota: "  + mediaAluno);
    }

    public static double media(double n1, double n2,  double n3){
        return (n1+n2+n3)/3;
    }
}
