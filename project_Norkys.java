import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class project_Norkys {
    String Nombre = "Andre";
    Scanner f1 = new Scanner(System.in);
    ArrayList<String>f2=new ArrayList<>();
    ArrayList<Double>f3=new ArrayList<>();
    ArrayList <Double>SubTotal= new ArrayList<>();
    ArrayList menuRestaurante= new ArrayList<>();
    ArrayList menuPatioComida= new ArrayList<>();
    ArrayList Pollosalabrasa= new ArrayList<>();
    ArrayList Parrillas= new ArrayList<>();
    ArrayList Saltados= new ArrayList<>();
    ArrayList MixChauferos= new ArrayList<>();
    ArrayList Adicionales= new ArrayList<>();
    ArrayList ComboBroaster= new ArrayList<>();
    ArrayList Pollosalabrasa2= new ArrayList<>();
    ArrayList MixChauferos2= new ArrayList<>();
    ArrayList Salchipapas= new ArrayList<>();
    ArrayList Snacks= new ArrayList<>();
    ArrayList <Integer> carrito= new ArrayList<>();
    int OpcPrin,opcion,cantidad,opcionrest,opcionpatio;
    double [] precioPollosBrasa= { 12.90,19.90,60.90,92.00,92.00,24.90,29.90};
    double [] precioParrillas= {10.90,10.90,12.90,12.90,11.00,11.00};
    double [] precioSaltados= {10.90,10.90,12.90,12.90,11.00,11.00};
    double [] precioMixChauferos= {10.90,13.90,15.90};
    double [] precioAdicionales={3.90,7.90,5.90,8.90,6.0};
    double [] preciocomboBroaster={14.90,20.90,17.90};
    double [] precioPollosBrasa2={ 21.90,25.00,38.90,42.00};;
    double [] precioMixchauferos2={26.90,28.00,28.90,30.00 };
    double [] preciosalchipapas={9.90,12.90,13.00,18.90};
    double [] preciosnacks={11.90,14.90,13.00,16.90};
    String DNiIngresado;
    String ContrasenaIngresado;
    double TotalPago,igv;
    public project_Norkys() {
        menuRestaurante.add("Pollos a la brasa ");
        menuRestaurante.add("Parrillas ");
        menuRestaurante.add("Saltados ");
        menuRestaurante.add("Mix chauferos ");
        menuRestaurante.add("Adicionales  ");

        Pollosalabrasa.add(" 1°|1/4 de pollo+papas+ensalada Precio:12.90 soles");
        Pollosalabrasa.add(" 2°|1/2 de pollo+papas+ensalada Precio:19.90 soles");
        Pollosalabrasa.add(" 3°|Pollo oferta Precio:60.90 soles");
        Pollosalabrasa.add(" 4°|Combo familiar Precio:92.00 soles");
        Pollosalabrasa.add(" 5°|Combo familiar 2 Precio:92.00 soles");
        Pollosalabrasa.add(" 6°|1/4 de pollo+papas+ensalada+gaseosa Precio:24.90 soles");
        Pollosalabrasa.add(" 7°|1/2 de pollo+papas+ensalada+gaseosa Precio:29.90 soles");

        Parrillas.add("Parrilla Norkys");
        Parrillas.add("Parrilla del chef");
        Parrillas.add("Churrasco simple");
        Parrillas.add("Churrasco a la pobre");
        Parrillas.add("Brasa extremo");
        Parrillas.add("Pechuga Light");
        Parrillas.add("Pechuga Norkys");

        Saltados.add("Arroz Chaufa De Carne");
        Saltados.add("Arroz Chaufa De Pollo");
        Saltados.add("Tallarin Saltado de Carne");
        Saltados.add("Tallarin Saltado de Pollo");
        Saltados.add("Lomo Saltado");
        Saltados.add("Pollo Saltado");

        MixChauferos.add("Chaufa Brasa");
        MixChauferos.add("Chorichaufa Brasa");
        MixChauferos.add("Chaufa con Trozos de Pollo a la Brasa");

        Adicionales.add("Gaseosa 500 ml ");
        Adicionales.add("Gaseosa 1.5 L ");
        Adicionales.add("1/4 de Pollo Adicional");
        Adicionales.add("Porcion Papa Familiar ");
        Adicionales.add("Porcion de chaufa");

        menuPatioComida.add("Combo Broaster");
        menuPatioComida.add("Pollo a la Brasa");
        menuPatioComida.add("Mixchaufero");
        menuPatioComida.add("Salchipapas");
        menuPatioComida.add("Snacks");

        ComboBroaster.add("  (Combo 1 Pieza) 1 Pieza Broaster 100gr de Chicharron Papas personal Gaseosa 12oz ");
        ComboBroaster.add(" (Combo 2 Pieza) | 2 Pieza Broaster 100gr de Chicharron Papas personal Gaseosa 12oz ");
        ComboBroaster.add("  (Combo 3 Pieza) | 3 Pieza Broaster 100gr de Chicharron Papas personal | Gaseosa 12oz ");
        
        Pollosalabrasa2.add(" (1/4 pollo)       | 1/4 pollo | papas fritas| ensalada ");
        Pollosalabrasa2.add(" (1/4 pollo) | 1/4 pollo | papas fritas| ensalada | gaseosa de 500ml|");
        Pollosalabrasa2.add(" (1/2 pollo)| 1/2 pollo | papas fritas| ensalada    ");
        Pollosalabrasa2.add(" (1/2 pollo) | 1/2 pollo| papas fritas|ensalada| 2 gaseosas de 500ml |");
        
        MixChauferos2.add("  (Chaufa Brasa) | 1/4 de pollo   || arroz chaufa  | gaseosa 12oz  ");
        MixChauferos2.add(" (ChoriChaufa) | 1/4 de pollo   | | chaufa| 1 chorizo | gaseosa 12oz ");
        MixChauferos2.add(" (Chaufa con pollo)  | arroz chaufa     | | trozos de pollo  |Gaseosa 12oz");
        MixChauferos2.add(" (Chaufero 4 poiezas) | 4 piezas boraster|30.00 1/2 porcion papas|2 porciones arroz| gaseosas 500ml ");
        
        Salchipapas.add("  (Salchipapa Clásica)  | salchicha | papas fritas  | gaseosa 12oz   ");
        Salchipapas.add(" (Salchichorizo)       | salchicha | chorizo | papas fritas   gaseosa 12oz  ");
        Salchipapas.add(" (Salchipapa Norkys)   | salchipapa  papas fritas   huevo  Gaseosa 12oz ");
        Salchipapas.add(" (Salchicharrón)       | salchicha   50gr de chicharron| papas fritas      | gaseosa 12oz");

        Snacks.add(" (Chicken box broaster)  | 1 pierna broaster | arroz chaufa  ");
        Snacks.add(" (Cicken box alitas)     | alitas broaster  | arroz chaufa ");
        Snacks.add(" (Chicken box chicharron)| chicharron broaster| arroz chaufa  ");
        Snacks.add(" (Chicken box alitas BBQ)| alitas BBQ   arroz chaufa ");

        for(int i =0 ; i < Pollosalabrasa.size(); i++){
            carrito.add(0);
            SubTotal.add(0.0);
        }
        for(int i =0 ; i < Parrillas.size(); i++){
            carrito.add(0);
            SubTotal.add(0.0);
        }
        for(int i =0 ; i < Saltados.size(); i++){
            carrito.add(0);
            SubTotal.add(0.0);
        }
        for(int i =0 ; i < MixChauferos.size(); i++){
            carrito.add(0);
            SubTotal.add(0.0);
        }
        for(int i =0 ; i < Adicionales.size(); i++){
            carrito.add(0);
            SubTotal.add(0.0);
        }
        for(int i =0 ; i < ComboBroaster.size(); i++){
            carrito.add(0);
            SubTotal.add(0.0);
        }
        for(int i =0 ; i < Pollosalabrasa2.size(); i++){
            carrito.add(0);
            SubTotal.add(0.0);
        }
        for(int i =0 ; i < MixChauferos2.size(); i++){
            carrito.add(0);
            SubTotal.add(0.0);
        }
        for(int i =0 ; i < Salchipapas.size(); i++){
            carrito.add(0);
            SubTotal.add(0.0);
        }
        for(int i =0 ; i < Snacks.size(); i++){
            carrito.add(0);
            SubTotal.add(0.0);
        }
    }
    public static void main(String[] args) {
        project_Norkys Andre = new project_Norkys();
        Andre.Empezar();
    }

    public void Empezar() {
        String Eleccion;
        do {
            System.out.println("Seleccione Una Opcion:");
            System.out.println("Opcion 1: Iniciar Sesion ");
            System.out.println("Opcion 2: Crear Cuenta");
            System.out.println("Opcion 0: Salir");
            Eleccion = f1.nextLine();
            switch (Eleccion) {
                case "1":
                    Inicio();
                    break;
                case "2":
                    Registro();
                    break;
                case "0":
                    System.out.println("Saliendo de Programa");
                    break;
                default:
                    System.out.println("Esta Pollosalabrasa No Existe");
                    break;
            }
        } while (!Eleccion.equals("0"));
    }

    public void Inicio() {
        String dni = "87654321";
        String Contrasena = "1234";
        String Nombre = "Zamir";
        boolean iniciar = false;
        int contador = 0;
        while (!iniciar && contador <= 2) {
            System.out.println("Iniciar sesion");
            System.out.println("Ingrese DNI");
            String DNISC = f1.nextLine();
            System.out.println("Ingrese su Contraseña");
            String ClaveSC = f1.nextLine();
            if (dni.equals(DNISC) && Contrasena.equals(ClaveSC) || DNiIngresado.equals(DNISC) && ContrasenaIngresado.equals(ClaveSC)) {
                System.out.println("Se a Iniciado Sesion\n");
                System.out.println("Bienvenido a Norkys ");
                iniciar = true;
                MenuPrincipal();
            } else {
                System.out.println("Datos Incorrectos");
                contador++;
                System.out.println("Se realizo el Intento N°: " + contador);
            }
        }
        if (contador > 2) {
            System.out.println("El Acceso a sido Bloqueado");
        }
    }

    public void Registro() {
        System.out.println("Crear Una Cuenta");
        System.out.println("Ingrese fecha de nacimiento");
        System.out.println("Ingrese el dia");
        int dia = f1.nextInt();
        System.out.println("Ingrese el Mes (MM)");
        int mes = f1.nextInt();
        System.out.println("Ingrese el Año (AAAA)");
        int ano = f1.nextInt();
        LocalDate fechanacimiento = LocalDate.of(ano, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechanacimiento, fechaActual).getYears();
        f1.nextLine();
        if (edad >= 18 && edad <= 90) {
            System.out.println("Crear cuenta");
            System.out.println("Ingrese Nombres");
            String NombreIngresado = f1.nextLine();
            System.out.println("Ingrese Apellidos");
            String ApellidoIngresado = f1.nextLine();
            while (true) {
                System.out.println("Ingrese DNI");
                DNiIngresado = f1.nextLine();
                if (DNiIngresado.length() == 8 && DNiIngresado.matches("[0-9]+")) {
                    System.out.println("DNI Valido");
                    break;
                } else {
                    System.out.println("DNI no Valido");
                }
            }
            while (true) {
                System.out.println("ingrese su email (debe ser Gmail): ");
                String CorreoIngresado = f1.nextLine();
                if (CorreoIngresado.endsWith("@gmail.com")) {
                    System.out.println("Correo aceptado");
                    break;
                } else {
                    System.out.println("Correo no valido");
                }
            }
            while (true) {
                System.out.println("Ingrese una contraseña");
                ContrasenaIngresado = f1.nextLine();
                if (Requisitos(ContrasenaIngresado)) {
                    System.out.println("Contraseña valida");
                    break;
                } else {
                    System.out.println("Error");
                }
            }
            System.out.println("Se a Creado Su Cuenta Exitosamente");
        } else if (edad >= 1 && edad <= 17) {
            System.out.println("Usted es Menor de Edad  no puede  Crear una cuenta en esta Aplicacion");

        } else {
            System.out.println("edad no valida");
        }
        f1.nextLine();
    }

    public static boolean Requisitos(String password) {
        if (password.length() < 12) {
            return false;
        }
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) tieneMayuscula = true;
            else if (Character.isLowerCase(c)) tieneMinuscula = true;
            else if (Character.isDigit(c)) tieneNumero = true;
            else tieneSimbolo = true;
        }

        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneSimbolo;
    }
    public void MenuPrincipal(){
        do {
            System.out.println("""
                    
                    MENU PRINCIPAL
                    Opcion 1: Carta Restaurante
                    Opcion 2: Carta Patio De Comida
                    Opcion 3: Libro De Reclamos
                    Opcion 4: Promociones
                    Opcion 5: Realizar Pago
                    Opcion 0: Salir Del Programa
                    Seleccione Una Pollosalabrasa""");
            OpcPrin = f1.nextInt();
            switch (OpcPrin) {
                case 0:
                    break;
                case 1:
                    this.MenuRestaurante();
                    break;
                case 2:
                    this.PatioComida();
                    break;
                case 5:
                    RealizarPago();
                    break;
                default:
                    this.MenuPrincipal();
                    System.out.println("Opcion no valida");
            }
        }while (OpcPrin!=0);
        System.out.println("Saliendo del programa");
    }
    public void MenuRestaurante(){
        System.out.println("------ CARTA RESTAURANTE------------");
        System.out.println("Seleccione su menu de compra");
        for (int i = 0; i < menuRestaurante.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + menuRestaurante.get(i));
        }
        opcionrest = f1.nextInt();
        f1.nextLine();
        if (opcionrest == 1 && opcion <= Pollosalabrasa.size()) {
            System.out.println("------ POLLOS A LA BRASA------------");
            System.out.println("Seleccione su compra ");
            for (int i = 0; i < Pollosalabrasa.size(); i++) {
                System.out.println("Opción " + (i + 1) + " : " + Pollosalabrasa.get(i));
            }
            opcion = f1.nextInt();
            f1.nextLine();
            if (opcion >= 1 && opcion <= Pollosalabrasa.size()) {
                System.out.println("¿Cuántos comprará? Ingrese la cantidad");
                cantidad = f1.nextInt();
                f1.nextLine();
                carrito.set(opcion - 1, carrito.get(opcion - 1) + cantidad);
                System.out.println("Ud ha pedido " + carrito.get(opcion - 1) + " platos de " + Pollosalabrasa.get(opcion - 1));
                SubTotal.set(opcion - 1, carrito.get(opcion - 1) * precioPollosBrasa[opcion + 1]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = f1.nextInt();
                f1.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.MenuRestaurante();
                } else if (opcion == 2) {
                    this.RealizarPago();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }
            }
        }
        else if(opcionrest == 2 && opcion <= Parrillas.size()) {
            System.out.println("------ PARRILLAS------------");
            System.out.println("Seleccione su compra ");
            for (int i = 0; i < Parrillas.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Parrillas.get(i));
            }

            opcion = f1.nextInt();
            f1.nextLine();
            if (opcion >=1 && opcion <= Parrillas.size()) {
                    System.out.println("¿Cuántos comprará? Ingrese la cantidad");
                    cantidad = f1.nextInt();
                    f1.nextLine();
                    carrito.set(opcion - 1, carrito.get(opcion - 1) + cantidad);
                    System.out.println("Ud ha pedido " + carrito.get(opcion - 1) + " platos de " + Parrillas.get(opcion - 1));
                    SubTotal.set(opcion - 1, carrito.get(opcion - 1) * precioParrillas[opcion + 1]);
                    System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                    opcion = f1.nextInt();
                    f1.nextLine();
                    if (opcion == 1) {
                        System.out.println("Volviendo a la opción de compra");
                        this.MenuRestaurante();
                    } else if (opcion == 2) {
                        this.RealizarPago();
                    } else if (opcion == 3) {
                        this.MenuPrincipal();
                    } else {
                        System.out.println("Opcion no válida");
                    }
            }
        }
        else if(opcionrest == 3 && opcion <= Saltados.size()) {
            System.out.println("------ SALTADOS------------");
            System.out.println("Seleccione su compra ");
            for (int i = 0; i < Saltados.size(); i++) {
                System.out.println("Opción " + (i + 1) + " : " + Saltados.get(i));
            }
            opcion = f1.nextInt();
            f1.nextLine();
            if (opcion >= 1&& opcion <= Saltados.size()) {
                    System.out.println("¿Cuántos comprará? Ingrese la cantidad");
                    cantidad = f1.nextInt();
                    f1.nextLine();
                    carrito.set(opcion - 1, carrito.get(opcion - 1) + cantidad);
                    System.out.println("Ud ha pedido " + carrito.get(opcion - 1) + " platos de " + Saltados.get(opcion - 1));
                    SubTotal.set(opcion - 1, carrito.get(opcion - 1) * precioSaltados[opcion + 1]);
                    System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                    opcion = f1.nextInt();
                    f1.nextLine();
                    if (opcion == 1) {
                        System.out.println("Volviendo a la opción de compra");
                        this.MenuRestaurante();
                    } else if (opcion == 2) {
                        this.RealizarPago();
                    } else if (opcion == 3) {
                        this.MenuPrincipal();
                    } else {
                        System.out.println("Opcion no válida");
                    }
            }

        }
        else if(opcionrest == 4 && opcion <= Saltados.size()){
            System.out.println("------ MIX CHAUFEROS------------");
            System.out.println("Seleccione su compra ");
            for (int i = 0; i < MixChauferos.size(); i++) {
                System.out.println("Opción " + (i + 1) + " : " + MixChauferos.get(i));
            }
            opcion = f1.nextInt();
            f1.nextLine();
                f1.nextLine();
                if (opcion >= 1&& opcion <= MixChauferos.size()) {
                    System.out.println("¿Cuántos comprará? Ingrese la cantidad");
                    cantidad = f1.nextInt();
                    f1.nextLine();
                    carrito.set(opcion - 1, carrito.get(opcion - 1) + cantidad);
                    System.out.println("Ud ha pedido " + carrito.get(opcion - 1) + " platos de " + MixChauferos.get(opcion - 1));
                    SubTotal.set(opcion - 1, carrito.get(opcion - 1) * precioMixChauferos[opcion + 1]);
                    System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                    opcion = f1.nextInt();
                    f1.nextLine();
                    if (opcion == 1) {
                        System.out.println("Volviendo a la opción de compra");
                        this.MenuRestaurante();
                    } else if (opcion == 2) {
                        this.RealizarPago();
                    } else if (opcion == 3) {
                        this.MenuPrincipal();
                    } else {
                        System.out.println("Opcion no válida");
                    }
                }
        }
        else if(opcionrest == 5 && opcion <= Adicionales.size()) {
            System.out.println("------ ADICIONALES------------");
            System.out.println("Seleccione su compra ");
            for (int i = 0; i < Adicionales.size(); i++) {
                System.out.println("Opción " + (i + 1) + " : " + Adicionales.get(i));
            }
            opcion = f1.nextInt();
            f1.nextLine();
            if(opcion>=1 && opcion <= Adicionales.size()){
                System.out.println("¿Cuántos comprará? Ingrese la cantidad");
                cantidad = f1.nextInt();
                f1.nextLine();
                carrito.set(opcion - 1, carrito.get(opcion - 1) + cantidad);
                System.out.println("Ud ha pedido " + carrito.get(opcion - 1) + " platos de " + Adicionales.get(opcion - 1));
                SubTotal.set(opcion - 1, carrito.get(opcion - 1) * precioAdicionales[opcion + 1]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = f1.nextInt();
                f1.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.MenuRestaurante();
                } else if (opcion == 2) {
                    this.RealizarPago();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }
            }
        }
        else {
            System.out.println("Opcion no válida");
            this.MenuPrincipal();
        }
    }
    public void PatioComida(){
        System.out.println("------ PATIO COMIDA------------");
        System.out.println("Seleccione su menu de compra");
        for (int i = 0; i < menuPatioComida.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + menuPatioComida.get(i));
        }
        opcionpatio = f1.nextInt();
        f1.nextLine();
        if (opcionpatio ==1 && opcionpatio <= ComboBroaster.size()) {
            System.out.println("------ COMBO BROASTER------------");
            System.out.println("Seleccione su compra ");
            for (int i = 0; i < ComboBroaster.size(); i++) {
                System.out.println("Opción " + (i + 1) + " : " + ComboBroaster.get(i));
            }
            opcion = f1.nextInt();
            f1.nextLine();
            if (opcion >= 1 && opcion <= ComboBroaster.size()) {
                System.out.println("¿Cuántos comprará? Ingrese la cantidad");
                cantidad = f1.nextInt();
                f1.nextLine();
                carrito.set(opcion - 1, carrito.get(opcion - 1) + cantidad);
                System.out.println("Ud ha pedido " + carrito.get(opcion - 1) + " platos de " + ComboBroaster.get(opcion - 1));
                SubTotal.set(opcion - 1, carrito.get(opcion - 1) * preciocomboBroaster[opcion + 1]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = f1.nextInt();
                f1.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.MenuRestaurante();
                } else if (opcion == 2) {
                    this.RealizarPago();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }
            }
        }
        else if(opcionpatio == 2 && opcion <= Pollosalabrasa2.size()) {
            System.out.println("------ POLLOS A LA BRASA------------");
            System.out.println("Seleccione su compra ");
            for (int i = 0; i < Pollosalabrasa2.size(); i++) {
                System.out.println("Opción " + (i + 1) + " : " + Pollosalabrasa2.get(i));
            }
            opcion = f1.nextInt();
            f1.nextLine();
            if (opcion >= 1 && opcion <= Pollosalabrasa2.size()) {
                System.out.println("¿Cuántos comprará? Ingrese la cantidad");
                cantidad = f1.nextInt();
                f1.nextLine();
                carrito.set(opcion - 1, carrito.get(opcion - 1) + cantidad);
                System.out.println("Ud ha pedido " + carrito.get(opcion - 1) + " platos de " + Pollosalabrasa2.get(opcion - 1));
                SubTotal.set(opcion - 1, carrito.get(opcion - 1) * precioPollosBrasa2[opcion + 1]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = f1.nextInt();
                f1.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.MenuRestaurante();
                } else if (opcion == 2) {
                    this.RealizarPago();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }
            }
        }
        else if(opcionpatio == 3 && opcion <= MixChauferos2.size()) {
            System.out.println("------MIX CHAUFEROS------------");
            System.out.println("Seleccione su compra ");
            for (int i = 0; i < MixChauferos2.size(); i++) {
                System.out.println("Opción " + (i + 1) + " : " + MixChauferos2.get(i));
            }
            opcion = f1.nextInt();
            f1.nextLine();
            if (opcion >= 3 && opcion <= MixChauferos2.size()) {
                System.out.println("¿Cuántos comprará? Ingrese la cantidad");
                cantidad = f1.nextInt();
                f1.nextLine();
                carrito.set(opcion - 1, carrito.get(opcion - 1) + cantidad);
                System.out.println("Ud ha pedido " + carrito.get(opcion - 1) + " platos de " + MixChauferos2.get(opcion - 1));
                SubTotal.set(opcion - 1, carrito.get(opcion - 1) * precioMixchauferos2[opcion + 1]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = f1.nextInt();
                f1.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.MenuRestaurante();
                } else if (opcion == 2) {
                    this.RealizarPago();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }
            }
        }
        else if(opcionpatio == 4 && opcion <= Salchipapas.size()) {
            System.out.println("------ SALCHIPAPAS------------");
            System.out.println("Seleccione su compra ");
            for (int i = 0; i < Salchipapas.size(); i++) {
                System.out.println("Opción " + (i + 1) + " : " + Salchipapas.get(i));
            }
            opcion = f1.nextInt();
            f1.nextLine();
            if (opcion >= 1 && opcion <= Salchipapas.size()) {
                System.out.println("¿Cuántos comprará? Ingrese la cantidad");
                cantidad = f1.nextInt();
                f1.nextLine();
                carrito.set(opcion - 1, carrito.get(opcion - 1) + cantidad);
                System.out.println("Ud ha pedido " + carrito.get(opcion - 1) + " platos de " + Salchipapas.get(opcion - 1));
                SubTotal.set(opcion - 1, carrito.get(opcion - 1) * preciosalchipapas[opcion + 1]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = f1.nextInt();
                f1.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.MenuRestaurante();
                } else if (opcion == 2) {
                    this.RealizarPago();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }
            }
        }
        else if(opcionpatio == 5 && opcion <= Snacks.size()) {
            System.out.println("------ SNACKS------------");
            System.out.println("Seleccione su compra ");
            for (int i = 0; i < Snacks.size(); i++) {
                System.out.println("Opción " + (i + 1) + " : " + Snacks.get(i));
            }
            opcion = f1.nextInt();
            f1.nextLine();
            if (opcion >= 1 && opcion <= Snacks.size()) {
                System.out.println("¿Cuántos comprará? Ingrese la cantidad");
                cantidad = f1.nextInt();
                f1.nextLine();
                carrito.set(opcion - 1, carrito.get(opcion - 1) + cantidad);
                System.out.println("Ud ha pedido " + carrito.get(opcion - 1) + " platos de " + Snacks.get(opcion - 1));
                SubTotal.set(opcion - 1, carrito.get(opcion - 1) * preciosnacks[opcion + 1]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion = f1.nextInt();
                f1.nextLine();
                if (opcion == 1) {
                    System.out.println("Volviendo a la opción de compra");
                    this.MenuRestaurante();
                } else if (opcion == 2) {
                    this.RealizarPago();
                } else if (opcion == 3) {
                    this.MenuPrincipal();
                } else {
                    System.out.println("Opcion no válida");
                }
            }
        }
        else {
            System.out.println("Opcion no válida");
            this.MenuPrincipal();
        }
    }
    public static boolean verificarVigencia(String fechaExpiracion) {
        try {
            // Formateador para el formato MM/yy
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
            // Parsear la fecha de expiración
            YearMonth fechaExp = YearMonth.parse(fechaExpiracion, formatter);
            // Obtener el mes y año actuales
            YearMonth fechaActual = YearMonth.now();

            // Comparar si la tarjeta sigue siendo válida
            return !fechaExp.isBefore(fechaActual);
        } catch (DateTimeParseException e) {
            System.out.println("La fecha ingresada no es válida. Por favor, usa el formato MM/yy.");
            return false;
        }
    }
    public void RealizarPago() {
        for (int i = 0; i < menuRestaurante.size(); i++) {
            int cantidad = carrito.get(i);
            if (cantidad > 0) {
                double totalRestaurante = SubTotal.get(i);
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, menuRestaurante.get(i), totalRestaurante);
                TotalPago += totalRestaurante;
            }
        }
        for (int i = 0; i < menuPatioComida.size(); i++) {
            int cantidad = carrito.get(i);
            if (cantidad > 0) {
                double totalPatiocomida = SubTotal.get(i);
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, menuPatioComida.get(i), totalPatiocomida);
                TotalPago += totalPatiocomida;
            }
        }
        TotalPago=RealizarPago2();
        igv= TotalPago * 0.18;
        double SubTotal = TotalPago - igv;
        System.out.println("El subTotal es: " + SubTotal);
        System.out.println("El IGV es: " + igv);
        System.out.println("El Total a Pagar de Sus Compras es: " + TotalPago);
        System.out.println("Relizar el Pago");
        System.out.println("   SI  |  NO   ");
        String Pago = f1.nextLine();
        switch (Pago) {
            case "SI":
                System.out.println("Metodo de Pago");
                System.out.println("Opcion 1: Yape");
                System.out.println("Ocpion 2: Tarjeta de credito");
                String OpcPago = f1.nextLine();
                switch (OpcPago) {
                    case "1":
                        while (true) {
                            System.out.println("Ingrese Numero Con una Cuenta Yape");
                            String yape = f1.nextLine();
                            if (yape.length() == 9 && yape.matches("[0-9]+")) {
                                System.out.println("Numero Valido");
                                while (true){
                                    System.out.println("Ingrese Su Codigo De Validacion");
                                    String CodidoYape= f1.nextLine();
                                    if (CodidoYape.length() == 6 && CodidoYape.matches("[0-9]+")){
                                        System.out.println("Codigo Aceptado");
                                        break;
                                    }
                                    else {
                                        System.out.println("Codigo Incorrect0");
                                    }
                                }
                                break;
                            }else {
                                System.out.println("Numero no Valido");
                            }
                        }
                        System.out.println("Se realizo el pago");
                        SoliFactura();
                        break;
                    case "2":
                        while (true) {
                            System.out.println("Ingrese Numero de Tarjeta");
                            String Tarjeta = f1.nextLine();
                            if (Tarjeta.length() == 16 && Tarjeta.matches("[0-9]+")) {
                                System.out.println("Numero Valido");
                                while (true){
                                    System.out.println("Ingrese CVV");
                                    String ICV = f1.nextLine();
                                    if (ICV.length() == 3 && ICV.matches("[0-9]+")){
                                        System.out.println("Numero Valido");
                                        while (true){
                                            System.out.print("Ingresa la fecha de expiración de la tarjeta (MM/yy): ");
                                            String fechaExpiracion = f1.nextLine();
                                            boolean esVigente = verificarVigencia(fechaExpiracion);
                                            if (esVigente) {
                                                System.out.println("La tarjeta está vigente.\nSe ha realizado el pago");
                                                break;
                                            } else {
                                                System.out.println("La tarjeta ha expirado.");
                                            }
                                        }
                                        break;
                                    }
                                    else {
                                        System.out.println("Numero no Valido");
                                    }
                                }
                                f1.nextLine();
                                SoliFactura();
                                break;
                            }else {
                                System.out.println("Numero no Valido");
                            }
                        }
                        break;
                    default:
                        System.out.println("Esta opcion no existe");
                        break;
                }
                break;
            case "NO":
                System.out.println("La compra ha sido cancelada");
                f2.clear();
                f3.clear();
                break;
            default:
                System.out.println("Esta Ocion No Existe");
                break;
        }
    }
    public double RealizarPago2() {
        double Total=0;
        for(double f4:f3){
            Total+=f4;
        }
        return Total;
    }
    public void SoliFactura() {
        System.out.println("""
                Desea Exportar Una Factura?
                | Si |               | No |""");
        String OpcFactura = f1.nextLine();
        switch (OpcFactura) {
            case "Si":
                double neto1=RealizarPago2();
                String nombreRutaArchivo = "D:\\FacturaNorkys.txt";
                try (FileWriter impr = new FileWriter(nombreRutaArchivo)) {

                    impr.write("|-------------------------NORKYS-----------------------------|\n");
                    impr.write("|Nombre: "+Nombre+"-----------------------------------------------|\n");
                    impr.write("|Cantidad|------------------Productos-----------------|Precio|\n");
                    for (String sau : f2) {
                        impr.write(sau + "\n");
                    }
                    impr.write("|------------------------------------------------------------|\n");
                    impr.write("| Total a Pagar |\n");
                    double Igvsau = TotalPago * 0.18;
                    double ResultadoIGV = TotalPago - Igvsau;
                    impr.write("| SUB TOTAL     : S/" + String.format("%.2f", ResultadoIGV) + "\n");
                    impr.write("| IGV           : S/" + String.format("%.2f", Igvsau)+"\n");
                    impr.write("| TOTAL A PAGAR : S/" + neto1 + "\n");
                    impr.write("|-----------------------------------------------------|------|\n");
                    System.out.println("Exportado correctamente en: " + nombreRutaArchivo);
                }catch (IOException e) {
                    System.err.println("Error al crear el archivo en: " + nombreRutaArchivo);
                }
                break;
            case "No":
                System.out.println("La compra se realizo");
                f2.clear();
                f3.clear();
                break;
            default:
                System.out.println("Esta Opcion no existe");
                break;
        }
    }
}