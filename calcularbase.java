public class calcularbase {

    private static double Monto_base= 55.0;
    private static double Monto_dependiente= 15.0;
    private static double Factor_rural= 1.15;

    public static double calculo(int dependientes, boolean esRural){
        double monto = Monto_base;
        for(int i = 0; i < dependientes; i++){
            monto += Monto_dependiente;
        }

        if(esRural){
            monto = monto * Factor_rural;
        }
        return monto;

        // return esRural ? monto * Factor_rural : monto;
    }

    public void main(String [] args){
        System.out.println("Caso 1: Zona Urbana " + calculo(0, false));
        System.out.println("Caso 2: Zona Urbana " + calculo(3, false));
        System.out.println("Caso 3: Zona Urbana " + calculo(7, true));
        System.out.println("Caso 4: Zona Urbana " + calculo(0, false));
    }
}

