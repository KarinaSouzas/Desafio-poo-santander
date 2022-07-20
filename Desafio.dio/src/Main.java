import java.time.LocalDate;

import desafio.Bootcamp;
import desafio.Curso;
import desafio.Dev;
import desafio.Mentoria;

public class Main {
    public static void main(String[] args){
    Curso curso1 = new Curso();
    curso1.setTitulo("curso JavaScript");
    curso1.setDescricao(" JavaScript");
    curso1.setCargaHoraia(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso HTML e CSS");
    curso2.setDescricao(" HTML e CSS");
    curso2.setCargaHoraia(8);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria Full stack");
    mentoria.setDescricao(" mentoria desenvolvedor Full Stack");
    mentoria.setData(LocalDate.now());

 
    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);*/

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Js na pratica");
    bootcamp.setDescricao("Aprendendo a programar");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devKarina = new Dev();
    devKarina.setNome("Karina");
    devKarina.inscreverBootcamp(bootcamp);
    System.out.println("____________________________________________________________________________");
    System.out.println("Inscritos de Karina " + devKarina.getConteudosinscritos());
    System.out.println("____________________________________________________________________________");
    devKarina.progredir();
    devKarina.progredir();
    System.out.println("Inscritos de Karina " + devKarina.getConteudosinscritos());
    System.out.println("");
    System.out.println("Concluidos de Karina " + devKarina.getConteudoConcluidos());
    System.out.println("____________________________________________________________________________");
    System.out.println("XP: " + devKarina.calcularTotalXp() );

    Dev devJosefina = new Dev();
    devJosefina.setNome("Josefina");
    devJosefina.inscreverBootcamp(bootcamp);
    System.out.println("Inscritos de Josefina" + devJosefina.getConteudosinscritos());
    devJosefina.progredir();
    devJosefina.progredir();
    devJosefina.progredir();
    System.out.println("____________________________________________________________________________");
    System.out.println("Inscritos de Josefina" + devJosefina.getConteudosinscritos());
    System.out.println("");
    System.out.println("Concluidos de Josefina" + devJosefina.getConteudoConcluidos());
    System.out.println("XP: " + devJosefina.calcularTotalXp() );
   
    }
}
