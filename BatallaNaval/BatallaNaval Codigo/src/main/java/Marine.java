public class Marine {
    private String name;
    private String range;
    private boolean EnUso;
    private Navy navy;

    public Marine(String name, String  range,boolean EnUso,Navy navy) {
        this.name = name;
        this.range = range;
        this.EnUso = EnUso;
        this.navy = navy;
    }

    public String getRange() {
        return range;
    }

    public String getName() {
        return name;
    }
    public boolean isEnUso() {
        return EnUso;
    }

    public boolean isEnUsoCambiar() {
        return EnUso = true;
    }
}
