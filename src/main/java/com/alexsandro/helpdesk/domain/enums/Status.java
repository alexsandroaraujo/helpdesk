package com.alexsandro.helpdesk.domain.enums;

public enum Status {

    ABERTO (0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO") , ENCERRADO (2, "ENCERRADO");

    private Integer codigo;
    private String descricao;

    Status(Integer codigo, String descricao) {
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

    public static Status toEnum(Integer i) {
        if (i == null) {
            return null;
        }
        for (Status p : Status.values()) {
            if(i.equals(p.getCodigo())) {
                return p;
            }
        }
        throw new IllegalArgumentException("Status inválido!");
    }
}
