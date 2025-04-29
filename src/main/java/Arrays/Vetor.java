package Arrays;

public class Vetor {

    public String[] elements;
    public int size;

    public Vetor(final int capacity) {
        this.elements = new String[capacity];
        this.size = 0;
    }

    //Version 1
    public void add (String element){
        for(int i=0; i < this.elements.length; i++){
            if (this.elements[i] == null){
                this.elements[i] = element;
                break;
            }
        }
    }

    //Version 2
    public void add2 (final String element) throws Exception{
            if(size < elements.length){
                elements[size] = element;
                size++;
            }
            else {
                throw new Exception("Vetor cheio!");
            }
    }

    private void aumentaCapacidade(){
        if(size == elements.length){
            String[] newElements = new String[elements.length * 2];

            for(int i=0; i<elements.length; i++){
                newElements[i] = elements[i];
            }

        }
    }


}
