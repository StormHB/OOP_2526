package pckg_arr_1;

public class MainAapp {

    public static void main (String[] args) {
        String [] names = {"Stjepan", "Marija", "Ivana", "Branko", "Tihana"};
        Student[] studenti = AUX_CLS.genStudentFromNames(names);
        AUX_CLS.printStudentFromArr(studenti);
        System.out.println("___________________________");
        AUX_CLS.printElementsFromArray(studenti);
        String[] profNames = {"Vlatko", "Katarina", "Marino", "Teo", "Gorana"};
        Profesor[] profesori = AUX_CLS.genProfsFromNames(profNames);
        AUX_CLS.printElementsFromArray(profesori);
    }
}
