package List;

public class teste {
    public static void main(String[] args) {

    Vetor names = new Vetor(3);

    try {
        names.add2("Chaves");
        names.add2("Chaves");
        names.add2("Chaves");
        names.add2("Chaves");
    }catch (Exception e){
        e.printStackTrace();
    }


    }
}
