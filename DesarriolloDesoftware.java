/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarriollodesoftware;

import java.util.Scanner;

/**
 *
 * @author sacos
 */
public class DesarriolloDesoftware {
    
    //Ejercicio 1
    
    public static void main(String[] args) {
        //ejercicio1
        int x = 6;
        int y = 10;

        int resultado = Ejecicio1.calcularFuncion(x, y);

        System.out.println("El valor de f(" + x + ", " + y + ") es: " + resultado);
        
//Ejecicio 2
 int sillasPorBus = 50;  // Cada bus tiene 50 sillas
        int estudiantesGordos = 60;
        int estudiantesFlacos = 20;

  
        int numeroDeBuses = Ejecicio2.calcularBuses(sillasPorBus, estudiantesGordos, estudiantesFlacos);

        System.out.println("Número de buses necesarios: " + numeroDeBuses);
        
        //Ejercicio 3
        
        double altura = 5.0; 
        double angulo = 30.0;

        double longitudEscalera = Ejercicio3.calcularLongitudEscalera(altura, angulo);

        System.out.println("La longitud de la escalera es: " + longitudEscalera + " metros");

        //Ejercicio 4
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo mensual de Pedro: ");
        double sueldo = scanner.nextDouble();

        double gastoArriendo = Ejercicio4.calcularGastoArriendo(sueldo);
        double gastoComida = Ejercicio4.calcularGastoComida(sueldo);

        double dineroRestante = sueldo - (gastoArriendo + gastoComida);


        System.out.println("Gasto en arriendo: $" + gastoArriendo);
        System.out.println("Gasto en comida: $" + gastoComida);
        System.out.println("Dinero restante: $" + dineroRestante);
        
        //Ejercicio5
        
           System.out.print("Ingrese el radio del círculo grande (R): ");
        double radioGrande = scanner.nextDouble();
        
        System.out.print("Ingrese el radio del círculo pequeño (r): ");
        double radioPequeno = scanner.nextDouble();

        // Calcular el área de la corona circular usando los métodos de la clase AreaCirculo
        double areaCorona = Ejercicio5.calcularAreaCoronaCircular(radioGrande, radioPequeno);

        System.out.println("El área de la corona circular es: " + areaCorona + " unidades cuadradas");
        
        //Ejercicio 6
        
        System.out.print("Ingrese la longitud del lado A (base del rectángulo): ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado B (altura del rectángulo y cateto del triángulo): ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado C (base del triángulo): ");
        double ladoC = scanner.nextDouble();

        double areaRectangulo = Ejercicio6.calcularAreaRectangulo(ladoA, ladoB);

        double areaTriangulo = Ejercicio6.calcularAreaTriangulo(ladoC, ladoB);

 
        double areaTotal = areaRectangulo + areaTriangulo;


        double perimetro = Ejercicio6.calcularPerimetroTerreno(ladoA, ladoB, ladoC);

        System.out.println("El área total del terreno es: " + areaTotal + " unidades cuadradas");
        System.out.println("El perímetro total del terreno es: " + perimetro + " unidades");
        
        //Ejercicio 7

        System.out.print("Ingrese la coordenada x1 del primer punto: ");
        double x1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada y1 del primer punto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada x2 del segundo punto: ");
        double x2 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada y2 del segundo punto: ");
        double y2 = scanner.nextDouble();

        double distancia = Ejercicio7.calcularDistancia(x1, y1, x2, y2);

        double pendiente = Ejercicio7.calcularPendiente(x1, y1, x2, y2);

        System.out.println("La distancia entre los puntos es: " + distancia);
        System.out.println("La pendiente de la recta que une los puntos es: " + pendiente);
        //ejercio 8
        
        System.out.print("Ingrese el número de estudiantes: ");
        int numeroEstudiantes = scanner.nextInt();

        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        int numeroSalones = Ejercicio8.calcularNumeroSalones(numeroEstudiantes, capacidadSalon);

        int numeroPisos = Ejercicio8.calcularNumeroPisos(numeroSalones, salonesPorPiso);

        System.out.println("Número de salones necesarios: " + numeroSalones);
        System.out.println("Número de pisos necesarios: " + numeroPisos);
        
        //Ejercicio9

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int mayor = Ejercicio9.obtenerMayor(numero1, numero2);

        System.out.println("El mayor de los dos números es: " + mayor);
        
        //Ejercicio 10
        
        System.out.print("Ingrese el primer número entero: ");
        int numero3 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero4 = scanner.nextInt();

        System.out.print("Ingrese el operador (+, -, *, /, %, **): ");
        String operador = scanner.next();

        try {
            double resultado1 = Ejercicio10.aplicarOperacion(numero3, numero4, operador);

            System.out.println("El resultado de la operación es: " + resultado);
            } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            
            //Ejercicio 11

            System.out.print("Ingrese un número entero entre 1 y 99: ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 99) {
            System.out.println("Número fuera del rango permitido (1-99).");
            return;
        }

        int decenas = Ejercicio11.obtenerDecenas(numero);
        int unidades = Ejercicio11.obtenerUnidades(numero);

        String romanoDecenas = Ejercicio11.convertirDecenaARomano(decenas);
        String romanoUnidades = Ejercicio11.convertirUnidadARomano(unidades);

        System.out.println("Número en romanos: " + romanoDecenas + romanoUnidades);
        
        //Ejercicio 12
  
        System.out.print("Ingrese el nombre del día de la semana (en español): ");
        String diaActual = scanner.nextLine();

        String diaSiguiente = Ejercicio12.diaSiguiente(diaActual);

        if (diaSiguiente.equals("Día no válido")) {
            System.out.println(diaSiguiente);
        } else {
            System.out.println("El día siguiente a " + diaActual + " es " + diaSiguiente + ".");
            
            //Ejercicio 13


        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        double aumento = Ejercicio13.calcularAumento(sueldoActual);

        double nuevoSueldo = sueldoActual + aumento;


        System.out.println("El valor del aumento es: $" + aumento);
        System.out.println("El nuevo sueldo es: $" + nuevoSueldo);
        
        // Ejercicio 14

        System.out.print("Ingrese el nombre del primer hermano: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese la edad del primer hermano: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el nombre del segundo hermano: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese la edad del segundo hermano: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el nombre del tercer hermano: ");
        String nombre3 = scanner.nextLine();
        System.out.print("Ingrese la edad del tercer hermano: ");
        int edad3 = scanner.nextInt();

        String hermanoMayor = Ejercicio14.obtenerHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);

        System.out.println("El hermano mayor es: " + hermanoMayor);
    }
}

    }
}




        
    




