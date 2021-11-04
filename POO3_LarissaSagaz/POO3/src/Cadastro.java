import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Cadastro {
    private List<VitimasPOA> dados = new ArrayList<>();
    private List <VitimasPOA> novosDados = new ArrayList<>();

    public List<VitimasPOA> recebeArquivo(String filename) throws DadosAbertosException {
        Path arquivo = Paths.get(filename);
        try (BufferedReader reader = Files.newBufferedReader(arquivo, Charset.defaultCharset())) {
            String line;
            while ((line = reader.readLine()) != null) {
                ArrayList<String> dado;
                dado = new ArrayList<>(Arrays.asList(line.split(";")));
                if (dado.size() < 30) {
                    int aux = 30 - dado.size();
                    for (int i = 1; i <= aux; i++) {
                        dado.add("");
                    }
                }
                VitimasPOA vitimaspoa = criaArray(dado);
                dados.add(vitimaspoa);
            }
        } catch (IOException e) {
            throw new DadosAbertosException("Falha nos dados abertos, tente digitar cat_vitimas.csv");
        }
        return dados;
    }
        private static VitimasPOA criaArray(ArrayList<String> dado) {
        String data_extracao = dado.get(0);
        String longitude = dado.get(1);
        String latitude = dado.get(2);
        String idacidente = dado.get(3);
        String data = dado.get(4);
        String hora = dado.get(5);
        String idade = dado.get(6);
        String sexo = dado.get(7);
        String sit_vitima = dado.get(8);
        String log1 = dado.get(9);
        String log2 = dado.get(10);
        String predial1 = dado.get(11);
        String regiao = dado.get(12);
        String tipo_acid = dado.get(13);
        String auto = dado.get(14);
        String taxi = dado.get(15);
        String onibus_urb = dado.get(16);
        String onibus_met = dado.get(17);
        String onibus_int = dado.get(18);
        String caminhao = dado.get(19);
        String moto = dado.get(20);
        String carroca = dado.get(21);
        String bicicleta = dado.get(22);
        String outro = dado.get(23);
        String lotacao = dado.get(24);
        String dia_sem = dado.get(25);
        String periododia = dado.get(26);
        String fx_et = dado.get(27);
        String tipo_veic = dado.get(28);
        String consorcio = dado.get(29);

        return new VitimasPOA(data_extracao, longitude, latitude, idacidente, data, hora, idade, sexo, sit_vitima, log1, log2, predial1, regiao, tipo_acid, auto, taxi, onibus_urb, onibus_met, onibus_int, caminhao, moto, carroca, bicicleta, outro, lotacao, dia_sem, periododia, fx_et, tipo_veic, consorcio);
    }

    public void printaDados() throws DadosAbertosException {
        if (dados.isEmpty()){
            throw new DadosAbertosException("Dados não foram carregados corretamente.");
        }
        else{
            System.out.println(dados);
        }
    }

    public void procuraLog(String input_log) throws DadosAbertosException {
        input_log = input_log.toUpperCase(Locale.ROOT);
        for (VitimasPOA v : dados) {
            if (input_log.equals(v.getLog1())) {
                System.out.println(v);
                novosDados.add(v);
            }
        }if(novosDados.isEmpty()){
            throw new DadosAbertosException("Nenhum cadastro foi encontrado com esse logradouro, ou o mesmo nao existe.");
        }
    }

    public void gravaArquivo(String novoArquivo) throws DadosAbertosException{
        Path path = Paths.get(novoArquivo);
        if (novosDados.isEmpty()){
            throw new DadosAbertosException("Erro, gravacao de arquivos foi cancelada.");
        }
        try (PrintWriter bw = new PrintWriter(Files.newBufferedWriter(path, Charset.defaultCharset()))) {
            for (VitimasPOA v : novosDados){
                bw.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;\n", v.getData_extracao(), v.getLongitude(), v.getLatitude(), v.getIdacidente(), v.getData(), v.getHora(), v.getIdade(), v.getSexo(), v.getSit_vitima(), v.getLog1(), v.getLog2(), v.getPredial1(), v.getRegiao(), v.getTipo_acid(), v.getAuto(), v.getTaxi(), v.getOnibus_urb(), v.getOnibus_met(), v.getOnibus_int(), v.getCaminhao(), v.getMoto(), v.getCarroca(), v.getBicicleta(), v.getOutro(), v.getLotacao(), v.getDia_sem(), v.getPeriododia(), v.getFx_et(), v.getTipo_veic(), v.getConsorcio());
            }
            System.out.println("Arquivo criado.");
        } catch (IOException e) {
            throw new DadosAbertosException("Falha nos dados abertos.");
        }
    }
}

