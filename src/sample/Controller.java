package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Controller {

    // A reference to the ImageView component created in the sample.fxml file.
    // Used to display the chosen card to the user
    public ImageView imageView;

    /**
     *------------------- Brief Introduction and Credits -------------------------------
     *
     * Hello, I'm Anguel Esperanza and here's a simple card generator I made that pulls a playing card from a pull of playing cards
     * and displays it to the user. I've done my best to document all the functionality of the code.
     *
     * All the cards used in the project are under public domain and can be found here:
     *
     * http://byronknoll.blogspot.com/2011/03/vector-playing-cards.html
     *
     * You are free to do what you want with this poject, make money off it, improve upon it, use it in your own project.
     * I place no restrictions on this what you chose to do with this program.
     * I only ask that you credit me for making this program (not the cards as I did not make those)
     *
     * With that said, I hope you all enjoy this program and learn something from it.
     * I have a blog and a YouTube channel. If you like what you see here, I have many more programing posts and videos.
     *
     * Bloc: https://tacodesu.wordpress.com/
     * YouTube: https://www.youtube.com/channel/UC5iru05mdTsKu46Hp1xvJQA
     *
     * ---------------- CODE EXPLANATION BELOW ---------------------------------------
     *
     * All Heart Cards
     * Each Card is assigned the location of the image 'imageDir'.
     * This is located in the sample folder, which has another folder called Cards.
     * sample --> Cards
     *
     * All of the cards word in the exact same way.
     */
    Card aceOfHearts = new Card("sample\\Cards\\ace_of_hearts.png");
    Card twoOfHearts = new Card("sample\\Cards\\2_of_hearts.png");
    Card threeOfHearts = new Card("sample\\Cards\\3_of_hearts.png");
    Card fourOfHearts = new Card("sample\\Cards\\4_of_hearts.png");
    Card fiveOfHearts = new Card("sample\\Cards\\5_of_hearts.png");
    Card sixOfHearts = new Card("sample\\Cards\\6_of_hearts.png");
    Card sevenOfHearts = new Card("sample\\Cards\\7_of_hearts.png");
    Card eightOfHearts = new Card("sample\\Cards\\8_of_hearts.png");
    Card nineOfHearts = new Card("sample\\Cards\\9_of_hearts.png");
    Card tenOfHearts = new Card("sample\\Cards\\10_of_hearts.png");
    Card jackOfHearts = new Card("sample\\Cards\\jack_of_hearts.png");
    Card kingOfHearts = new Card("sample\\Cards\\king_of_hearts.png");
    Card queenOfHearts = new Card("sample\\Cards\\queen_of_hearts.png");

    // All Clubs Cards
    Card aceOfClubs = new Card("sample\\Cards\\ace_of_clubs.png");
    Card twoOfClubs = new Card("sample\\Cards\\2_of_clubs.png");
    Card threeOfClubs = new Card("sample\\Cards\\3_of_clubs.png");
    Card fourOfClubs = new Card("sample\\Cards\\4_of_clubs.png");
    Card fiveOfClubs = new Card("sample\\Cards\\5_of_clubs.png");
    Card sixOfClubs = new Card("sample\\Cards\\6_of_clubs.png");
    Card sevenOfClubs = new Card("sample\\Cards\\7_of_clubs.png");
    Card eightOfClubs = new Card("sample\\Cards\\8_of_clubs.png");
    Card nineOfClubs = new Card("sample\\Cards\\9_of_clubs.png");
    Card tenOfClubs = new Card("sample\\Cards\\10_of_clubs.png");
    Card jackOfClubs = new Card("sample\\Cards\\jack_of_clubs.png");
    Card kingOfClubs = new Card("sample\\Cards\\king_of_clubs.png");
    Card queenOfClubs = new Card("sample\\Cards\\queen_of_clubs.png");

    // All Spades Cards
    Card aceOfSpades = new Card("sample\\Cards\\ace_of_spades.png");
    Card twoOfSpades = new Card("sample\\Cards\\2_of_spades.png");
    Card threeOfSpades = new Card("sample\\Cards\\3_of_spades.png");
    Card fourOfSpades = new Card("sample\\Cards\\4_of_spades.png");
    Card fiveOfSpades = new Card("sample\\Cards\\5_of_spades.png");
    Card sixOfSpades = new Card("sample\\Cards\\6_of_spades.png");
    Card sevenOfSpades = new Card("sample\\Cards\\7_of_spades.png");
    Card eightOfSpades = new Card("sample\\Cards\\8_of_spades.png");
    Card nineOfSpades = new Card("sample\\Cards\\9_of_spades.png");
    Card tenOfSpades = new Card("sample\\Cards\\10_of_spades.png");
    Card jackOfSpades = new Card("sample\\Cards\\jack_of_spades.png");
    Card kingOfSpades = new Card("sample\\Cards\\king_of_spades.png");
    Card queenOfSpades = new Card("sample\\Cards\\queen_of_spades.png");

    // All Diamonds Cards
    Card aceOfDiamonds = new Card("sample\\Cards\\ace_of_diamonds.png");
    Card twoOfDiamonds = new Card("sample\\Cards\\2_of_diamonds.png");
    Card threeOfDiamonds = new Card("sample\\Cards\\3_of_diamonds.png");
    Card fourOfDiamonds = new Card("sample\\Cards\\4_of_diamonds.png");
    Card fiveOfDiamonds = new Card("sample\\Cards\\5_of_diamonds.png");
    Card sixOfDiamonds = new Card("sample\\Cards\\6_of_diamonds.png");
    Card sevenOfDiamonds = new Card("sample\\Cards\\7_of_diamonds.png");
    Card eightOfDiamonds = new Card("sample\\Cards\\8_of_diamonds.png");
    Card nineOfDiamonds = new Card("sample\\Cards\\9_of_diamonds.png");
    Card tenOfDiamonds = new Card("sample\\Cards\\10_of_diamonds.png");
    Card jackOfDiamonds = new Card("sample\\Cards\\jack_of_diamonds.png");
    Card kingOfDiamonds = new Card("sample\\Cards\\king_of_diamonds.png");
    Card queenOfDiamonds = new Card("sample\\Cards\\queen_of_diamonds.png");


    /**
     * This is an array that called 'deck'.
     * This array contains all 52 cards that were created above. This is used in the 'newCard'.
     * Each line is separated into the different suits.
     * 1) Hearts
     * 2) Clubs
     * 3) Spades
     * 4) Diamonds
     */

    Card [] deck =
            {
              aceOfHearts, twoOfHearts, threeOfHearts, fourOfHearts, fiveOfHearts, sixOfHearts, sevenOfHearts, eightOfHearts, nineOfHearts, tenOfHearts, jackOfHearts, kingOfHearts, queenOfHearts,
                    aceOfClubs, twoOfClubs, threeOfClubs, fourOfClubs, fiveOfClubs, sixOfClubs, sevenOfClubs, eightOfClubs, nineOfClubs, tenOfClubs, jackOfClubs, kingOfClubs, queenOfClubs,
                    aceOfSpades, twoOfSpades, threeOfSpades, fourOfSpades, fiveOfSpades, sixOfSpades, sevenOfSpades, eightOfSpades, nineOfSpades, tenOfSpades, jackOfSpades, kingOfSpades, queenOfSpades,
                    aceOfDiamonds, twoOfDiamonds, threeOfDiamonds, fourOfDiamonds, fiveOfDiamonds, sixOfDiamonds, sevenOfDiamonds, eightOfDiamonds, nineOfDiamonds, tenOfDiamonds, jackOfDiamonds, kingOfDiamonds, queenOfDiamonds
            };


    /**
     * This method is used to generate a new card upon each click.
     * It generated a random number between 0 and 52.
     * Since the 'Random' class is being used, I stored the random number created into an int variable called 'randomNumber'
     * |---> (rand (the number generated by the Random class) could not be used by the array since it's not an int. Type casting did not as well, so I stored it into an int variable instead)
     * Rather than cycling through the 'deck' array, since I had a number that is between 0 and 52 (the total number of cards) I decided to just grab that the card that is at the random position.
     * |---> I.E: rand -- > 4; 4 --> randomNumber; randomNumber --> tenOfHearts --> tenOfHearts gets displayed to the screen
     */
    public void newCard() {


        Random rand = new Random(); // Makes a new random number using the Random class

        int randomNumber = rand.nextInt(52) + 1; // Stores random number to an int variable to use for the 'deck' array


        Image cardImage = new Image(deck[randomNumber].imageDir); // Grabs the image directory of the card in the 'deck' array chosen by the random number

        imageView.setImage(cardImage); // Displays the chosen card to the user

    }
}
