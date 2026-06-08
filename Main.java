public class Main {

    public static void main(String[] args) {

        
        MusicalInstrument piano = new MusicalInstrument(101,3000,"Keyboard Instrument","Yamaha");

        
        MusicalInstrument drum = new MusicalInstrument(102,1500,"Percussion Instrument","Roland");

        
        MusicalInstrument guitar = new MusicalInstrument(103,2000,"String Instrument","Fender");

        
        piano.displayPiano();

        System.out.println();

        drum.displayDrum();

        System.out.println();

        guitar.displayGuitar();
    }
}
