package br.com.control.vendas.cadastro.modelo.clienteOld;

import java.util.ArrayList;
import java.util.List;

public enum Regiao implements IEstadosPorRegiaoStrategy {

    /**
     * Região Centro-Oeste
     */
    CENTROOESTE("Centro-Oeste") {
        @Override
        public List<Estado> getEstados() {
            return estadosPorRegiao(CENTROOESTE);
        }

    },
    
    
    /**
     * Região Nordeste
     */
    NORDESTE("Nordeste") {
        @Override
        public List<Estado> getEstados() {
            return estadosPorRegiao(NORDESTE);
        }
    },
    
    
    /**
     * Região Norte
     */
    NORTE("Norte") {
        @Override
        public List<Estado> getEstados() {
            return estadosPorRegiao(NORTE);
        }
    },
    
    
    /**
     * Região Sudeste
     */
    SUDESTE("Sudeste") {
        @Override
        public List<Estado> getEstados() {
            return estadosPorRegiao(SUDESTE);
        }
    },
    
    
    /**
     * Região Sul
     */
    SUL("Sul") {
        @Override
        public List<Estado> getEstados() {
            return estadosPorRegiao(SUL);
        }
    };
	
	
    /**
     * Variável nome
     */
    private final String nome;

    /**
     * Construtor de região
     *
     * @param nome
     */
    private Regiao(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna nome
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    protected List<Estado> estadosPorRegiao(Regiao regiao) {
        List<Estado> lista = new ArrayList<>();

        for (Estado value : Estado.values()) {
            if (value.getRegiao().equals(regiao)) {
                lista.add(value);
            }
        }
        return lista;
    }
}