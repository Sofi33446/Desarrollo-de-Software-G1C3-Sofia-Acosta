/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Programa de Ingeniería de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Guía 2 - Actividad 2
 * Ejercicio: alcancia
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package mundo;

import java.util.Random;

public class Alcancia {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    private int numeroMonedas50;
    private int numeroMonedas100;
    private int numeroMonedas200;
    private int numeroMonedas500;
    private int numeroMonedas1000;
    private int estado;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    public Alcancia() {
        numeroMonedas50 = 0;
        numeroMonedas100 = 0;
        numeroMonedas200 = 0;
        numeroMonedas500 = 0;
        numeroMonedas1000 = 0;
        estado = 0;
        generarMonedasAleatorias();
    }

    public int darNumeroMonedas50() {
        return numeroMonedas50;
    }

    public int darNumeroMonedas100() {
        return numeroMonedas100;
    }

    public int darNumeroMonedas200() {
        return numeroMonedas200;
    }

    public int darNumeroMonedas500() {
        return numeroMonedas500;
    }

    public int darNumeroMonedas1000() {
        return numeroMonedas1000;
    }

    public String darEstado() {
        return estado == 1 ? "ROTA" : "NO ROTA";
    }

    public int calcularTotalDinero() {
        return (numeroMonedas50 * 50) + (numeroMonedas100 * 100) + (numeroMonedas200 * 200) +
               (numeroMonedas500 * 500) + (numeroMonedas1000 * 1000);
    }

    public String darEstadoAlcancia() {
        int totalDinero = calcularTotalDinero();
        return "La alcancía tenía: \n " + numeroMonedas50 + " moneda(s) de $50 \n " +
               numeroMonedas100 + " moneda(s) de $100 \n " + numeroMonedas200 + " moneda(s) de $200 \n " +
               numeroMonedas500 + " moneda(s) de $500 \n " + numeroMonedas1000 + " moneda(s) de $1000 \n " +
               "Para un total de $" + totalDinero + " pesos.";
    }

    public void agregarMoneda50() {
        if (estado == 0) {
            numeroMonedas50++;
        }
    }

    public void agregarMoneda100() {
        if (estado == 0) {
            numeroMonedas100++;
        }
    }

    public void agregarMoneda200() {
        if (estado == 0) {
            numeroMonedas200++;
        }
    }

    public void agregarMoneda500() {
        if (estado == 0) {
            numeroMonedas500++;
        }
    }

    public void agregarMoneda1000() {
        if (estado == 0) {
            numeroMonedas1000++;
        }
    }

    public void romperAlcancia() {
        estado = 1;
    }

    public int obtenerDenominacionMasNumerosa() {
        int maxMonedas = numeroMonedas50;
        int denominacionMax = 50;

        if (numeroMonedas100 > maxMonedas) {
            maxMonedas = numeroMonedas100;
            denominacionMax = 100;
        }
        if (numeroMonedas200 > maxMonedas) {
            maxMonedas = numeroMonedas200;
            denominacionMax = 200;
        }
        if (numeroMonedas500 > maxMonedas) {
            maxMonedas = numeroMonedas500;
            denominacionMax = 500;
        }
        if (numeroMonedas1000 > maxMonedas) {
            maxMonedas = numeroMonedas1000;
            denominacionMax = 1000;
        }

        return denominacionMax;
    }

    public boolean valiosa() {
        return numeroMonedas50 == 0 && numeroMonedas100 == 0 &&
               numeroMonedas200 == 0 && (numeroMonedas500 > 0 || numeroMonedas1000 > 0);
    }

    // Genera aleatoriamente 1.000 monedas entre las 5 denominaciones
    private void generarMonedasAleatorias() {
        Random random = new Random();
        int totalMonedas = 1000;
        int monedasRestantes = totalMonedas;

        while (monedasRestantes > 0) {
            int tipoMoneda = random.nextInt(5);
            switch (tipoMoneda) {
                case 0 -> numeroMonedas50++;
                case 1 -> numeroMonedas100++;
                case 2 -> numeroMonedas200++;
                case 3 -> numeroMonedas500++;
                case 4 -> numeroMonedas1000++;
            }
            monedasRestantes--;
        }
    }
}
