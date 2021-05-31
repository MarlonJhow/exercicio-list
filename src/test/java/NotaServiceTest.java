import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        Integer quantidade = notaService.quantidadeDeNotas(notas);

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








}