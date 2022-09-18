/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package life.project;

import java.util.Scanner; // Importamos la Clase Scanner
/**
 *
 * @author JESUS
 */
public class LifeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROGRAMA DE PRUEBA: VERSIÓN 1.0
        
        // Declaración de un Nuevo Objeto de Tipo Scanner
        
        Scanner teclado = new Scanner(System.in);
        
        // Declaración e Inicialización de: Constantes, Variables y Variables Auxiliares
        
        final int estacionesAño = 4; // Estaciones del Año en un Hemisferio
        final int observacionesNaturales = 3; // Observaciones Astronómicas
        final int celebracionesOrdinariasAnuales = 7; // Calendario de Festividades Oficiales Anuales para algunas Regiones
        final int siglo = 100; // Años
        final  int decada = 10; // Años
        final int quinquenio = 5; // Años
        final int trienio = 3; // Años
        final int year = 1; // Año 
        int meses = 12; // Meses x año
        int semanas = 52; // Semanas x año
        int semana = 7; // Días x semana
        int dias = 365; // Días x año 
        int horas = 24; // Horas x día
        int hora = 60; // Minutos x hora
        int minutos = 60; // Segundos x minutos
        int descanso = 8; // Horas
        int estudio = 4; // Horas
        int trabajo = 4; // Horas
        int ocio = 2; // Horas
        int entretenimiento = 2; // Horas
        int necesidadesBiologicas = 8; // Horas
        int alimentacion = 3; // Horas
        int finDeSemana = 2; // Días de cada Fin de Semana de cada mes
        int viajes = 2; // Viajes por quincena de vacaciones laborales al año
               
        // Solicitud y Recogida de Datos por Teclado
        
        System.out.println("Introduce el Año Actual: "); 
        int anioActual = teclado.nextInt();
        
        System.out.println("Introduce el Año de Nacimiento: ");
        int nacimiento = teclado.nextInt();
        
        // Operaciones, Procesos o Procedimientos de Cálculo
        
        int resultadoUno = anioActual - nacimiento; // Calculamos los Años Vividos
        int resultadoDos = nacimiento + siglo; // Calculamos Fecha Final del Siglo
        int resultadoTres = resultadoDos - anioActual; // Calculamos  los Años por Vivir
        int resultadoCuatro = siglo / decada; // Calculamos Décadas de un Siglo
        int resultadoCinco = siglo / quinquenio; // Calculamos Quinquenios de un Siglo
        double resultadoSeis = siglo / trienio; // Calculamos Trienios de un Siglo
        int resultadoSiete = siglo / year; // Calculamos Años de un Siglo
        int resultadoOcho = siglo * meses; // Calculamos Meses de un Siglo
        int resultado9 = siglo * semanas; // Calculamos Semanas de un Siglo
        int resultado10 = dias * siglo; // Calculamos Días de un Siglo
        int resultado11 = horas * (dias * siglo); // Calculamos Horas de un Siglo
        int resultado12 = (hora * horas) * dias * siglo; // Calculamos Minutos de un Siglo
        long resultado13 = (minutos * hora) * (horas * dias) * siglo; // Calculamos Segundos de un Siglo
        int resultado14 = dias * horas; // Calculamos Horas de un Año
        int resultado15 = dias * (horas * hora); // Calculamos Minutos de un Año 
        int resultado16 = dias * horas * hora * minutos; // Calculamos Segundos de un Año
        int resultado17 = semana * descanso; // Calculamos Horas de Domir en una Semana
        int resultado18 = semana * alimentacion; // Calculamos Horas de Comer en una Semana
        int resultado19 = semana * estudio; // Calculamos Horas de Estudio en una Semana
        int resultado20 = semana * trabajo; // Calculamos Horas de Trabajo en una Semana
        int resultado21 = semana * ocio; // Calculamos Horas de Ocio (Deporte, Restauración, Ocio Nocturno, ...) en un Semana
        int resultado22 = semana * entretenimiento; // Calculamos Horas de Entretenimiento (Música, Radio, Cine, Internet, Artes y Artesanía -escritura, lectura, pintura, ...-, Ciencias, ...)
        int resultado23 = semana * necesidadesBiologicas; // Calculamos Horas de Necesidades Biológicas (Higiene Personal, Compras, Tareas Domesticas -Higiene del Hogar-, ...)
        int resultado24 = semanas * finDeSemana; // Calculamos los Fines de Semana de un Año (Conjunto de 2 días)
        int preNatal = nacimiento - 1; // Etapa prenatal
        int infancia = nacimiento + 3; // Etapa infancia
        int childhood = infancia + 4; // Etapa niñez
        int preAdolescencia = childhood + 7; // Etapa preadolescencia
        int adolescencia = preAdolescencia + 7; // Etapa adolescencia
        int juventud = adolescencia + 7; // Etapa juventud
        int preAdultez = juventud + 7; // Etapa preadultez
        int adultez = preAdultez + 7; // Etapa adultez
        int preVejez = adultez + 23; // Etapa prevejez
        int vejez = preVejez + 7; // Etapa vejez
        int preAncianidad = vejez + 7; // Etapa preancianidad
        int ancianidad = preAncianidad + 7; // Etapa ancianidad
        int resultado25 = resultadoTres * estacionesAño; // Total de Estaciones del Año para el resto del ciclo vital
        int resultado26 = resultadoTres * observacionesNaturales; // Total de posibles Observaciones Astrofísicas
        int resultado27 = resultadoTres * celebracionesOrdinariasAnuales; // Total de posibles Fiestas Ordinarias
        int resultado28 = resultadoTres * (estacionesAño/4);
        int resultado29 = resultadoTres * viajes;
        
        //Salida de Datos por Pantalla de Resultado de Ánálisis
        
        System.out.println("--------------------------------------------------------");
        System.out.println("ANÁLISIS GENERAL: UN SIGLO DE VIDA");
        System.out.println("--------------------------------------------------------");
        System.out.println();
        
        System.out.println("Has vivido: " + resultadoUno + " años hasta " + anioActual);
        System.out.println();
        System.out.println("Serías Centenario en: " + resultadoDos);
        System.out.println();
        System.out.println("Restan para que cumplas un Siglo de Vida: " + resultadoTres + " años");
        System.out.println();
        System.out.println("Entre " + nacimiento + " y " + resultadoDos + " podrías vivir " + resultadoCuatro + " decadas");
        System.out.println();
        System.out.println("Entre " + nacimiento + " y " + resultadoDos + " podrías vivir " + resultadoCinco + " quinquenios");
        System.out.println();
        System.out.println("Entre " + nacimiento + " y " + resultadoDos + " podrías vivir " + resultadoSeis + " trienios");
        System.out.println();
        System.out.println("Entre " + nacimiento + " y " + resultadoDos + " podrías vivir " + resultadoSiete + " años");
        System.out.println();
        System.out.println("Entre " + nacimiento + " y " + resultadoDos + " podrías vivir " + resultadoOcho + " meses");
        System.out.println();
        System.out.println("Entre " + nacimiento + " y " + resultadoDos + " podrías vivir " + resultado9 + " semanas");
        System.out.println();
        System.out.println("Entre " + nacimiento + " y " + resultadoDos + " podrías vivir " + resultado10 + " días");
        System.out.println();
        System.out.println("Entre " + nacimiento + " y " + resultadoDos + " podrías vivir " + resultado11 + " horas");
        System.out.println();
        System.out.println("Entre " + nacimiento + " y " + resultadoDos + " podrías vivir " + resultado12 + " minutos");
        System.out.println();
        System.out.println("Entre " + nacimiento + " y " + resultadoDos + " podrías vivir " + resultado13 + " segundos");
        System.out.println();
        
        System.out.println("---------------------------------------------------------");
        System.out.println("ANÁLISIS ESPECÍFICO: UN AÑO DE VIDA");
        System.out.println("---------------------------------------------------------");
        System.out.println();
        
        System.out.println("En un año vivirías " + meses + " meses");
        System.out.println();
        System.out.println("En un año vivirías " + semanas + " semanas");
        System.out.println();
        System.out.println("En un año vivirías " + dias + " días");
        System.out.println();
        System.out.println("En un año vivirías " + resultado14 + " horas");
        System.out.println();
        System.out.println("En un año vivirías " + resultado15 + " minutos");
        System.out.println();
        System.out.println("En un año vivirías " + resultado16 + " segundos");
        System.out.println();
        
        System.out.println("------------------------------------");
        System.out.println("ANÁLISIS DEL PASADO");
        System.out.println("------------------------------------");
        System.out.println();
       
        System.out.println("Has vivido " + resultadoUno + " años de vida");
        System.out.println();
        
        System.out.println("Entre " + preNatal + " y " + nacimiento + " viviste 9 meses de vida en el Útero de tu Madre");
        System.out.println();
        
        System.out.println("Entre " + nacimiento + " y " + infancia + " viviste 3 años de vida: la Infancia");
        System.out.println();
        
        System.out.println("Entre " + infancia + " y " + childhood + " viviste 7 años de vida: la Niñez");
        System.out.println();
        
        System.out.println("Entre " + childhood + " y " + preAdolescencia + " viviste 14 años de vida: Pre Adolescencia");
        System.out.println();
        
        System.out.println("Entre " + preAdolescencia + " y " + adolescencia + " viviste 21 años de vida: la Adolescencia ");
        System.out.println();
        
        System.out.println("Entre " + adolescencia + " y " + juventud + " viviste 28 años de vida: la Juventud");
        System.out.println();
        
        System.out.println("Entre " + juventud + " y " + preAdultez + " viviste 35 años de vida: la Pre Adultez");
        System.out.println();
        
        System.out.println("Entre " + preAdultez + " y " + adultez + " viviste 42 años de vida: la Adultez");
        System.out.println();        
         
        System.out.println("----------------------------------------");
        System.out.println("ANÁLISIS DEL PRESENTE");
        System.out.println("----------------------------------------");
        System.out.println();
        
        System.out.println("Cada semana descansarías " + resultado17 + " horas");
        System.out.println();
        System.out.println("Cada semana te alimentarías " + resultado18 + " horas");
        System.out.println();
        System.out.println("Cada semana estudiarías " + resultado19 + " horas");
        System.out.println();
        System.out.println("Cada semana trabajarías a media jornada " + resultado20 + " horas");
        System.out.println();
        System.out.println("Cada semana tendrías de ocio " + resultado21 + " horas");
        System.out.println();
        System.out.println("Cada semana tendrías de entretenimiento " + resultado22 + " horas");
        System.out.println();
        System.out.println("Cada semana dedicarías a las necesidades biológicas " + resultado23 + " horas");
        System.out.println();
        System.out.println("Cada año podrías disfrutar de: " + resultado24 + " días en Fin de Semana");
        
        System.out.println("------------------------------------");
        System.out.println("ANÁLISIS DEL FUTURO");
        System.out.println("------------------------------------");
        System.out.println();
        
        System.out.println("Entre " + adultez + " y " + preVejez + " viviras 65 años de vida: la Pre Vejez");
        System.out.println();
        
        System.out.println("Entre " + preVejez + " y " + vejez + " viviras 72 años de vida: la Vejez");
        System.out.println();
        
         System.out.println("Entre " + vejez + " y " + preAncianidad + " viviras 79 años de vida: la Pre Ancianidad ");
         System.out.println();
        
         System.out.println("Entre " + preAncianidad + " y " + ancianidad + " viviras 86 años de vida: la Ancianidad hacia la Centuria");
         System.out.println();
         
         System.out.println("En " + resultadoTres + " años podrás vivir: " + resultado25 + " Estaciones del Año");
         System.out.println();
         
         System.out.println("En " + resultadoTres + " años podrás vivir: " + resultado28 + " Inviernos");
         System.out.println();
         
         System.out.println("En " + resultadoTres + " años podrás vivir: " + resultado28 + " Primaveras");
         System.out.println();
         
         System.out.println("En " + resultadoTres + " años podrás vivir: " + resultado28 + " Veranos");
         System.out.println();
         
         System.out.println("En " + resultadoTres + " años podrás vivir: " + resultado28 + " Otoños");
         System.out.println();
         
         System.out.println("En " + resultadoTres + " años podrás contemplar: " + resultado26 + " Fenómenos Naturales (Amanecer, Atardecer y Anochecer)");
         System.out.println();
         
         System.out.println("En " + resultadoTres + " años podrás disfrutar un Total de: " + resultado27 + " Celebraciones de Fiestas Ordinarias Anuales (Navidad, Carnaval, Semana Santa, Feria,1 de Mayo, Vacaciones de Verano, Romería, ...)");
         System.out.println();
         
         System.out.println("En " + resultadoTres + " años podrás visitar, realizando 2 viajes por año: " + resultado29 + " Espacios Naturales, Ciudades o Países durante las vacaciones.");
         System.out.println();
         
         System.out.println("---------------------------");
         System.out.println("FIN DE PROGRAMA");
         System.out.println("---------------------------");
    }
    
}
