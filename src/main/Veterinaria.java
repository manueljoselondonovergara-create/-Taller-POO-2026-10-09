package main;

public class Veterinaria {
    public static void main(String[] args) {

        // 6. Arreglo de cuatro mascotas
        Mascota[] estante = new Mascota[4];

        estante[0] = new Mascota("Luna", "Perro", 28.5, 9);
        estante[1] = new Mascota("Michi", "Gato", 4.2, 3);
        estante[2] = new Mascota("Rocky", "Perro", 12.0, 5);
        estante[3] = new Mascota("Pepa", "Conejo", 2.1, 1);

        // 7. Recorrer el arreglo y calcular el total
        int totalRecaudado = 0;

        System.out.println("--------------------------------------------------");
        System.out.println("PACIENTES DE LA VETERINARIA");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < estante.length; i++) {
            Mascota m = estante[i];

            if (m != null) {
                int valor = m.valorConsulta();

                System.out.println("- " + m.descripcion());

                System.out.printf(
                        java.util.Locale.GERMANY,
                        "  > Valor consulta: %,.0f%n",
                        (double) valor
                );

                System.out.println();

                totalRecaudado += valor;
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.printf(
                java.util.Locale.GERMANY,
                "TOTAL RECAUDADO: %,.0f%n",
                (double) totalRecaudado
        );
        System.out.println("--------------------------------------------------");

        // 8. Probar setPeso con Michi
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("PRUEBA DE VALIDACION (SETPESO)");
        System.out.println("--------------------------------------------------");

        System.out.println("- Peso antes del cambio: "
                + estante[1].getPeso() + " kg");

        System.out.println("- Intento fallido: -3.0 kg");

        estante[1].setPeso(-3.0);

        System.out.println("- Descripcion despues del intento: "
                + estante[1].descripcion());

        System.out.println("--------------------------------------------------");
    }
}