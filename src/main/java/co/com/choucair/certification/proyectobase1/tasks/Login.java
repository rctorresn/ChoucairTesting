package co.com.choucair.certification.proyectobase1.tasks;

import co.com.choucair.certification.proyectobase1.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Login implements Task {

    private String srtUser;
    private String strPassword;
    public Login(String srtUser, String strPassword){
        this.srtUser = srtUser;
        this.strPassword = strPassword;
    }

    public static Login OnThePage(String srtUser, String strPassword) {
        return Tasks.instrumented(Login.class, srtUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(srtUser).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON));

    }
}
