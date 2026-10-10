package main;

class Mascota {
    private String nombre;
    private String especie;
    private double peso;
    private int edad;

    // 1. Constructor que recibe los cuatro atributos
    public Mascota(String nombre, String especie, double peso, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    // 2. Getters por cada atributo
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    // 3. Setters con validacion
    public void setPeso(double nuevoPeso) {
        if (nuevoPeso <= 0) {
            System.out.println("  > RECHAZADO: el peso debe ser mayor que cero (" + nuevoPeso + ")");
            return;
        }
        this.peso = nuevoPeso;
    }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad < 0) {
            System.out.println("  > RECHAZADO: la edad no puede ser negativa (" + nuevaEdad + ")");
            return;
        }
        this.edad = nuevaEdad;
    }

    // 4. Metodo valorConsulta()
    public int valorConsulta() {
        int valor = 35000;

        if (peso > 25) {
            valor = 55000;
        } else if (peso > 10) {
            valor = 45000;
        }

        if (edad >= 8) {
            valor += 12000;
        }

        return valor;
    }

    // 5. Metodo descripcion()
    public String descripcion() {
        return nombre + " (" + especie + ", " + peso + " kg, " + edad + " anios)";
    }
}

