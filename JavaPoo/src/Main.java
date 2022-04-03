import br.com.dio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java ");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso angular");
    curso2.setDescricao("descrição curso angular ");
    curso2.setCargaHoraria(18);

    Mentoria mentoria= new Mentoria();
    mentoria.setTitulo("mentoria java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());

    /*
    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);*/

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devAndreza = new Dev();
    devAndreza.setNome("Andreza");
    devAndreza.inscreverBootcap(bootcamp);

    System.out.println("conteudos inscritos" + devAndreza.getConteudosInscritos());
    System.out.println("xp " + devAndreza.calcularTotalXp());

    devAndreza.progredir();
    devAndreza.progredir();
    devAndreza.progredir();
    
    System.out.println("conteudos inscritos" + devAndreza.getConteudosInscritos());
    System.out.println("conteudos concuidos" + devAndreza.getConteudosConcluidos());

    System.out.println("----------");
    System.out.println("xp " + devAndreza.calcularTotalXp());
    }
}
