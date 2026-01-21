public class calcularrecursiva {

    private static double Monto_base= 55.0;
    private static double Monto_dependiente= 15.0;
    private static double Factor_rural= 1.15;
    private static double CalcularRecursivo(int dependientes, boolean esRural){
        // caso exitoso donde no hay dependedientes ni rural regresa solo se llama una vez
        if(dependientes == 0){
            return esRural ? Monto_base * Factor_rural : Monto_base;
        }
        
        // recursividad
        double montoAnterior = CalcularRecursivo(dependientes - 1, esRural);
        double adicional = esRural ? Monto_dependiente * Factor_rural : Monto_dependiente;

        return montoAnterior + adicional;
    }

    public void main(String [] args){
        System.out.println("Caso 1: Zona Urbana " + CalcularRecursivo(0, false));
        System.out.println("Caso 2: Zona Urbana " + CalcularRecursivo(3, false));
        System.out.println("Caso 3: Zona Urbana " + CalcularRecursivo(7, true));
    }
}
