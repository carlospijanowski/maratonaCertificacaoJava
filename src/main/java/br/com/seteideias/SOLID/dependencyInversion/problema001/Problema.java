package br.com.seteideias.SOLID.dependencyInversion.problema001;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Problema {

    public class BibliotecaVirtualNoCelular {
        public List<LivroPdf> pegaLivro() {
            DriveDeArmazenamento driveDeArmazenamento = new DriveDeArmazenamento();
            return driveDeArmazenamento.obtemLivros();
        }

        public void adicionaLivro(LivroPdf novolivro) {
            DriveDeArmazenamento driveDeArmazenamento = new DriveDeArmazenamento();
            novolivro.setDataCadastro(LocalDateTime.now());
            driveDeArmazenamento.salvar(novolivro);
        }
    }

    public class DriveDeArmazenamento {
        public void salvar(LivroPdf livroPdf) {
        }

        public List<LivroPdf> obtemLivros() {
            return new ArrayList<>();
        }
    }

    public class LivroPdf {
        String nome;
        LocalDateTime dataCadastro;

        public LivroPdf(String nome, LocalDateTime dataCadastro) {
            this.nome = nome;
            this.dataCadastro = dataCadastro;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public LocalDateTime getDataCadastro() {
            return dataCadastro;
        }

        public void setDataCadastro(LocalDateTime dataCadastro) {
            this.dataCadastro = dataCadastro;
        }
    }

    public void main() {
        BibliotecaVirtualNoCelular bibliotecaVirtualNoCelular = new BibliotecaVirtualNoCelular();
        bibliotecaVirtualNoCelular.pegaLivro();

        LivroPdf novolivro = new LivroPdf("NOME LIVRO", LocalDateTime.now());
        bibliotecaVirtualNoCelular.adicionaLivro(novolivro);
    }

}
