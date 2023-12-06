package com.alexsandro.helpdesk.domain.enums;

public enum Prioridade {

    BAIXA (0, "BAIXA"), MEDIA(1, "MEDIA") , ALTA (2, "ALTA");

    private Integer codigo;
    private String descricao;

    Prioridade(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static Prioridade toEnum(Integer i) {
        if (i == null) {
            return null;
        }
        for (Prioridade p : Prioridade.values()) {
            if(i.equals(p.getCodigo())) {
                return p;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida!");
    }
}
