import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class NotaServiceTest {

    private NotaService notaService = new NotaService();

    @Test
    void somatoriaNotas() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        nota1.setValor(10.00);
        nota2.setValor(20.00);
        nota3.setValor(30.00);
        List<Nota> notas = Arrays.asList(nota1, nota2, nota3);

        Double somatoria = notaService.somarValores(notas);

        assertEquals(60.00, somatoria);
    }

    @Test
    void quantidadeDeNotas() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        nota1.setValor(10.00);
        nota2.setValor(20.00);
        nota3.setValor(30.00);
        List<Nota> notas = Arrays.asList(nota1, nota2, nota3);

        int quantidade = notaService.quantidadeDeNotas(notas);

        assertEquals(3, quantidade);
    }

    @Test
    void idsDasNotas() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        nota1.setId(1L);
        nota2.setId(2L);
        nota3.setId(3L);
        List<Nota> notas = Arrays.asList(nota1, nota2, nota3);

        List<Long> ids = notaService.listaDeIds(notas);

        assertEquals(1L, ids.get(0));
        assertEquals(2L, ids.get(1));
        assertEquals(3L, ids.get(2));
    }

    @Test
    void notasValorMenorQue50() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        Nota nota4 = new Nota();
        Nota nota5 = new Nota();
        nota1.setValor(10.00);
        nota2.setValor(20.00);
        nota3.setValor(30.00);
        nota4.setValor(60.00);
        nota5.setValor(70.00);
        List<Nota> notas = Arrays.asList(nota1, nota2, nota3);

        List<Nota> notaResultado = notaService.listaDeNotasComValorMenorQue50(notas);

        assertEquals(3,notaResultado.size());
        List<Nota> notasErradas = notaResultado.stream().filter(nota -> nota.getValor() > 50.00).collect(Collectors.toList());
        assertTrue(notasErradas.isEmpty());
    }

    @Test
    void descricoesUnicas() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        Nota nota4 = new Nota();
        Nota nota5 = new Nota();
        nota1.setDescricao("batata");
        nota2.setDescricao("peixe");
        nota3.setDescricao("mandioca");
        nota4.setDescricao("peixe");
        nota5.setDescricao("batata");
        List<Nota> notas = Arrays.asList(nota1, nota2, nota3, nota4, nota5);

        List<String> notaResultado = notaService.listaDescricoesUnicas(notas);

        assertEquals(3,notaResultado.size());
    }

    @Test
    void somarInicioComBmasNaoIniciaComBR() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        Nota nota4 = new Nota();
        Nota nota5 = new Nota();
        nota1.setDescricao("batata");
        nota1.setValor(10.0);
        nota2.setDescricao("peixe");
        nota1.setValor(20.0);
        nota3.setDescricao("brioche");
        nota1.setValor(30.0);
        nota4.setDescricao("Bacalhau");
        nota1.setValor(40.0);
        nota5.setDescricao("Brinde");
        nota1.setValor(50.0);
        List<Nota> notas = Arrays.asList(nota1, nota2, nota3, nota4, nota5);

        Double somatoria = notaService.somarInicioComBmasNaoIniciaComBR(notas);
        assertEquals(50, somatoria);
    }

    @Test
    void transformarEmMap() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        Nota nota4 = new Nota();
        Nota nota5 = new Nota();
        nota1.setDescricao("batata");
        nota1.setId(1L);
        nota2.setDescricao("peixe");
        nota2.setId(2L);
        nota3.setDescricao("brioche");
        nota3.setId(3L);
        nota4.setDescricao("Bacalhau");
        nota4.setId(4L);
        nota5.setDescricao("Brinde");
        nota5.setId(5L);

        List<Nota> notas = Arrays.asList(nota1, nota2, nota3, nota4, nota5);
        Map<Long, Nota> resultado = notaService.transformarEmMap(notas);

        assertEquals("batata", resultado.get(1L).getDescricao());
        assertEquals("peixe", resultado.get(2L).getDescricao());
        assertEquals("brioche", resultado.get(3L).getDescricao());
        assertEquals("Bacalhau", resultado.get(4L).getDescricao());
        assertEquals("Brinde", resultado.get(5L).getDescricao());
    }

    @Test
    void retornarListaDeChaves() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        Nota nota4 = new Nota();
        Nota nota5 = new Nota();
        nota1.setDescricao("batata");
        nota1.setId(1L);
        nota2.setDescricao("peixe");
        nota2.setId(2L);
        nota3.setDescricao("brioche");
        nota3.setId(3L);
        nota4.setDescricao("Bacalhau");
        nota4.setId(4L);
        nota5.setDescricao("Brinde");
        nota5.setId(5L);

        Map<Long, Nota> map = new HashMap<>();
        map.put(nota1.getId(),nota1);
        map.put(nota2.getId(),nota2);
        map.put(nota3.getId(),nota3);
        map.put(nota4.getId(),nota4);
        map.put(nota5.getId(),nota5);

        List<Long> resultado = notaService.retornarListaDeChaves(map);

        assertTrue(resultado.contains(1L));
        assertTrue(resultado.contains(2L));
        assertTrue(resultado.contains(3L));
        assertTrue(resultado.contains(4L));
        assertTrue(resultado.contains(5L));
    }

    @Test
    void retornarListaDeValores() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        Nota nota4 = new Nota();
        Nota nota5 = new Nota();
        nota1.setDescricao("batata");
        nota1.setId(1L);
        nota2.setDescricao("peixe");
        nota2.setId(2L);
        nota3.setDescricao("brioche");
        nota3.setId(3L);
        nota4.setDescricao("Bacalhau");
        nota4.setId(4L);
        nota5.setDescricao("Brinde");
        nota5.setId(5L);

        Map<Long, Nota> map = new HashMap<>();
        map.put(nota1.getId(),nota1);
        map.put(nota2.getId(),nota2);
        map.put(nota3.getId(),nota3);
        map.put(nota4.getId(),nota4);
        map.put(nota5.getId(),nota5);

        List<Nota> resultado = notaService.retornarListaDeValores(map);

        assertTrue(resultado.contains(nota1));
        assertTrue(resultado.contains(nota2));
        assertTrue(resultado.contains(nota3));
        assertTrue(resultado.contains(nota4));
        assertTrue(resultado.contains(nota5));
    }

    @Test
    void mapComQuantasVezesADescricaoSeRepete() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        Nota nota4 = new Nota();
        Nota nota5 = new Nota();
        Nota nota6 = new Nota();
        nota1.setDescricao("peixe");
        nota2.setDescricao("batata");
        nota3.setDescricao("ovo");
        nota4.setDescricao("batata");
        nota5.setDescricao("peixe");
        nota6.setDescricao("peixe");

        List<Nota> notas = Arrays.asList(nota1, nota2, nota3, nota4, nota5, nota6);
        Map<String, Integer> resultado = notaService.mapComQuantasVezesADescricaoSeRepete(notas);

        assertEquals(3, resultado.get("peixe"));
        assertEquals(2, resultado.get("batata"));
        assertEquals(1, resultado.get("ovo"));
    }

    @Test
    void converterListParaSet() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        nota1.setDescricao("peixe");
        nota2.setDescricao("batata");
        nota3.setDescricao("ovo");

        List<Nota> notas = Arrays.asList(nota1, nota2, nota3);
        Set<Nota> resultado = notaService.converterListParaSet(notas);

        assertTrue(resultado.contains(nota1));
        assertTrue(resultado.contains(nota2));
        assertTrue(resultado.contains(nota3));
    }

    @Test
    void converterSetParaListEOrdenarPorId() {
        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();
        Nota nota4 = new Nota();
        Nota nota5 = new Nota();
        Nota nota6 = new Nota();
        nota1.setId(3L);
        nota2.setId(10L);
        nota3.setId(12L);
        nota4.setId(1L);
        nota5.setId(7L);
        nota6.setId(9L);

        HashSet<Nota> notas = new HashSet<>(Arrays.asList(nota1, nota2, nota3, nota4, nota5, nota6));
        List<Nota> resultado = notaService.converterSetParaListEOrdenarPorId(notas);

        assertEquals(nota4, resultado.get(0));
        assertEquals(nota1, resultado.get(1));
        assertEquals(nota5, resultado.get(2));
        assertEquals(nota6, resultado.get(3));
        assertEquals(nota2, resultado.get(4));
        assertEquals(nota3, resultado.get(5));
    }

}