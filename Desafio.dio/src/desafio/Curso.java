package desafio;

public class Curso extends Conteudo {
    
    private int    cargaHoraia;

    public Curso(){

    }
  
    public int getCargaHoraia() {
        return cargaHoraia;
    }
    public void setCargaHoraia(int cargaHoraia) {
        this.cargaHoraia = cargaHoraia;
    }
    @Override
    public String toString() {
        return "Curso [cargaHoraia = " + cargaHoraia + ", descricao = " + getDescricao() + ", titulo = " + getTitulo() + "]";
    }

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO = cargaHoraia;
    }
}