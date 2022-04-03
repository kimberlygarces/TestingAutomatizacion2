package co.com.choucair.certification.proyectoBase.questions;

import co.com.choucair.certification.proyectoBase.model.RespuestaFinal;
import co.com.choucair.certification.proyectoBase.userinterface.PageFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {
    private List<RespuestaFinal> question;

    public Answer(List<RespuestaFinal> question) {
        this.question = question;
    }

    public static Answer toThe(List<RespuestaFinal> question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String respuesta = Text.of(PageFinal.FINAL).viewedBy(actor).asString();
        if (question.get(0).getStr_respuestafinal().equals(respuesta)) {
            result = true;

        } else {
            result = false;
        }
        return result;
    }
}
