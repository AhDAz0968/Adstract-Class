class MusicalInstrument{
    private int id;
    private int price;
    private String category;
    private String brand;

    public MusicalInstrument(int id, int price, String category, String brand){
        this.id = id;
        this.price = price;
        this.category = category;
        this.brand = brand;
    }

    //setter
    public void setId(int id){
        this.id = id;
    } 
    public void setPrice(int price){
        this.price = price;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    //getter
    public int getId(){
        return id;
    }
    public int getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public String getBrand(){
        return brand;
    }

    //piano(inner class)
    class Piano{
        public void display(){
            System.out.println("-----Piano-----");
            System.out.println("ID: " + id);
            System.out.println("Price: " + price);
            System.out.println("category " + category);
            System.out.println("Brand " + brand);
        }
    }

    public void displayPiano(){
        Piano p = new Piano();
        p.display();
    }

    //drum(local class)
    public void displayDrum(){
        class Drum{
        public void display(){
            System.out.println("-----Drum-----");
            System.out.println("ID: " + id);
            System.out.println("Price: " + price);
            System.out.println("category " + category);
            System.out.println("Brand " + brand);
        }
    }

        Drum d = new Drum();
        d.display();
    }
    
    //absract class
    abstract class Guitar{
        abstract void display();
    }

    //anonymous inner class
    public void displayGuitar(){
        Guitar g = new Guitar() {
            @Override
            void display() {
                System.out.println("-----Guitar-----");
                System.out.println("ID: " + id);
                System.out.println("Price: " + price);
                System.out.println("Category: " + category);
                System.out.println("Brand: " + brand);
            }
        };
        g.display();
    }
}