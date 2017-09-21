
public class complejidadAlgoritmica {
    
     public double calcularSumatoria(double n) {
        double l = 0;
        for(int a=0; a<n+1;a++) {
            l = l + a;
        }
        return l;
    }

    public double calcularSuma(double n) {
        return ((n*(n+1)) /2);
    }
}
