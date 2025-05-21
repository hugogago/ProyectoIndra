package main.java.com.indra;

import java.util.ArrayList;

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
        Ubicacion ubicacion7 = new Ubicacion(7, "presencial", "Varias ubicaciones en Madrid", "https://transporteSostenible.com");

        Evento evento1 = new Evento(1, "Taller de reciclaje", 2025-06-10, 3, " En este taller aprenderás técnicas prácticas para reciclar en casa y reducir residuos.", taller,ubicacion1,org1);
        Evento evento2 = new Evento(2, "Conferencia sobre energías renovables", 2025-07-05, 2, "Descubre las últimas innovaciones en energía verde y cómo pueden transformar nuestro futuro.",conferencia,ubicacion2,org2);
        Evento evento3 = new Evento(3, "Jornada de limpieza de rios", 2025-8-12, 4, "Colabora con la comunidad en la limpieza de zonas fluviales y ayuda a preservar nuestro entorno.",actividad,ubicacion3,org1);
        Evento evento4 = new Evento(4, "Taller de compostaje doméstico", 2025-9-03, 2, "Aprende a transformar residuos orgánicos en abono natural y contribuye a un hogar más sostenible.",taller,ubicacion4,org1 );
        Evento evento5 = new Evento(5, "Curso de eficienca energética en el hogar", 2025-9-15, 3, "Reduce el consumo eléctrico con acciones simples y efectivas para un hogar más eficiente.",actividad,ubicacion5,org2 );
        Evento evento6 = new Evento(6, "Foro juvenil por el clima", 2025-10-01, 5, "Espacio para que jóvenes compartan ideas y proyectos sostenibles para combatir el cambio climático.",actividad,ubicacion6,org2 );
        Evento evento7 = new Evento(7, "Semana del transporte sostenible", 2025-11-20, 7, "Actividades para promover el uso de transporte ecológico y concienciar sobre la movilidad sostenible.",actividad,ubicacion7,org1 );

        Usuario usuario1 = new Usuario(1, "Ana Pérez", "ana@gmail.com", "1234");
        Usuario usuario2 = new Usuario(2, "José Luis", "joseLuis@gmail.com", "abcd");
        Usuario usuario3 = new Usuario(3, "Alvaro Benito", "benitoAlvaro@gmail.com", "1234abcd");
        Usuario usuario4 = new Usuario(4, "Francisco López", "lopezFran@gmail.com", "abcd1234");
        Usuario usuario5 = new Usuario(5, "Lucía Martínez", "lucia.martinez@gmail.com", "lucia2025");
        Usuario usuario6 = new Usuario(6, "Carlos Díaz", "carlos.diaz@gmail.com", "car123diaz");
        Usuario usuario7 = new Usuario(7, "Elena Torres", "elena.torres@gmail.com", "et2025!");


        GestorEventos gestor = new GestorEventos(10);
        gestor.agregarEvento(evento1);
        gestor.agregarEvento(evento2);
        gestor.agregarEvento(evento3);
        gestor.agregarEvento(evento4);
        gestor.agregarEvento(evento5);
        gestor.agregarEvento(evento6);
        gestor.agregarEvento(evento7);

        System.out.println("Lista de Eventos:");
        gestor.listarEventos();

        System.out.println("\n Detalles:");
        gestor.mostrarDetalles();

        Inscripcion inscripcion = new Inscripcion(usuario1, evento7, 2025-9-02);
        Inscripcion inscripcion2 = new Inscripcion(usuario5, evento6, 2025-9-03);
        Inscripcion inscripcion3 = new Inscripcion(usuario2, evento3, 2025-9-04);
        Inscripcion inscripcion4 = new Inscripcion(usuario3, evento5, 2025-9-05);
        Inscripcion inscripcion5 = new Inscripcion(usuario4, evento4, 2025-9-06);
        Inscripcion inscripcion6 = new Inscripcion(usuario6, evento2, 2025-9-07);
        Inscripcion inscripcion7 = new Inscripcion(usuario7, evento1, 2025-9-8);

        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        inscripciones.add(inscripcion);
        inscripciones.add(inscripcion2);
        inscripciones.add(inscripcion3);
        inscripciones.add(inscripcion4);
        inscripciones.add(inscripcion5);
        inscripciones.add(inscripcion6);
        inscripciones.add(inscripcion7);

        System.out.println("===== INSCRIPCIONES REGISTRADAS =====");
        for (Inscripcion ins : inscripciones) {
            System.out.println(ins); 
        }

        

    }
}
