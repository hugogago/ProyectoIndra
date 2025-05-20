package main.java.com.indra;



public class Main {
    public static void main(String[] args) {
        Categoria taller = new Categoria(1, "Taller");
        Categoria conferencia = new Categoria(2, "Conferencia");
        Categoria actividad = new Categoria(3, "Actividad");
       
        
        Organizador org1 = new Organizador(1, "Luis Mariano", "693766543");
        Organizador org2 = new Organizador(2, "Juan García", "456238890");

        Ubicacion ubicacion1 = new Ubicacion(1, "presencial", "Centro Cultural EcoVida, Calle Verde 123, Madrid", "https://tallerdereciclaje.com");
        Ubicacion ubicacion2 = new Ubicacion(2, "presencial", "Auditorio Verde, Avenida Solar 456, Madrid", "https://conferenciaenergias.com");
        Ubicacion ubicacion3 = new Ubicacion(3, "presencial", "Parque Fluvial, Calle del Río 789, Madrid", "https://limpiezarios.com");
        Ubicacion ubicacion4 = new Ubicacion(4, "presencial", "Jardín Comunitario, Calle Verde 321, Madrid", "https://tallercompostaje.com");
        Ubicacion ubicacion5 = new Ubicacion(5, "presencial", "Centro de Formación Verde, Calle Eficiencia 654, Madrid", "https://cursoeficiencia.com");
        Ubicacion ubicacion6 = new Ubicacion(6, "presencial", "Sala de Conferencias, Avenida del Clima 987, Madrid", "https://forojuvenil.com");
        Ubicacion ubicacion7 = new Ubicacion(7, "presencial", "Varias ubicaciones en Madrid", "https://transporteSostenible.com")

        Evento evento1 = new Evento(1, "Taller de reciclaje", 2025-06-10, 3, " En este taller aprenderás técnicas prácticas para reciclar en casa y reducir residuos.", 1, 1, 2);
        Evento evento2 = new Evento(2, "Conferencia sobre energías renovables", 2025-07-05, 2, "Descubre las últimas innovaciones en energía verde y cómo pueden transformar nuestro futuro.", 2, 2, 1);
        Evento evento3 = new Evento(3, "Jornada de limpieza de rios", 2025-8-12, 4, "Colabora con la comunidad en la limpieza de zonas fluviales y ayuda a preservar nuestro entorno.", 3, 1, 2);
        Evento evento4 = new Evento(4, "Taller de compostaje doméstico", 2025-9-03, 2, "Aprende a transformar residuos orgánicos en abono natural y contribuye a un hogar más sostenible.", 4, 2, 2);
        Evento evento5 = new Evento(5, "Curso de eficienca energética en el hogar", 2025-9-15, 3, "Reduce el consumo eléctrico con acciones simples y efectivas para un hogar más eficiente.", 5, 1, 2);
        Evento evento6 = new Evento(6, "Foro juvenil por el clima", 2025-10-01, 5, "Espacio para que jóvenes compartan ideas y proyectos sostenibles para combatir el cambio climático.", 6, 2, 1);
        Evento evento7 = new Evento(7, "Semana del transporte sostenible", 2025-11-20, 7, "Actividades para promover el uso de transporte ecológico y concienciar sobre la movilidad sostenible.", 7, 1, 2);

        Usuario usuario1 = new Usuario(1, "Ana Pérez", "ana@gmail.com", "1234");
        Usuario usuario2 = new Usuario(2, "José Luis", "joseLuis@gmail.com", "abcd");
        Usuario usuario3 = new Usuario(3, "Alvaro Benito", "benitoAlvaro@gmail.com", "1234abcd");
        Usuario usuario4 = new Usuario(4, "Francisco López", "lopezFran@gmail.com", "abcd1234");

    
        System.out.println("\n=== Eventos disponibles ===");
        System.out.println(evento1);
        System.out.println(evento2);
        System.out.println(evento3);
        System.out.println(evento4);
        System.out.println(evento5);
        System.out.println(evento6);
        System.out.println(evento7);



        

    }
}
