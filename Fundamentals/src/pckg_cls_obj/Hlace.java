package pckg_cls_obj;

public class Hlace {

    private String model;
    private boolean ciste;

    public Hlace(String model) {
        this.model = model;
        this.ciste = true;
    }

    public boolean isCiste() {
        return ciste;
    }

    public void setCiste(boolean ciste) {
        this.ciste = ciste;
    }

    /*
        public boolean getCiste(){
            return ciste;
        }

        public void setCiste(boolean setValue) {
            this.ciste = setValue;
        }
    */
    public void koristeneHlace() {
        this.ciste = false;
    }

    public Hlace nekakoOciscene(Student student) {
        return student.operiMe(this);
    }
}
