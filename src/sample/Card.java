package sample;

/**
 * Created by Anguel Esperanza on 3/30/2017.
 */
public class Card {


    /**
     * A ssmall class with one field variable and a consturctor.
     * Every new card created in the Controller.java (the class with the long list of cards) will be forced to take on paremeter.
     * That is the directory of the image.
     *
     * 'this.imageDir' referes to the imageDir variable underneath this green block comment.
     * 'imageDir' refers to the imageDir variable inside the parentheses.
     *
     * This will take the image directory that's in the parenthesis, and store it inside 'this.imageDir'
     */

    String imageDir; //this.imageDir

    public Card(String imageDir) {
        this.imageDir = imageDir;
    }

}
