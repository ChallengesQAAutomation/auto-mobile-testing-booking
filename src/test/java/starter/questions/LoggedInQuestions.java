package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoggedInQuestions implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return "hola";//LoggedInAreaView.welcomeText.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new LoggedInQuestions();
    }
}
