package List;

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
    public boolean add2 (final String element) throws Exception{
            aumentaCapacidade();
            if(size < elements.length){
                elements[size] = element;
                size++;
                return true;
            }
            else {
                return false;
            }
    }

    private void aumentaCapacidade(){
        if(size == elements.length){
            String[] newElements = new String[elements.length * 2];

            for(int i=0; i<elements.length; i++){
                newElements[i] = elements[i];
            }

            elements = newElements;

        }
    }


}
