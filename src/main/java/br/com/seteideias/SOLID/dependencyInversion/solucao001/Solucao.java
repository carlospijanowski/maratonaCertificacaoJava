package br.com.seteideias.SOLID.dependencyInversion.solucao001;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Solucao {

    public class BibliotecaVirtualNoCelular {
        private LocalDateTime dateTime;
        private DriveDeArmazenamento driveDeArmazenamento;

        public BibliotecaVirtualNoCelular(LocalDateTime dateTime, DriveDeArmazenamento driveDeArmazenamento) {
            this.dateTime = dateTime;
            this.driveDeArmazenamento = driveDeArmazenamento;
        }
    }

    public abstract class DriveDeArmazenamento {
        public void colocarNaGaveta(Livro livro) {
        }
        public List<Livro> retirarDaGaveta(){
            return new ArrayList<>();
        }
    }

    public class GoogleDrive extends DriveDeArmazenamento {
    }

    public class OneDrive extends DriveDeArmazenamento {
    }

    public class Livro{
        String nome;
        LocalDateTime dataCadastro;

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

    public void main( ) {
        BibliotecaVirtualNoCelular bibliotecaVirtualNoCelular = new BibliotecaVirtualNoCelular(LocalDateTime.now(), new GoogleDrive());
        Livro livro = new Livro();
        livro.setNome("NOME DO LIVRO.PDF");
        bibliotecaVirtualNoCelular.driveDeArmazenamento.colocarNaGaveta(livro);
    }

}
