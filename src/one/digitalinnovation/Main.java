package one.digitalinnovation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Matheus");
        aluno.put("Idade", "19");
        aluno.put("Media", "9.8");
        aluno.put("Turma", "3A");
        aluno.put("Sexo", "M");

        System.out.println(aluno);

        System.out.println(aluno.keySet());

        System.out.println(aluno.values());

        List<Map<String, String>> listAlunos = new ArrayList<>();

        listAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Castro");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.8");
        aluno2.put("Turma", "3A");
        aluno2.put("Sexo", "M");

        listAlunos.add(aluno2);

        System.out.println(aluno2);

        System.out.println(listAlunos);

        System.out.println(aluno.containsKey("Nome"));
    }
}
