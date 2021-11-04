public class VitimasPOA {
    private String data_extracao;
    private String longitude;
    private String latitude;
    private String idacidente; //
    private String data;
    private String hora;
    private String idade; //
    private String sexo;
    private String sit_vitima;
    private String log1;
    private String log2;
    private String predial1; //
    private String regiao;
    private String tipo_acid;
    private String auto; //
    private String taxi; //
    private String onibus_urb; //
    private String onibus_met; //
    private String onibus_int; //
    private String caminhao; //
    private String moto; //
    private String carroca; //
    private String bicicleta; //
    private String outro; //
    private String lotacao; //
    private String dia_sem;
    private String periododia;
    private String fx_et;
    private String tipo_veic;
    private String consorcio;

    public String getData_extracao() {
        return data_extracao;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getIdacidente() {
        return idacidente;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSit_vitima() {
        return sit_vitima;
    }

    public String getLog2() {
        return log2;
    }

    public String getPredial1() {
        return predial1;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getTipo_acid() {
        return tipo_acid;
    }

    public String getAuto() {
        return auto;
    }

    public String getTaxi() {
        return taxi;
    }

    public String getOnibus_urb() {
        return onibus_urb;
    }

    public String getOnibus_met() {
        return onibus_met;
    }

    public String getOnibus_int() {
        return onibus_int;
    }

    public String getCaminhao() {
        return caminhao;
    }

    public String getMoto() {
        return moto;
    }

    public String getCarroca() {
        return carroca;
    }

    public String getBicicleta() {
        return bicicleta;
    }

    public String getOutro() {
        return outro;
    }

    public String getLotacao() {
        return lotacao;
    }

    public String getDia_sem() {
        return dia_sem;
    }

    public String getPeriododia() {
        return periododia;
    }

    public String getFx_et() {
        return fx_et;
    }

    public String getTipo_veic() {
        return tipo_veic;
    }

    public String getConsorcio() {
        return consorcio;
    }

    public VitimasPOA(String data_extracao, String longitude, String latitude, String idacidente, String data, String hora, String idade, String sexo, String sit_vitima, String log1, String log2, String predial1, String regiao, String tipo_acid, String auto, String taxi, String onibus_urb, String onibus_met, String onibus_int, String caminhao, String moto, String carroca, String bicicleta, String outro, String lotacao, String dia_sem, String periododia, String fx_et, String tipo_veic, String consorcio) {
        this.data_extracao = data_extracao;
        this.longitude = longitude;
        this.latitude = latitude;
        this.idacidente = idacidente;
        this.data = data;
        this.hora = hora;
        this.idade = idade;
        this.sexo = sexo;
        this.sit_vitima = sit_vitima;
        this.log1 = log1;
        this.log2 = log2;
        this.predial1 = predial1;
        this.regiao = regiao;
        this.tipo_acid = tipo_acid;
        this.auto = auto;
        this.taxi = taxi;
        this.onibus_urb = onibus_urb;
        this.onibus_met = onibus_met;
        this.onibus_int = onibus_int;
        this.caminhao = caminhao;
        this.moto = moto;
        this.carroca = carroca;
        this.bicicleta = bicicleta;
        this.outro = outro;
        this.lotacao = lotacao;
        this.dia_sem = dia_sem;
        this.periododia = periododia;
        this.fx_et = fx_et;
        this.tipo_veic = tipo_veic;
        this.consorcio = consorcio;
    }

    public String getLog1() {
        return log1;
    }

    @Override
    public String toString() {
        return "VitimasPOA [" +
                "data_extracao='" + data_extracao + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", idacidente=" + idacidente +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", sit_vitima='" + sit_vitima + '\'' +
                ", log1='" + log1 + '\'' +
                ", log2='" + log2 + '\'' +
                ", predial1=" + predial1 +
                ", regiao='" + regiao + '\'' +
                ", tipo_acid='" + tipo_acid + '\'' +
                ", auto=" + auto +
                ", taxi=" + taxi +
                ", onibus_urb=" + onibus_urb +
                ", onibus_met=" + onibus_met +
                ", onibus_int=" + onibus_int +
                ", caminhao=" + caminhao +
                ", moto=" + moto +
                ", carroca=" + carroca +
                ", bicicleta=" + bicicleta +
                ", outro=" + outro +
                ", lotacao=" + lotacao +
                ", dia_sem='" + dia_sem + '\'' +
                ", periododia='" + periododia + '\'' +
                ", fx_et='" + fx_et + '\'' +
                ", tipo_veic='" + tipo_veic + '\'' +
                ", consorcio='" + consorcio + '\'' +
                ']' + "\n";
    }
}
