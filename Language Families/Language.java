public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionSpoken = regionSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }

    public void setNumSpeakers(int inputNumSpeakers) {
        this.numSpeakers = inputNumSpeakers;
    }

    public void setRegion(String inputRegion) {
        this.regionSpoken = inputRegion;
    }

    public void setWordOrder(String inputWordOrder) {
        this.wordOrder = inputWordOrder;
    }

    public static void main(String[] args) {
        Language japanese = new Language("Japanese", 	123294513, "Japan", "subject-verb-object");
        japanese.getInfo();

        System.out.println();

        Language achi = new Mayan("Achi", 39870);
        achi.getInfo();

        System.out.println();

        Language mandarin = new SinoTibetan("Mandarin Chinese", 1000000000);
        mandarin.getInfo();

        System.out.println();

        SinoTibetan burmese = new SinoTibetan("Burmese", 38800000);
        burmese.getInfo();

    }
}
