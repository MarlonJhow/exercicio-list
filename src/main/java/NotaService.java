import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NotaService {

    /**
     * Deve retornar a soma dos valores das notas
     */
    public Double somarValores(List<Nota> notas) {

        return null;
    }

    /**
     * Deve retornar a quantidade de notas da lista
     */
    public Integer quantidadeDeNotas(List<Nota> notas) {

        return null;
    }

    /**
     * Deve retornar uma lista de Long contendo os Ids das notas
     */
    public List<Long> listaDeIds(List<Nota> notas) {

        return null;
    }

    /**
     * Deve retornar uma lista de Notas com o valor menor de 50.00
     */
    public List<Nota> listaDeNotasComValorMenorQue50(List<Nota> notas) {

        return null;
    }

    /**
     * Deve retornar uma lista de String contendo as descricoes unicas(Sem repetir)
     */
    public List<String> listaDescricoesUnicas(List<Nota> notas) {

        return null;
    }


    /**
     * Somar valor de todas as notas que começam com a letra B na descricao, entretanto não somar quando iniciei com BR(maisculo ou minusculo)
     */
    public Double somarInicioComBmasNaoIniciaComBR(List<Nota> notas) {

        return null;
    }

    /**
     * Transformar a List de Notas em um Map onde a chave é o Id e o valor é a Nota
     */
    public Map<Long,Nota> transformarEmMap(List<Nota> notas) {
    return null;
    }

    /**
     * Retornar uma lista contendo todas as chaves do map
     */
    public List<Long> retornarListaDeChaves(Map<Long,Nota> map) {

        return null;
    }

    /**
     * Retornar uma lista contendo todos os valores do map
     */
    public List<Nota> retornarListaDeValores(Map<Long, Nota> map) {

        return null;
    }

    /**
     * Verificar quantas vezes a descricao se repete
     * Deve retornar um Map onde a chave é a descrição e o valor é a quantidade de vezes que a descricao se repetiu na lista
     */
    public Map<String, Integer> mapComQuantasVezesADescricaoSeRepete(List<Nota> notas) {

        return null;
    }

    /**
     * Converter List de Notas para Set de Notas
     */
    public Set<Nota> converterListParaSet(List<Nota> notas) {

        return null;
    }

    /**
     * Converter Set de Notas para List de Notas e order por id
     */
    public List<Nota> converterSetParaListEOrdenarPorId(Set<Nota> notas) {

        return null;
    }

    /**
     * Retornar uma nota onde o campo vencida retorne true sem alterar a classe Nota
     * Obs: Criar uma classe filha de nota
     */
    public Nota retornarNotaVencidaTrue() {
        return null;
    }
}
