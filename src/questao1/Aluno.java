/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author Ederson
 */
public class Aluno {
    
    private String nome;
    private String periodo;
    private String idade;
    private String sexo;
    private String moraemitap;
    private String trabalha;
    private String casado;
    private String filhos;
    private String origem;
    private String ingresso;
    private String cota;
    private String locomocao;
    private String tempochegar;
    private String dependencias;
    private String perdeu;
    private String afinidade;
    private String motivacao;

    public Aluno() {
    }

    public Aluno(String nome, String periodo, String idade, String sexo, String moraemitap, String trabalha, String casado, String filhos, String origem, String ingresso, String cota, String locomocao, String tempochegar, String dependencias, String perdeu, String afinidade, String motivacao) {
        this.nome = nome;
        this.periodo = periodo;
        this.idade = idade;
        this.sexo = sexo;
        this.moraemitap = moraemitap;
        this.trabalha = trabalha;
        this.casado = casado;
        this.filhos = filhos;
        this.origem = origem;
        this.ingresso = ingresso;
        this.cota = cota;
        this.locomocao = locomocao;
        this.tempochegar = tempochegar;
        this.dependencias = dependencias;
        this.perdeu = perdeu;
        this.afinidade = afinidade;
        this.motivacao = motivacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 
    
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMoraemitap() {
        return moraemitap;
    }

    public void setMoraemitap(String moraemitap) {
        this.moraemitap = moraemitap;
    }

    public String getTrabalha() {
        return trabalha;
    }

    public void setTrabalha(String trabalha) {
        this.trabalha = trabalha;
    }

    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    public String getFilhos() {
        return filhos;
    }

    public void setFilhos(String filhos) {
        this.filhos = filhos;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getIngresso() {
        return ingresso;
    }

    public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }

    public String getCota() {
        return cota;
    }

    public void setCota(String cota) {
        this.cota = cota;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }

    public String getTempochegar() {
        return tempochegar;
    }

    public void setTempochegar(String tempochegar) {
        this.tempochegar = tempochegar;
    }

    public String getDependencias() {
        return dependencias;
    }

    public void setDependencias(String dependencias) {
        this.dependencias = dependencias;
    }

    public String getPerdeu() {
        return perdeu;
    }

    public void setPerdeu(String perdeu) {
        this.perdeu = perdeu;
    }

    public String getAfinidade() {
        return afinidade;
    }

    public void setAfinidade(String afinidade) {
        this.afinidade = afinidade;
    }

    public String getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(String motivacao) {
        this.motivacao = motivacao;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", periodo=" + periodo + ", idade=" + idade + ", sexo=" + sexo + ", moraemitap=" + moraemitap + ", trabalha=" + trabalha + ", casado=" + casado + ", filhos=" + filhos + ", origem=" + origem + ", ingresso=" + ingresso + ", cota=" + cota + ", locomocao=" + locomocao + ", tempochegar=" + tempochegar + ", dependencias=" + dependencias + ", perdeu=" + perdeu + ", afinidade=" + afinidade + ", motivacao=" + motivacao + '}';
    }
    
    
    
}
