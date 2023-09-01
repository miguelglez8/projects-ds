package google.maps;

public class Navegador {

    // Dada una dirección, devuelve sus coordenadas
    public Coordenadas getCoordenadas(String direccion) {
        // Implementación de relleno
        double number = (direccion.toLowerCase().charAt(0) - 'a') * 10 + 10;
        return new Coordenadas(number, number);
    }

    // Dadas unas coordenadas, devuelve la dirección a la que le corresponde
    public String getDireccion(Coordenadas coordenadas) {
        // Implementación de relleno
        return coordenadas.toString();
    }

    // M�todo que, dada una dirección, inicia el proceso de navegar hasta ella
    public void navegarHasta(String direccion) {
        // Implementación de relleno
        System.out.println("GPS: Gire a la derecha. Ha llegado a '" + direccion + "'");
    }
}
