import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTituto("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTituto("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTituto("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

      /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");


        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);



        Dev devLarissa = new Dev();
        devLarissa.setNome("Larissa");
        devLarissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Larissa:" + devLarissa.getConteudosInscritos());
        devLarissa.progredir();
        devLarissa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Larissa:" + devLarissa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Larissa:" + devLarissa.getConteudosConcluidos());
        System.out.println("XP:" + devLarissa.calcularTotalXp());

        System.out.println("-------");

        Dev devLuis = new Dev();
        devLuis.setNome("Luis");
        devLuis.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luis:" + devLuis.getConteudosInscritos());
        devLuis.progredir();
        devLuis.progredir();
        devLuis.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Luis:" + devLuis.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Luis:" + devLuis.getConteudosConcluidos());
        System.out.println("XP:" + devLuis.calcularTotalXp());



    }
}
