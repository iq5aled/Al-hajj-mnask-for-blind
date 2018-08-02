package al.hajj.mnask.pkgfor.blind;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javazoom.jl.decoder.JavaLayerException;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
 TextToSpeech tts = new TextToSpeech();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       

        //Print all the available voices
        tts.getAvailableVoices().stream().forEach(voice -> System.out.println("Voice: " + voice));

        // Setting the Current Voice
        tts.setVoice("cmu-rms-hsmm");

        // TTS say something that we actually are typing into the first variable
        tts.speak("Welcome to Alhajj Mnask for blind ", 2.0f, false, true);
    }

    @FXML
    private void p1Action(ActionEvent event) {
      //  TextToSpeech tts = new TextToSpeech();

        //Print all the available voices
        tts.getAvailableVoices().stream().forEach(voice -> System.out.println("Voice: " + voice));

        // Setting the Current Voice
        tts.setVoice("cmu-rms-hsmm");

        // TTS say something that we actually are typing into the first variable
        tts.speak(" In the forenoon of the eighth day of Dhul-Hijjah "
                + " the pilgrim should purify himself once again by bathing, "
                + "as he did before ‘Umrah, in the place where he is staying "
                + "if convenient. He should put on his Ihraam and say:"
                + " “Labbaika Hajjan. Labbaik-Allahumma Labbaik. Lab-baika laa"
                + " shareeka laka labbaik. Inn-al-hamda wan-ni’mata laka wal-mulk."
                + " Laa shareeka lak.” “Here I am at your service for Hajj. Here I "
                + "am at your service, oh Allah, here I am at your service. Here I "
                + "am at your service. You have no partner. Here I am at your service. "
                + "Surely all praise, grace and dominion is yours, and you have no partners.” "
                + "If he fears that something will prevent him from completing his Hajj he should "
                + "make a condition when he makes his intentions, saying"
                + "Wa in habasani haabisun, fa mahalli haythu habastani.” "
                + "“If I am prevented by any obstacle, my place is wherever I am held up.”"
                + "If he has no such fear, he does not make this condition.21A pilgrim should"
                + " then proceed to Minaa, and there he should pray "
                + "the Dhuhr, ‘Asr, Maghrib, ‘Ishaa and Fajr prayer, "
                + "shortening his four unit prayers so as to make them two units each,"
                + " but without combining them.22When the sun rises, he should proceed to ‘Arafah,"
                + " and there he should combine the Dhuhr and ‘Asr prayer at the time of Dhuhr,"
                + " making each one two units. He should remain in the Masjid of Namirah until sunset if possible."
                + " He should mention Allah and make as many supplications as possible while facing the Qiblah"
                + ".The Prophet  prayed thus:"
                + "“Laa Ilaaha ill-Allah wahdahu laa shareeka lah. Lah-ul-Mulku wa lah-ul-hamd,"
                + " wa Huwa ‘alaa kulli shay`in Qadeer.” "
                + "“There is no Deity but Allah alone. He has no partner."
                + " All dominion and praise are His, and He is powerful over all things.”"
                + "", 2.0f, false, true);

    }

    @FXML
    private void p2Action(ActionEvent event) {
          tts.getAvailableVoices().stream().forEach(voice -> System.out.println("Voice: " + voice));

        // Setting the Current Voice
        tts.setVoice("cmu-rms-hsmm");

        // TTS say something that we actually are typing into the first variable
  tts.speak("If he grows weary, it is permissible for him to engage in beneficial "
          + "conversation with his companions or reading what he can find of beneficial books,"
          + " especially those concerning Allah’s Grace and abundant gifts. "
          + "This will strengthen his hope in Allah."
          + "He should then return to his supplications and be sure to spend the end of the day deep in supplication"
          + " because the best of sup-plication is the supplication of the day of Arafah."
          + "At sunset he goes from Arafah to Muzdalifah, and there prays Maghrib, ‘Ishaa, and Fajr. "
          + "If he is tired or has little water, it is permissible for him to combine the Maghrib and ‘Ishaa prayers. "
          + "If he fears that he will not reach Muzdalifah until after midnight,"
          + " he should pray before he reaches it for it is not permissible to delay "
          + "‘Ishaa prayer until after midnight. He should remain there in Muzdalifah,"
          + " making supplication and mentioning Allah till just before sunrise."
          + "If he is weak and cannot handle the crowd during ar-Ramy (Ar-Ramy is the stoning of the Jamaraat.),23 it is permissible for him to go to Minaa at "
          + "the end of the night to stone the Jamrah before the arrival of the crowd.Near sunrise,"
          + " a pilgrim goes from Muzdalifah to Minaa. "
          + "Upon reaching it he should do the following. "
          + "a) He should throw seven consecutive pebbles at Jamrah al-‘Aqabah which is the closest monument to"
          + " Makkah, saying, “Al-lahu Akbar,” with each throw. "
          + " b) He should slaughter the sacrificial animal, eat some of it, and give some to the poor."
          + " Slaughtering is obligatory on the Muta-mati’ and the Qaarin.24"
          + "c) He should shave or clip his hair, while shaving is preferable. A woman should clip her hair"
          + " the length of a finger tip."
          + "These three should be done in the above order if convenient, "
          + "but there is no restriction if one precedes another."
          + "", 2.0f, false, true);
    }

    @FXML
    private void p3Action(ActionEvent event) {
          tts.getAvailableVoices().stream().forEach(voice -> System.out.println("Voice: " + voice));

        // Setting the Current Voice
        tts.setVoice("cmu-rms-hsmm");

        // TTS say something that we actually are typing into the first variable
        tts.speak("With that, one is allowed to come out of Ihraam."
                + " He may wear other clothing and do everything that was lawful before the Ihraam, "
                + "except engaging in marital relations.He should then go to Makkah to perform Tawaaf al-Ifaadah"
                + " and the Sa’yi of Hajj [if he had not performed the Sa’yi of Hajj upon entering Makkah]."
                + " It is Sunnah to perfume oneself on before go-ing to Makkah.With the completion of this Tawaaf and Sa’yi,"
                + " a pilgrim is allowed to do everything that was lawful before Ihraam, "
                + "including engag-ing in marital relations.After performing Tawaaf and Sa’yi, "
                + "he should return to Minaa to spend the nights of the eleventh and twelfth days there. "
                + "He stones the three Jamaraat in the afternoon of both the elev-enth and twelfth days."
                + " He starts with the first Jamrah, which is furthest from Makkah, then the middle one,"
                + " and lastly Jamrah al-‘Aqabah. Each one should be stoned consecutively with seven pebbles,"
                + " accompanied by the Takbeer.25 He should stop after the first and middle Jamrah to make supplication "
                + "while facing the Qiblah. It is not permissible to stone before noon on these two days. "
                + "It is also best to walk to the Jamrah, but riding is permissi-ble."
                + "If one is in a hurry after the stoning on the twelfth day, he may leave Minaa before sunset."
                + " But if they wish to prolong their stay, which is best, "
                + "they should spend the night of the thirteenth in Minaa and stone the Jamaraat that afternoon in "
                + "the same manner as on the twelfth day.When they are ready to return to their country, "
                + "they should make Tawaaf al-Wadaa’,26 which is seven circuits around the Ka’bah. "
                + "Menstruating women and women experiencing postnatal dis-charge are not obligated to"
                + " perform Tawaaf al-Wadaa’."
                + "", 2.0f, false, true);
    }

}
