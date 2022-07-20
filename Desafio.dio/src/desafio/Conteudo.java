package desafio;

public abstract class Conteudo {

protected static double XP_PADRAO = 10;
protected String titulo;
protected String descricao;
    
public abstract double calcularXp();


public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}
}
